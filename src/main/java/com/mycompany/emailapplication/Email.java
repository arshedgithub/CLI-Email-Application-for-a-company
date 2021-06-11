package com.mycompany.emailapplication;

import java.util.Scanner;

/**
 *
 * @author Arshed
 */
public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "alfacompany.com";
    
//    constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("password is "+ this.password);
        
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." +companySuffix;
        System.out.println("email is " + email);
    }
    
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the Department code : ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt(); 
        
        switch (depChoice) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acc";
            default:
                return "";
        }
        
    }
    
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12334567890!@#$%^&*";
        char[] password = new char[length];
        
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);            
        }
        
        return new String(password);
        
    }

    public void setMailboxCapacity(int mailboxCapacity){
        this.mailBoxCapacity = mailboxCapacity;
    }
    
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){return mailBoxCapacity;}  
    public String getAltEmail(){return alternateEmail;}
    public String getChangePassword(){return password;}

    public String showInfo(){
        if (alternateEmail != null) email = alternateEmail ;
        return "\nEmployee Name : " + firstName + " " + lastName +
                "\nCompany Email : " + email +
                "\nPassword : " + password +
                "\nMailbox Capacity : " + mailBoxCapacity + "MB"; 
    }
    
}
