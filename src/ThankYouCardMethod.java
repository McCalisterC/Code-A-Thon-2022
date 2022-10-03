//Main execute for the ThankYouCard class
import java.util.Scanner;
import java.util.ArrayList;
public class ThankYouCardMethod {
    public static void ThankYouCardExecute() {
        Scanner input = new Scanner(System.in);

        //temp variables for the loop
        String events;
        String senderName;
        String senderEmail;
        String receiver;
        String receiverEmail;
        String sig; //signature
        ThankYouCard.cardCounter = 0;
        int goBack; //variable to go back and edit a ThankYouCard

        //The array list of the objects
        ArrayList<ThankYouCard> tyCards = new ArrayList();

        //the first ThankYouCard object is created before the loop
        System.out.println("Let's make an electronic Thank You Card. Please start by entering your name: ");
        senderName = input.nextLine();
        System.out.println("Next, enter your email: ");
        senderEmail = input.nextLine();
        System.out.println("Next, enter in the name of the person receiving the Thank You: ");
        receiver = input.nextLine();
        System.out.println("Next, we will need "+ receiver +"'s email: ");
        receiverEmail = input.nextLine();
        System.out.println("Next, we need to know what event everyone has attended: ");
        events = input.nextLine();
        System.out.println("Finally, we need you to provide a signature for all of your emails: ");
        sig = input.nextLine();

        tyCards.add(new ThankYouCard(senderName,senderEmail,receiver,receiverEmail,sig,events));
        ThankYouCard.cardCounter++;


        //print out preview
        System.out.println("The current message is as follows: \n");
        tyCards.get(0).currentCard();
        System.out.println();
        System.out.println();



        int counter;
        for(int i = 1; i!= 0; i = counter) {

            userPrompt();
            counter = input.nextInt();

            input.nextLine();

            switch (counter){
                case 1:                                                                                                 //change current recipient's name
                    System.out.println("Recipient's new name: ");
                    receiver = input.nextLine();
                    tyCards.get(ThankYouCard.cardCounter - 1).setRecipient(receiver);
                    System.out.println();
                    break;
                case 2:                                                                                                 //change current recipient's email
                    System.out.println("Recipient's new email address: ");
                    receiverEmail = input.nextLine();
                    tyCards.get(ThankYouCard.cardCounter - 1).setRecipientEmails(receiverEmail);
                    System.out.println();
                    break;
                case 3:                                                                                                 //make a new ThankYouCard
                    System.out.println("Enter in the name of the next person receiving a Thank You: ");
                    receiver = input.nextLine();
                    System.out.println("Next, we will need "+ receiver +"'s email: ");
                    receiverEmail = input.nextLine();
                    tyCards.add(new ThankYouCard(receiver, receiverEmail));
                    ThankYouCard.cardCounter++;
                    System.out.println();
                    break;
                case 4:                                                                                                 //change signature
                    System.out.println("New signature: ");
                    Email.signature = input.nextLine();
                    System.out.println();
                    break;
                case 5:                                                                                                 //change sender name
                    System.out.println("Your name: ");
                    Email.sender = input.nextLine();
                    System.out.println();
                    break;
                case 6:                                                                                                 //change sender email
                    System.out.println("Your email: ");
                    Email.senderEmail = input.nextLine();
                    System.out.println();
                    break;
                case 7:                                                                                                 //change the event name
                    System.out.println("The event's new name: ");
                    ThankYouCard.eventName = input.nextLine();
                    System.out.println();
                    break;
                case 8:                                                                                                 //display the current card message
                    tyCards.get(ThankYouCard.cardCounter - 1).currentCard();
                    System.out.println();
                    break;
                case 11:                                                                                                //cancel the entire process
                    System.out.println("Goodbye...");
                    System.out.println();
                    System.exit(0);
                    break;
                case 9:                                                                                                 //display recipient list
                    for(int j = 0; j < ThankYouCard.cardCounter; j++){
                        System.out.print(j+ ") " + tyCards.get(j).getRecipient() + " - " +
                                tyCards.get(j).getRecipientEmails() + "\n");
                    }
                    System.out.println();
                    break;
                case 10:                                                                                                //change a specific recipients information
                    //list the recipients and how the computer reads them
                    System.out.println("The recipients are numbered as follows: ");
                    for(int j = 0; j < ThankYouCard.cardCounter; j++){
                        System.out.print(j+ ") " + tyCards.get(j).getRecipient() + " - " +
                                tyCards.get(j).getRecipientEmails() + "\n");
                    }
                    //determine which recipient to change
                    System.out.println("Which recipient would you like to edit?: ");
                    goBack = input.nextInt();
                    //have the ability to change recipients name and email
                    input.nextLine();
                    System.out.println("Recipient's new name: ");
                    receiver = input.nextLine();
                    tyCards.get(goBack).setRecipient(receiver);
                    System.out.println("Recipient's new email address: ");
                    receiverEmail = input.nextLine();
                    tyCards.get(goBack).setRecipientEmails(receiverEmail);
                    System.out.println();
                    break;
                case 0:
                    for (int j = 0; j < tyCards.size(); j++) {
                        tyCards.get(j).currentCard();
                        System.out.println("------------------------------------------------");
                    }
                    break;                                                                                              //end the loop
                default:
                    System.out.println("Input Error. Please select an option from the following list: ");
                    userPrompt();
                    break;
            }
        }

    }

    public static void userPrompt(){
        System.out.println("Here is a list of your additional options:");
        System.out.println("Please enter 1 to change the recipient's name: ");                                          //change information about the current recipient
        System.out.println("Please enter 2 to change the recipient's email address: ");
        System.out.println("Please enter 3 to add another recipient to the list: ");                                    //add a new recipient

        System.out.println("Please enter 4 to change your signature: ");                                                //change static variables
        System.out.println("Please enter 5 to change your name: ");
        System.out.println("Please enter 6 to change your email address: ");
        System.out.println("Please enter 7 to change the name of the event: ");
        System.out.println("Please enter 8 to see the preview of the Thank You Card: ");                                //end changing the static variables

        System.out.println("Please enter 9 if you would like to see your recipient list so far: ");                     //misc options
        System.out.println("Please enter 10 if you would like to go back and edit a recipient's information");
        System.out.println("Please enter 11 if you wish to abandon all of the Thank You Cards: ");
        System.out.println("Please enter 0 if your list is complete and there are no errors: ");
    }
}