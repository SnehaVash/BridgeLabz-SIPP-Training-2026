package Interfaces;

public class ShoppingCart implements CuponValidator {

    @Override
    public boolean couponValidator(String code) {
        return CuponValidator.isLength(code) && code.toUpperCase().startsWith("SAVE");
    }
}
