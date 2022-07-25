package leetCode;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        System.out.println(factorial(25));
    }


    public static BigInteger factorial(int number){
        BigInteger factorial = BigInteger.valueOf(number);

        for (int i = 1; i < number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}