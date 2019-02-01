package com.company;
import java.util.ArrayList;
import java.util.List;

public class RegistrationFormLibrary {

    private List<RegistrationForm> registrationForms = new ArrayList<>();

    public void addToLibrary(RegistrationForm registrationForm) {
        registrationForms.add(registrationForm);

    }

    public void printLibraryDetails() {
        for (RegistrationForm form : registrationForms) {
            System.out.print(form.printDetails());
        }
    }

}
