//Caleb Karp
import java.util.Scanner;
public class HolidayGreeting extends Email {
    Scanner input = new Scanner(System.in);
    //date fields
    public static int numCards;
    public static String holiday;
    public static boolean family;
    public static boolean holidayGift;
    public static double giftAmount;
    public static String lastName;
    public static String cardBody;

    //Constructors
    HolidayGreeting(String holiday, Boolean family, String sender1, String senderEmail1, String recipient, String recipientEmails, String signature1, boolean holidayGift){
        super(sender1, senderEmail1, recipient, recipientEmails, signature1);
        this.holiday = holiday;
        this.family = family;
        this.holidayGift = holidayGift;
        numCards++;
    }

    public HolidayGreeting(String recipient, String recipientEmails){
        super(recipient,recipientEmails);
        numCards++;
    }
    //Getter and Setter methods
    public String getHoliday(){return holiday;}
    public void setHoliday(String newHoliday){
        holiday = newHoliday;
    }
    public static boolean getFamily(){return family;}
    public static void setFamily(boolean newFamily){
        family = newFamily;
    }
    public static String getGreeting(){
        if (getFamily() == false)
            return sender;
        else
            return "The " + sender + " Family ";

    }
    public double getGiftAmount(){return giftAmount;}

    //Method to create the body of the greeting card based on values input by the user
    public String getCardBody(){
        if ((holidayGift == true) && (family == true))
            cardBody = "Dear " + getRecipient() + "\n" + "\n" + "Season's greetings " + getRecipient() + " Happy " + holiday + "!" + " From the " + lastName + " family here have $" + giftAmount  +
                    "\nto make your " + holiday + " even sweeter!" + "\n\n" + "Sincerely, " + "\n" + sender;
        else if ((holidayGift == true) && (family == false))
            cardBody = "Dear " + getRecipient() + "\n" + "\n" + "Season's greetings " + getRecipient() + " Happy " + holiday + "!" + " From " + getGreeting() + " here have $" + giftAmount  +
                    "\nto make your " + holiday + " even sweeter!"  + "\n\n" + "Sincerely, " + "\n" + sender;
        else if ((holidayGift == false) && (family == true))
            cardBody = "Dear " + getRecipient() + "\n" + "\n" + "Season's greetings " + getRecipient() + " Happy " + holiday + "!" + " From the " + lastName + " family!" + "\n\n" + "Sincerely, " + "\n" + sender;
        else if ((holidayGift == false) && (family == false))
            cardBody = "Dear " + getRecipient() + "\n" + "\n" + "Season's greetings " + getRecipient() + " Happy " + holiday + "!" + " From " + getGreeting() + "!\n\n" + "Sincerely, " + "\n" + sender;
        return cardBody; // this variable contains the body of the greeting

    }

    @Override
    public String toString(){return getCardBody();} //toString method to display the body of the greeting.

}