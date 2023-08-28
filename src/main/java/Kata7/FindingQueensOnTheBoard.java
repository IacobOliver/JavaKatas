package Kata7;

import java.math.BigInteger;

public class FindingQueensOnTheBoard {



    public static BigInteger queens(BigInteger n) {

        long nAsLong = n.longValue();
        BigInteger result;
        if (nAsLong == 0 || nAsLong == 1 || nAsLong == 2 || nAsLong<0) result = BigInteger.ZERO;
        else {
            BigInteger nSquared = n.multiply(n);
            BigInteger nMinusOne = n.subtract(BigInteger.ONE);
            BigInteger three = BigInteger.valueOf(3);
            BigInteger nMinusOneTimesThree = nMinusOne.multiply(three);

            // Calculate the final result: nn - (n-1)3
            result = nSquared.subtract(nMinusOneTimesThree);
            result = result.subtract(BigInteger.ONE);
        }
        return result;
    }
}
