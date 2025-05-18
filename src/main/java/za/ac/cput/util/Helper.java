package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class Helper {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

//    public static boolean isIntValid(int number) {
//        if (number < 0)
//             return true;
//        return false;
//    }

    public static boolean isValidPhoneNumber(String number) {
        return number.matches("^0[1-9]{9}$");
    }

    public static boolean isValidEmail(String email) {
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }

    public static boolean isValidDate(LocalDate date){
        return date == null;
    }
  
    public static boolean isValidPrice(double price){
        if (Double.isNaN(price) || price <=0) {
            return true;
        }
        return false;
    }
}
