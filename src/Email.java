/*
Corbin McCalister
Parent class that establishes all the common necessities of each
child class.
 */
public class Email {
    //Variables
    public static String sender;
    public static String senderEmail;
    private String recipient;
    private String recipientEmails;
    public static String signature;
    boolean frontOfCards;

    //Constructor
    public Email(){}
    public Email(String sender1, String senderEmail1, String recipient, String recipientEmails, String signature1){
        sender = sender1;
        senderEmail = senderEmail1;
        this.recipient = recipient;
        this.recipientEmails = recipientEmails;
        signature = signature1;
    }

    public Email(String recipient, String recipientEmail){
        this.recipient = recipient;
        this.recipientEmails = recipientEmail;
    }

    //Methods
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipientEmails() {
        return recipientEmails;
    }

    public void setRecipientEmails(String recipientEmails) {
        this.recipientEmails = recipientEmails;
    }

    public String getEmailBody(){return "This is a default email body!";}

    public boolean getFrontOfCard(){return frontOfCards = true;}
    public boolean getBackOfCard(){return frontOfCards = false; }
}

