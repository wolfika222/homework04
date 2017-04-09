package hu.helixlab;

import java.util.Random;

/**
 * Created by Hp_Workplace on 2017.04.03..
 */
public class PasswordGenerator {


    public static String generatePassword(int length) {

        String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!%?";
        String result = new String();
        Random password = new Random();
        for (int i = 0; i < length; i++){
            result += (password.nextInt(alpha.length()));
        }
            return result;
    }
}
