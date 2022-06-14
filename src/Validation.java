import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public void nameValidation(String name)
    {
        String regex ="^[A-Z]{1}+[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        if(m.find())
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Not valid");
        }
    }
}
