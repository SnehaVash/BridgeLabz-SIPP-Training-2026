package scenarioBased;
import java.util.Scanner;

public class usernameValidator {

    public boolean isValid(String userName, int index) {
        if(index == userName.length()) return true;

        char[] ch = userName.toCharArray();

        if(ch[index]<'a'||ch[index]>'z') {
            return false;
        }
        return isValid(userName, index+1);
    }

    public static void main(String[] args) {
        usernameValidator validator = new usernameValidator();

        boolean rs = validator.isValid("sneha", 0);
        System.out.println(rs);
    }
}
