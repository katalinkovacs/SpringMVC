package mydynamicpages;


public class UserValidationService {

    public  boolean isUserValid(String user, String password){

        if(user.equals("Katalin") && password.equals("cica"))
                return true;

        return false;
    }
}
