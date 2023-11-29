package Emailapp;

import java.util.Scanner;
public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;

    private String companySuffix = "Company.com";

    // Constructor to receive the firstname and lastname
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email Created!" + " " + this.firstname + " " + this.lastname);

        // Call a method asking for a department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        // Call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + companySuffix;
        //System.out.println("Your Email is: " + email);
    }
    // Ask for the department
    private String setDepartment(){
        System.out.println("New Worker: " + firstname + "\nDepartment Codes\n1 for Sales\n2 for Developemnt\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1){
            return "Sales";
        }
        else if(depChoice == 2){
            return "Development";
        }
        else if(depChoice == 3){
            return  "Accounting";
        }
        else{
            return "";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRTSUVWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Encapsulation (Setter Getter Method)

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternativeEmail(){
        return alternativeEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name: " + firstname + " " + lastname +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + " mb";
    }
}
