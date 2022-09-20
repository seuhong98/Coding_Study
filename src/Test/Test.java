package Test;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.*;

public class Test {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        SecureRandom secureRandom = new SecureRandom();
        Key publicKey = new RSAPublicKey() {
            @Override
            public BigInteger getPublicExponent() {
                return new BigInteger("65537");
            }

            @Override
            public String getAlgorithm() {
                return "RSA";
            }

            @Override
            public String getFormat() {
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return new byte[0];
            }

            @Override
            public BigInteger getModulus() {
                return new BigInteger("21097344065291750783694568797172499029644145734474214294306556645857547654686531406108627251618299650276678053887360325646464502164878222189646163533113780374296783693157821541545790457789874220698719732526867067534985575392410281033860632530296293362718765361424686815549393399191376340979817776192013395126493878965402212212002728987385357773025133704115098786218404536762916835185544446729809418044743147876140518464270237829060129951015894442640468576774982651729356095680800978294722409272268439179945002969784588576066458570344888038966726401295116894014266270360614948888213670634491245661124063140905092479421");
            }
        };

        Key privateKey = new RSAPrivateKey() {
            @Override
            public BigInteger getPrivateExponent() {
                return new BigInteger("751542784302456953775933294381477886302504274405351186222867802087660874843694038797949268071899573729892008859200625848821826247068445267924194476164722701097597863955418315926771173577616313771506646437237344642983006916873232557206631867574495727369321598681387213933833007762823858364763150286065496929393005172968755368088976276921110531568733003926871951371321235819805817257232492620149095367654723146425082586649000952008952858793763378093839759943143122253269245746075630552970521027848035756754279144227328798440289580093835729385472787308462734686442932933329035356169422145583559859546853893336800687233");
            }

            @Override
            public String getAlgorithm() {
                return "RSA";
            }

            @Override
            public String getFormat() {
                return null;
            }

            @Override
            public byte[] getEncoded() {
                return new byte[0];
            }

            @Override
            public BigInteger getModulus() {
                return new BigInteger("21097344065291750783694568797172499029644145734474214294306556645857547654686531406108627251618299650276678053887360325646464502164878222189646163533113780374296783693157821541545790457789874220698719732526867067534985575392410281033860632530296293362718765361424686815549393399191376340979817776192013395126493878965402212212002728987385357773025133704115098786218404536762916835185544446729809418044743147876140518464270237829060129951015894442640468576774982651729356095680800978294722409272268439179945002969784588576066458570344888038966726401295116894014266270360614948888213670634491245661124063140905092479421");
            }
        };

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
        byte[] bytes = cipher.doFinal("안녕하세요".getBytes());
        String enc = Base64.getEncoder().encodeToString(bytes);

        byte[] decB = Base64.getDecoder().decode(enc.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        bytes = cipher.doFinal(decB);
        String txt = new String(bytes,"utf-8");
        System.out.println(txt);
    }


}
