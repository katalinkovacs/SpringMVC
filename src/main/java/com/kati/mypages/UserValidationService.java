package com.kati.mypages;


public class UserValidationService {

    public  boolean isUserValid(String user){

        if(user.equals("Katalin"))
            return true;

        return false;
    }
}
