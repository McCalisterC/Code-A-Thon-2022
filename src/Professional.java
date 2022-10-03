/*Audrey Tabler
This is the class and execute for the Professional emails class.
 */
import java.util.Scanner;

class Professional extends Email {
    public Scanner input = new Scanner(System.in);
    public String initialDate = "";
    public String deadline = "";
    private String bodyText = " ";
    private String type; //reminder, news, new meeting, meeting cancellation, vacation time
    private String topic;
    private String meetingLoc;
    private String meetingTime;



    //constructor for normal email
    public Professional(String sender, String senderEmail, String recipient, String recipientEmails, String signature) {
        super(sender,senderEmail, recipient, recipientEmails,signature);
        setType();
        System.out.println("Body text is: " + bodyText);

    }


    public String getEmailBody() {return bodyText;}
    public String getTopic(){return topic;}
    public String getMeetingLoc(){return meetingLoc;}
    public String getMeetingTime(){return meetingTime;}
    public String getType(){return type;}
    public String getDeadline(){return deadline;}

    public void setDeadline(String deadline){this.deadline = deadline;}
    public void setType(){
        int validInput = -1;
        System.out.println("Please enter one of the following as to what this email is in regards to:");
        while (validInput == -1) {
            if (validInput == -1) {
                System.out.println("Project Reminder | New Meeting | Meeting Cancelled | Vacation Time Request ");
                type = input.nextLine().toLowerCase();
                if (type.equals("project reminder") || type.equals("new meeting") || type.equals("meeting cancelled") || type.equals("vacation time request"))
                    validInput++;
                else
                    System.out.println("Invalid input-- please enter one of the displayed options exactly: ");
            }
        }

        if (type.equals("project reminder")) {
            System.out.print("What project is this email in regards to? : ");
            topic = input.nextLine();
            System.out.print("What date is this project due on? : ");
            deadline = input.nextLine();
            bodyText = "This is a reminder that " + topic + " is due on " + deadline + ". ";
        } else if (type.equals("new meeting")) {

            System.out.print("What time is this meeting at? ");
            meetingTime = input.nextLine();
            System.out.print("What is the date that this meeting is taking place at? ");
            deadline = input.nextLine();
            System.out.print("Where will this meeting be located? ");
            meetingLoc = input.nextLine();
            System.out.print("What is this meeting in regards to? ");
            topic = input.nextLine();

            bodyText = "New meeting has been scheduled at " + meetingLoc + " on the date of " + deadline + " at " + meetingTime + " regarding " + getTopic() + ". \nLet us know if you will be unable to attend.";
        } else if (type.equals("meeting cancelled")) {
            System.out.print("What time was this meeting at? ");
            meetingTime = input.nextLine();
            System.out.print("Where was this meeting to be located? ");
            meetingLoc = input.nextLine();
            System.out.print("What was this meeting in regards to? ");
            topic = input.nextLine();
            bodyText = "The meeting regarding " + topic + " at " + meetingLoc + " on the date of " + deadline + " at " + meetingTime + " has been cancelled. \n Apologies for the inconvenience and we hope the rest of your day goes well!";
        }
        else if (type.equals("vacation time request")) {
            int user = -1;
            String userinput;
            while (user == -1) {
                System.out.print("Are you requesting multiple sequential days off? ");
                userinput = input.nextLine();
                if ((userinput.toLowerCase().equals("yes")) || (userinput.toLowerCase().equals("y"))) {
                    user++;
                    System.out.print("Enter date of first day you would like to request off in this sequence: ");
                    String firstDate = input.nextLine();
                    System.out.print("Enter date of next day you would like to request off: ");
                    bodyText = ("I would like to request vacation time starting from " + firstDate + " through the date of " + userinput + ". Let me know if this will be suitable! ");

                } else if (userinput.toLowerCase().equals("no") || (userinput.toLowerCase().equals("n"))) {
                    user++;
                    System.out.println("Enter date of day you would like to request off: ");
                    userinput = input.nextLine();
                    bodyText = ("I would like to request a vacation day on " + userinput + ". Let me know if this will be suitable! ");
                } else {
                    System.out.println("Please enter either yes or no to answer this question.");
                }
            }

        }
        isAccurate();
    } // end set type class

    public void isAccurate(){
        {
            System.out.println(bodyText);
            System.out.println("Would you like to modify anything? (yes/no) ");
            String answer = input.nextLine();
            boolean isTrue = false;
            while (isTrue == false) {
                if (isTrue == false) {
                    if ((answer.equals("no")) || (answer.equals("n"))) {
                        isTrue = true;
                    }
                    else if ((answer.equals("yes")) || (answer.equals("y"))) {
                        isTrue = false;

                        System.out.println("What would you like to change? (enter number that corresponds with your choice): ");
                        displayOptions();
                        int hi = input.nextInt();

                        System.out.print("option " + hi + " selected!");
                        switch (hi){
                            case 1:
                                setType();
                                break;
                            case 2:
                                isTrue = false;
                                input.nextLine();
                                while (isTrue == false){
                                    if (isTrue == false) {
                                        System.out.print("Enter message you would like to add to the end of the message body: ");
                                        String stringinput = input.nextLine();
                                        String bodyText2 = bodyText + " " + stringinput;
                                        System.out.println(bodyText2);
                                        System.out.println("Would you like to add this message to your message? (yes/no");
                                        stringinput = input.nextLine();
                                        if ((stringinput.equals("yes")) || (stringinput.equals("y"))) {
                                            isTrue = true;
                                            bodyText = bodyText2;
                                        }
                                    }
                                }
                                break;
                            case 3:

                                isTrue = false;
                                input.nextLine();
                                while (isTrue == false) {
                                    if (isTrue == false) {
                                        System.out.print("Enter message you would like to add to the beginning of the message body: ");
                                        String stringinput = input.nextLine();
                                        String bodyText2 = stringinput + "\n" + bodyText;
                                        System.out.println(bodyText2);
                                        System.out.println("Would you like to add this message to your message? (yes/no) ");
                                        stringinput = input.nextLine();

                                        if ((stringinput.equals("yes")) || (stringinput.equals("y"))) {
                                            isTrue = true;
                                            bodyText = bodyText2;
                                        }
                                    }
                                }
                                break;
                            default:
                                System.out.println("Invalid input, please enter one of the specified options: ");
                                break;

                        }//end case statement
                        isAccurate();

                    }
                }
                else System.out.println("Invalid input-- please enter yes or no");

            }
        }

    } // end isAccurate class

    public void displayOptions(){
        System.out.println("1) change type of business email \n2) add custom line to end of message body\n3) add custom line before message body");
    }


        public static void ProfessionalExecute() {
            Scanner input = new Scanner(System.in);
            //gathering values to be sent to superclass: name, email, subject line
            System.out.println("  ✦ \uD835\uDD53\uD835\uDD66\uD835\uDD64\uD835\uDD5A\uD835\uDD5F\uD835\uDD56\uD835\uDD64\uD835\uDD64 \uD835\uDD56\uD835\uDD5E\uD835\uDD52\uD835\uDD5A\uD835\uDD5D \uD835\uDD58\uD835\uDD56\uD835\uDD5F\uD835\uDD56\uD835\uDD63\uD835\uDD52\uD835\uDD65\uD835\uDD60\uD835\uDD63 ✦ ");
            System.out.print("Enter your name: ");
            String sender = input.nextLine();
            System.out.print("Enter your email address: ");
            String senderEmail = input.next();
            System.out.print("Enter the subject line of this email: ");
            String subjectLine = input.nextLine();
            subjectLine = input.nextLine();

            //this section takes care of making arrays for the recipients and their email addresses
            System.out.print("How many people will this email be sent to? : ");
            String[] recipientEmails = new String[input.nextInt()]; // (makes array & takes user input as reference for how long array should be
            String[] recipientNames = new String[recipientEmails.length];
            input.nextLine();
            //& then this fills those arrays
            for (int i = 0; i < recipientEmails.length; i++){
                System.out.print("\tEnter the name of recipient #" + (i+1) + ": ");
                recipientNames[i] = input.nextLine();
                System.out.print("\tEnter " + recipientNames[i] + "'s email address: ");
                recipientEmails[i] = input.nextLine();
            }



            //here we can have an "enter type of email" & is where it would call a different subclass depending on what the user enters
            //ie if they entered professional emails it would call the following subclass, if they entered thank you cards it would call Ben's class, ect )
            int x = 0;
            String emailType = "";
            Email email = new Email(sender, senderEmail, recipientNames[x], recipientEmails[x],sender);
            email = new Professional(sender, senderEmail, recipientNames[x], recipientEmails[x],sender);
            boolean valid = false;

            int recipientIndex = 0;
            for(int i = 0; i < recipientEmails.length; i++){
                System.out.println("------------------------------------------------");
                System.out.println("Displaying preview of email to be sent to recipient #" + (recipientIndex+1)+": ");
                System.out.print("Subject line:   " + subjectLine + "\nto: " + recipientEmails[i] + ", ");
                //System.out.print(recipientEmails[i] + ", ");
                System.out.println("\n");
                System.out.println("Hello " + recipientNames[i] + ", \n\n" + email.getEmailBody() + " \n\nSincerely, \n" + sender);
                recipientIndex++;
            }

        }

    } //end class
