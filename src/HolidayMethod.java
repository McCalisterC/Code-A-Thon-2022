//Caleb Karp
//This method prompts the user to enter data to generate holiday greeting cards
import java.util.Scanner;
public class HolidayMethod {
    public static void HolidayExecute() {
        Scanner input = new Scanner(System.in);
        //variables for the constructor
        String Holiday;
        String senderName;
        String senderEmail;
        String receiver;
        String receiverEmail;
        String sig; //signature
        HolidayGreeting.numCards = 0;
        int gift;
        int fam;
        int total;  //size of array
        int choice;

        //Prompt user for number of cards
        System.out.print("How many Holiday Greeting Cards will you be sending?: ");
        total = input.nextInt();
        //Use number of cards to initialize an array
        HolidayGreeting[] list = new HolidayGreeting[total];
        input.nextLine();


        //Prompt user for their name
        System.out.print("Let's make an electronic Holiday Greeting. Please start by entering your name: ");
        senderName = input.nextLine();
        //prompt user for their email
        System.out.print("Next, enter your email: ");
        senderEmail = input.nextLine();
        //prompt user for holiday
        System.out.print("Next, we need to know what holiday you are sending a greeting for: ");
        Holiday = input.nextLine();
        //find if the greeting is from just the user or their whole family
        System.out.print("Is this card from just you or your whole family, 0 for you 1 for the whole family: ");
        fam = input.nextInt();
        if (fam == 0) {
            HolidayGreeting.family = false;
        }else{
            HolidayGreeting.family = true;
            input.nextLine();
            //Get user's family name
            System.out.print("Enter your last name: ");
            HolidayGreeting.lastName = input.nextLine();
        }
        //Prompt user for signature line
        System.out.print("Would you like to provide a signature for all of your emails? 0 for no 1 for yes: ");
        choice = input.nextInt();
        if (choice == 0){
            sig = " ";
            HolidayGreeting.signature = sig;
        }else {
            input.nextLine();
            System.out.print("Enter your signature: ");
            sig = input.nextLine();
            System.out.print("Press any key to confirm: "); //This line helps with an input buffering issue with the signature line

            HolidayGreeting.signature = sig;
            System.out.println();
        }

        //Create a for loop to get the recipients name and email
        for (int i = 0; i < total; i++) {
            input.nextLine();
            System.out.print("Next, enter in the name of the person receiving the Greeting: ");
            receiver = input.nextLine();
            System.out.print("Next, we will need " + receiver + "'s email: ");
            receiverEmail = input.nextLine();

            //Asks the user if they would like to add a gift to this greeting
            System.out.print("Would you like to include a gift? 0 for no 1 for yes: ");
            gift = input.nextInt();
            if (gift == 0) {
                HolidayGreeting.holidayGift = false;
            } else {
                HolidayGreeting.holidayGift = true;
                input.nextLine();
                System.out.print("Enter your gift amount: ");
                HolidayGreeting.giftAmount = input.nextDouble();
            }





            //create and display the greeting
            list[i] = new HolidayGreeting(Holiday, HolidayGreeting.family, senderName, senderEmail, receiver, receiverEmail, HolidayGreeting.signature, HolidayGreeting.holidayGift);
            System.out.println();
            System.out.println(list[i].toString());
            System.out.println();
            System.out.println(HolidayGreeting.signature);

        }// end loop





    }
}