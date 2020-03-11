package pl.zzpj2020.solid.isp.contactbook.solution;

public class Contact extends ContactBase implements Dialable, Emailable {
    public Contact(String name, String address, String emailAddress,
                       String telephone) {
        super(name, address, emailAddress, telephone);
    }

    public void makeCall() {
        //call with super.telephone
    }
    public void sendEmail(String subject, String body) {
        //email with super.emailAdress
    }
}
