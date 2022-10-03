//Ben Kuhlman
//The Thank-You card class that generates the card

//Choose to make Email parent or ThankYou Parent

class ThankYouCard extends Email {

    //Variables
    public static String eventName;
    private int numOfCards;
    public static int cardCounter;

    //Constructor
    public ThankYouCard(String sender1, String senderEmail1, String recipient, String recipientEmails, String signature1, String eventName_){
        super(sender1, senderEmail1, recipient, recipientEmails, signature1);
        eventName = eventName_;
        numOfCards++;
    }

    public ThankYouCard(String recipient, String recipientEmails){
        super(recipient,recipientEmails);
        numOfCards++;
    }

    // Methods
    public int getNumOfCards(){return numOfCards;}   //user cannot change num of cards

    // display the current message
    public void currentCard(){
        System.out.println("To: " + getRecipientEmails() + "\nDear " + getRecipient()+ ",\n\nThank you for attending "+ eventName+", it was really nice to see you celebrating with me.\n\nSincerely, \n"+ signature);
    }



}