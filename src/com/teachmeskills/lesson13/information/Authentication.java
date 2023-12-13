package com.teachmeskills.lesson13.information;


import com.teachmeskills.lesson13.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.custom_exception.WrongPasswordException;
import com.teachmeskills.lesson13.check.CheckChar;
import com.teachmeskills.lesson13.check.CheckContains;

public class Authentication {

    public static int LENGTH_LIMIT = 20;

    public static boolean secretInformation (String login, String password, String confirmPassword) {

        try {

            if (login.length() > LENGTH_LIMIT || CheckContains.searchOfSpace(login)) {
                throw new WrongLoginException(19, login);
            }

            if (password.length() > LENGTH_LIMIT || CheckChar.doCheckCharSpace(password) ||
                    CheckChar.doCheckCharNumber(password) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException(22, password);
            }

        } catch (WrongLoginException e) {
            System.out.println("Login error");
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Password error");
            return false;
        }





        return true;

    }

}
