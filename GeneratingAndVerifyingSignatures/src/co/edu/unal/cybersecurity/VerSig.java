package co.edu.unal.cybersecurity;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
/* https://docs.oracle.com/javase/tutorial/security/apisign/versig.html */
public class VerSig {
    public static void main(String[] args) {
        /* Verify a DSA signature */
        if ( args.length != 3 ) {
            System.out.println("Usage: VerSig publickeyfile signaturefile datafile.");
        } else try {
            // Reading the encoded public key bytes.
            FileInputStream keyfis = new FileInputStream(args[0]);
            byte[] encKey = new byte[keyfis.available()];
            keyfis.read(encKey);
            keyfis.close();

            X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(encKey);
            KeyFactory keyFactory = KeyFactory.getInstance("DSA", "SUN");
            PublicKey pubKey = keyFactory.generatePublic(pubKeySpec);

            FileInputStream sigfis = new FileInputStream(args[1]);
            byte[] sigToVerify = new byte[sigfis.available()];
            sigfis.read(sigToVerify);
            sigfis.close();

            Signature sig = Signature.getInstance("SHA1withDSA", "SUN");
            sig.initVerify(pubKey);

            FileInputStream datafis = new FileInputStream(args[2]);
            BufferedInputStream buffin = new BufferedInputStream(datafis);

            byte[] buffer = new byte[1024];
            int len;
            while (buffin.available() != 0) {
                len = buffin.read(buffer);
                sig.update(buffer, 0, len);
            }
            buffin.close();

            boolean verifies = sig.verify(sigToVerify);
            System.out.println("signature verifies: " + verifies);

        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }
}
