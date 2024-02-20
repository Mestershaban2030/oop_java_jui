/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Validation {
   public String phoneNochecker(String pn) {
    if (!pn.matches("\\d+")){
        
                return "You have Entered Letters or symbols in phone field\nplease Enter digits only";}
    else{    
       if (pn.length() == 11) {
            if ((pn.charAt(0) == '0' && pn.charAt(1) == '1') && (pn.charAt(2) == '0' || pn.charAt(2) == '2' || pn.charAt(2) == '5')) {
                return pn;
            } else {
                
                return "Your Phone number is not starting with 010,012 or 015";
            }
        } else {
            
            return "Your phone number is not 11 digits it's " + pn.length() + " digits\nEnter a Valid Number";
        }
    }
   }
   
    public String emailChecker(String ec) {
        if (ec.matches("[a-zA-Z0-9]{2,20}@[a-zA-Z]{2,10}\\.[a-zA-Z]{2,10}")) {
            return ec;
        } else {
            
            return "Enter a Valid Email!";
        }
    }
}
