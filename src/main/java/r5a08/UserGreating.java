package r5a08;

public class UserGreating {


    public void UserGreating(){}

    public String formatGreeting(String nom) throws RuntimeException{
        if (nom.isEmpty() || nom.length()>10 || !(nom.matches("[a-zA-Z0-9]+")))
        {
            throw new UserGreatingFailureException("Nom invalid ! ") ;
        }
        else {return "Bonjour , " + nom ;}
    }
}
