//Clayton Webber
import java.util.Scanner;

public class BusinessCardsMethod {
    public static void BusinessCardExecute() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter your Email:");
        String email = input.nextLine();
        System.out.print("Enter you Company:");
        String company = input.nextLine();
        System.out.print("Enter address where your Company is:");
        String street = input.nextLine();
        System.out.print("Enter your Phone Number:");
        String phonenum = input.nextLine();
        System.out.print("Enter your Website:");
        String website = input.nextLine();
        System.out.print("Enter your tagline:");
        String tagline = input.nextLine();
        System.out.print("Enter your Job Title:");
        String jobtitle = input.nextLine();

        BusinessCards one = new BusinessCards(name, email, company, street, phonenum, website, tagline, jobtitle);
        one.isFront();
        System.out.println(one.toString());
        one.isBack();
        System.out.println(one.toString());



    }
}
