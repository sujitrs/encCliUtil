package encutil;
import java.io.*;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.*;
import java.security.*;

public class entry {
	
	public static void main(String[] args) throws IOException {
		Console cnsl
        = System.console();

    if (cnsl == null) {
        System.out.println(
            "No console available");
        return;
    }

    char[] ch = cnsl.readPassword(
        "Enter password : ");
    String password=new String(ch);
    
    Security.addProvider((Provider)new BouncyCastleProvider());
    StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
    standardPBEStringEncryptor.setAlgorithm("PBEWITHSHA256AND128BITAES-CBC-BC");
    standardPBEStringEncryptor.setPassword("cr3@t3#b@nk!ng!nt3ll!53n53#1601");
    standardPBEStringEncryptor.setProvider(new BouncyCastleProvider());
    System.out.println("Encrypted Password==>"+standardPBEStringEncryptor.encrypt(password));
    

    
	}
	

}
