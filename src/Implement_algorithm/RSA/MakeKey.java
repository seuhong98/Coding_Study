package Implement_algorithm.RSA;

import java.math.BigInteger;

public class MakeKey {
    public static void main(String[] args) {
        System.out.println(((new BigInteger("26815615859885194199148049996411692254958731641184786755447122887443528060147093953603748596333806855380063716372972101707507765623893139892867298012168351").multiply(new BigInteger("26815615859885194199148049996411692254958731641184786755447122887443528060147093953603748596333806855380063716372972101707507765623893139892867298012168453")))).toString(2));
    }
}