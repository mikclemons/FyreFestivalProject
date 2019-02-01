package com.company;

public class RegistrationForm {

    private String name;
    private String address;
    private String email;
    private String arrivalDate;
    private String specialRequest;
    private int idNumber;

    public RegistrationForm(String name, String address, String email, String arrivalDate, String specialRequest){
        this.name = name;
        this.address = address;
        this.email = email;
        this.arrivalDate = arrivalDate;
        this.specialRequest = specialRequest;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String printDetails(){
        return(name +  "\n" + address + "\n" + email + "\n" + arrivalDate + "\n"+ specialRequest);

    }


}
