/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diabetes.project;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author loredana
 */

public class Doctor {
    public String username = "a";
    public String password = "a";
    
    public Doctor(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    private void setPassword(String password) {
        this.password = hashPassword(password);
    }

    public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Getter for username
    public String getUsername() {
        return username;
    }

    // This is a demonstration purpose method.
    // In a real-world scenario, you would not have a method to get the password hash directly.
    public String getPassword() {
        return password; 
    }

    // You can add other methods here as needed, for example, a method to verify a password input.
}

