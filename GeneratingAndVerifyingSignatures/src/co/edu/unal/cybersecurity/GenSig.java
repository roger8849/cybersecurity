package co.edu.unal.cybersecurity;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.*;

/**
 * https://docs.oracle.com/javase/tutorial/security/apisign/index.html
 * Notes:
 * <p>
 * The methods for signing data are in the java.security package, so the program imports everything from that package.
 * The program also imports the java.io package, which contains the methods needed to input the file data to be signed.
 * <p>
 * A single argument is expected, specifying the data file to be signed.
 * <p>
 * The code written in subsequent steps will go between the try and the catch blocks.
 */
public class GenSig {

    public static void main(String[] args) {
        /* Generate a DSA signature */

        if (args.length != 1) {
            System.out.println("Usage: GenSig nameOfFileToSign");
        } else try {
            // the rest of the code goes here
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA", "SUN");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "SUN");
            keyPairGenerator.initialize(1024, secureRandom);

            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            Signature signature = Signature.getInstance("SHA1withDSA", "SUN");
            signature.initSign(privateKey);

            FileInputStream fileInputStream = new FileInputStream(args[0]);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) >= 0) {
                signature.update(buffer, 0, len);
            }
            bufferedInputStream.close();

            // Document signing.
            byte[] realSig = signature.sign();

            // Saving signatures in a file.
            FileOutputStream fileOutputStream = new FileOutputStream("output/sig");
            fileOutputStream.write(realSig);
            fileOutputStream.close();

            //Saving public key in a file.
            byte[] key = publicKey.getEncoded();
            FileOutputStream keyFileOutputStream = new FileOutputStream("output/suepk");
            keyFileOutputStream.write(key);
            keyFileOutputStream.close();


        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }
}
