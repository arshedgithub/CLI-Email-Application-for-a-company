/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emailapplication;

/**
 *
 * @author Arshed
 */
public class validation {
    
    public boolean passwordValidation(String password){
        return password.length() >= 8;
    }
    
    public boolean emailValidation(String email){
        return email.length() >= 8;
    }
}
