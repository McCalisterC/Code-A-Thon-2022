/*
Corbin McCalister
Main execute that leads the user into each of the methods depending
on what the user needs.
 */
import java.util.Scanner;

public class MainExecute {
    public static void main(String[] args) {
        System.out.print("Please enter a number for the following options:\n");

        switch (Choice()){
            case 1:
                ThankYouCardMethod.ThankYouCardExecute();
                break;
            case 2:
                InvitationMethod.InvitationExecute();
                break;
            case 3:
                Professional.ProfessionalExecute();
                break;
            case 4:
                HolidayMethod.HolidayExecute();
                break;
            case 5:
                BusinessCardsMethod.BusinessCardExecute();
                break;
            case 0: break;
        }
    }

    public static int Choice(){
        Scanner input = new Scanner(System.in);
        System.out.println("1) Thank You Card");
        System.out.println("2) Invitations");
        System.out.println("3) Business Email");
        System.out.println("4) Holiday Card");
        System.out.println("5) Business Card");
        System.out.println("0) Exit");

        return input.nextInt();
    }
}
