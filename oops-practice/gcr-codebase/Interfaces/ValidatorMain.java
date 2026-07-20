package Interfaces;

public class ValidatorMain {

    public static void main(String[] args) {
        String[] coupons = {
                "Save123",
                "Hii 123",
                "HSA@%^",
                "SAVE6789",
                "Save1234",
                "uhdn334"
        };

        CuponValidator validator = new ShoppingCart();

        for(String coupon : coupons)  {
            if(validator.couponValidator(coupon)) {
                System.out.println("It is a valid coupon!");
            } else {
                System.out.println("It is an invalid coupon");
            }
        }
    }
}
