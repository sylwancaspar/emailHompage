package se.casparsylwan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.casparsylwan.bean.Mail;
import se.casparsylwan.services.MailService;

@RestController
@RequestMapping("/api/v1/mail/")
public class EmailController {

	MailService service;

    public EmailController(MailService service) {
        this.service = service;
    }
    
    @PostMapping("/send")
    public ResponseEntity<String> sendMail(@RequestBody Mail mail) {
        service.sendMail(mail);
        return new ResponseEntity<>("Email Sent successfully", HttpStatus.OK);
    }
}
