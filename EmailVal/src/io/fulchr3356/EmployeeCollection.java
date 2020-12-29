package io.fulchr3356;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection {
    private ArrayList <String> employeeEmails;
    EmployeeCollection(){
        employeeEmails = new ArrayList<>();
    }

    public void add(String email){
        if(!employeeEmails.contains(email) && !email.equals(""))
        employeeEmails.add(email);
    }

    public boolean findbyEmail(String emailToFind){
        for(String email: employeeEmails){
            if(email.equalsIgnoreCase(emailToFind))
                return true;
        }
        return false;
    }

    public void deleteByEmail(String emailToFind){
        employeeEmails.removeIf(email -> email.equalsIgnoreCase(emailToFind));
    }

    public void printAll(){
        for(String email : employeeEmails)
            System.out.println(email);
    }

}
