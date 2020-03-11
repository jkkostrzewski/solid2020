package pl.zzpj2020.solid.isp.contactbook.solution;

class ContactBase {
    public String name;
    public String address;
    public String emailAddress;
    public String telephone;

    public ContactBase() {};
    public ContactBase(String name, String address, String emailAddress,
                   String telephone) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}