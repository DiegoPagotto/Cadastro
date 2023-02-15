package br.edu.ifsp.scl.ads.cadastro.model;

public class Formulario {
    private String fullName;
    private String phoneNumber;
    private String email;
    private boolean isSubscribed;
    private char sex;
    private String city;
    private String state;

    public Formulario(String fullName, String phoneNumber, String email, boolean isSubscribed, char sex, String city, String state) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isSubscribed = isSubscribed;
        this.sex = sex;
        this.city = city;
        this.state = state;
    }

    public Formulario() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", isSubscribed=" + isSubscribed +
                ", sex=" + sex +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
