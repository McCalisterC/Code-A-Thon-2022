/*
Corbin McCalister
Establishes all the necessary data fields, methods, and
constructors for the Invitation class
 */

public class Invitations extends Email {
    //Variables
    public static String eventName;
    private int numOfCards;
    public static int cardCounter;
    public static String eventTime;
    public static String eventLocation;
    public static String extraInformation;

    //Constructor
    public Invitations(String sender1, String senderEmail1, String recipient, String recipientEmails, String signature1,
                       String eventName, String eventTime, String eventLocation , String extraInformation){
        super(sender1, senderEmail1, recipient, recipientEmails, signature1);
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.extraInformation = extraInformation;
        numOfCards++;
    }

    public Invitations(String recipient, String recipientEmails){
        super(recipient,recipientEmails);
        numOfCards++;
    }

    // Methods
    public int getNumOfCards(){return numOfCards;}   //user cannot change num of cards

    // display the current message
    public void currentCard(){
        System.out.println("To: " + getRecipientEmails() + "\nDear " + getRecipient()+ ",\n\nYou are invited to "+
                eventName+"! It would be great to see you there!\nEvent: " + eventName + "\nEvent Time: " + eventTime +
                "\nEvent Location: " + eventLocation + "\nExtra Information: " + extraInformation + "\n\nSincerely, \n"
                + signature);
    }
}
