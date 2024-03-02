package Assignment;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

public class HashPassword {
    private static final Random random = new SecureRandom();
    private static final String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int iterations = 10000;
    private static final int keyLength = 256;
    private static final int length = 30;
    public static void main(String[] args) {
        String password = "ope";
        String passwords = "ope";
        String saltValue = HashPassword.getSaltValue(length);
        String encrptyPassword = generateSecurePassword(password,saltValue);
        boolean status = verifyUserPassword(passwords,encrptyPassword,saltValue);
        System.out.println(saltValue);
        System.out.println(saltValue+encrptyPassword);
        System.out.println(encrptyPassword);
        System.out.println(status);
        System.out.println(verifyPassword("Dpe123"));

    }

    public static boolean verifyPassword(String password){
        if(password.matches("^[A-Z].*${6}"))return true;
        return false;

    }

    public static String getSaltValue(int length){
        StringBuilder finalVal = new StringBuilder(length);
        for(int count = 0; count < length; count++){
            finalVal.append(characters.charAt(random.nextInt(length)));
        }
        return String.valueOf(finalVal);
    }
    public static byte[] hash(char[] password,byte[]salt){
        PBEKeySpec pbeKeySpec = new PBEKeySpec(password,salt,iterations,keyLength);
        Arrays.fill(password,Character.MIN_VALUE);
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return secretKeyFactory.generateSecret(pbeKeySpec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error");
        } finally {
            pbeKeySpec.clearPassword();
        }
    }

    public static String generateSecurePassword(String password,String salt){
        String finalVal = null;
        byte[] securePassword = hash(password.toCharArray(),salt.getBytes());
        finalVal = Base64.getEncoder().encodeToString(securePassword);
        return finalVal;

    }
    private static boolean verifyUserPassword(String providedPassword,String securePassword,String salt){
        boolean finalVal = false;
        String newSecurePassword = generateSecurePassword(providedPassword,salt);
        finalVal = newSecurePassword.equalsIgnoreCase(securePassword);
        return finalVal;
    }

}
