package encryption;

import javax.crypto.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * User: 刘永健
 * Date: 12-10-4
 * Time: 下午8:56
 * To change this template use File | Settings | File Templates.
 */
public class AESDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        String plainText = "abc123";
        byte[] plainData1 = plainText.getBytes("UTF-8");
        System.out.println("Original text：" + Arrays.toString(plainData1));

        //Generate DES Key
        SecureRandom sr = new SecureRandom();
        KeyGenerator generator = KeyGenerator.getInstance("DES");
        generator.init(sr);
        SecretKey secretKey = generator.generateKey();
        System.out.println("Secret key: " + secretKey);

        //Obtain a cipher of DES algorithm
        Cipher cipher = Cipher.getInstance("DES");

        // Encrypt
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, sr);
        cipher.update(plainData1);
        byte[] encryptedData = cipher.doFinal();

        System.out.println("The result of encrypted data：" + Arrays.toString(encryptedData));

        //Decrypt
        cipher.init(Cipher.DECRYPT_MODE, secretKey, sr);
        cipher.update(encryptedData);
        byte[] plainData2 = cipher.doFinal();

        System.out.println("The decrypted result：" + Arrays.toString(plainData2));
        System.out.println("Compare：" + Arrays.equals(plainData2, plainData1));
 
    }
}
