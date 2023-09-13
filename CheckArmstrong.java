
/**
 * Author : DevMansuri
 * Purpose : To check given Number is Armstrong number.
 */
public class CheckArmstrong {

    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int i = num;
        while(num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(sum == i) {
            System.out.println("true");
        }
        else {
            System.out.println("false");

        }
    }
}
