package se.casparsylwan.bean;

import java.util.Date;
import java.util.List;

public class Mail {
	
	private String recipient = "casparsylwan@gmail.com";
    private String subject;
    private String message;

    public Mail() {
    }

    public Mail(String subject, String message) {
     
        this.subject = subject;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
