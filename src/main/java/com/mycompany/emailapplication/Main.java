
package com.mycompany.emailapplication;

import java.util.Scanner;

/**
 *
 * @author Arshed
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name of Employee : ");
        String fname = scanner.next();
        System.out.println("Last name of Employee : ");
        String lname = scanner.next();

        Email em1 = new Email(fname,lname); 
        
        validation validation = new validation();
        
        System.out.println(em1.showInfo());
        
        while (true) {            
            
            System.out.println("\nIf tou want to change\n1 for change Email\n2 for change Password\n0 for Exit\nEnter the Number : ");
            int change = scanner.nextInt();

            switch (change) {
                case 1:
                    System.out.println("Enter New Email : ");
                    String email = scanner.next();

                    if (validation.emailValidation(email)) {
                        em1.setAlternateEmail(email);
                        System.out.println("Email changed as "+ em1.getAltEmail());
                    }else{
                        System.out.println("password should be contain at least 8 characters");
                    }
                    System.out.println(em1.showInfo());
                    break;
                case 2:
                    System.out.println("Enter New Password : ");
                    String newPassword = scanner.next();

                    if (validation.passwordValidation(newPassword)){
                        em1.changePassword(newPassword);
                        System.out.println("Password changed as "+ em1.getChangePassword());
                    }else{
                        System.out.println("Email should be contain at least 8 characters");
                    }
                    System.out.println(em1.showInfo());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

