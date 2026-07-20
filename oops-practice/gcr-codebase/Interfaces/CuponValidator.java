package Interfaces;

public interface CuponValidator {
    boolean couponValidator(String code); //Non-static method -> Can override

    static boolean isLength(String code) {
        return code.length()>=5 && code.length()<=10; //Static method -> can override but then it will be called "Method hiding"
    }
}
