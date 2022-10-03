//Clayton Webber
public class BusinessCards extends Email{
    private String company;
    private String street;
    private String phoneNum;
    private String website;
    private String tagline;
    private String jobtitle;


    BusinessCards(String name, String email, String company, String street, String phoneNum, String website, String tagline, String jobtitle){
        super(name,email);
        this.company = company;
        this.street = street;
        this.phoneNum = phoneNum;
        this.website = website;
        this.tagline = tagline;
        this.jobtitle = jobtitle;
    }

    public String getCompany(){return company;}
    public String getStreet(){return street;}
    public String getPhoneNum(){return phoneNum;}
    public String getWebsite(){return website;}
    public String getTagline(){return tagline;}
    public String getJobtitle(){return jobtitle;}
    public boolean isFront(){return getFrontOfCard();}
    public boolean isBack(){return getBackOfCard();}

    //front of card
    public String toString(){
        if(frontOfCards)//front of card
            return "Front of card:\nCompany: " + company + "\nTagline: " + tagline + "\n-----------------------------------";
        else//back of card
            return "Back of card:\nJob Title: " + jobtitle + "\nAddress: " + street + "\nPhone Number: " + phoneNum + "\nWebsite: " + website;
    }
}
