package com.example.FindDoc.controller;

// Import statements for required classes
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// This annotation specifies that this class is a REST controller and will handle HTTP requests
@RestController
// The @CrossOrigin annotation allows cross-origin requests from the specified URL, which is useful for development when frontend and backend run on different ports
@CrossOrigin(origins = "http://localhost:3000/")
public class FormController {

    // Autowiring the JavaMailSender bean to handle email sending
    @Autowired
    JavaMailSender mailSender;
    // This method handles POST requests to the "/send" endpoint
    @PostMapping("/send")
    // The @RequestBody annotation binds the HTTP request body to the ContactForm object
    public String sendEmail(@RequestBody ContactForm contactForm) {
        // Creating a SimpleMailMessage object to set up the email
        SimpleMailMessage message = new SimpleMailMessage();
        // Setting the recipient email address
        message.setTo("sabthagirisivakumar24@gmail.com");
        // Setting the subject of the email
        message.setSubject("New Contact Form Submission");
        // Formatting the email content with the details from the ContactForm object
        String emailContent = String.format(
                "Dear Admin,%n%n" +
                        "You have received a new contact form submission. Here are the details:%n%n" +
                        "Name: %s%n" +
                        "Email: %s%n" +
                        "Phone: %s%n%n" +
                        "Please reach out to the individual at your earliest convenience.%n%n" +
                        "Best Regards,%n" +
                        "Amazing Hospitals",
                contactForm.getName(), contactForm.getEmail(), contactForm.getPhone()
        );
        // Setting the email content
        message.setText(emailContent);
        // Sending the email using the mailSender
        mailSender.send(message);
        // Returning a success message
        return "Email Sent Successfully";
    }

    // A static inner class representing the contact form data structure
    public static class ContactForm {
        // Fields for name, email, and phone number
        private String name;
        private String email;
        private String phone;

        // Getter and setter methods for the name field
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and setter methods for the email field
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // Getter and setter methods for the phone field
        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}