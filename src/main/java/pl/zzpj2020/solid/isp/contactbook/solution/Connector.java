package pl.zzpj2020.solid.isp.contactbook.solution;


public class Connector {
    public static void main(String[] args) {
        Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
        contact.sendEmail("promocja", "tanio dzisiaj!");
        contact.makeCall();
    }
}
