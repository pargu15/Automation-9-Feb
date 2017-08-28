 package com.ZippSlipAutomation.utilities;

import java.security.Key;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings({ "unused", "restriction" })
public class EncryptNDecrypt {
	private static final String ALGORITHM = "AES";
	private static final String KEY = "1Hbfh667adfDEJ78";

	public static String encrypt(String value) throws Exception {
		Key key = generateKey();
		Cipher cipher = Cipher.getInstance(EncryptNDecrypt.ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
		String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
		return encryptedValue64;

	}

	public static String decrypt(String value) throws Exception {
		Key key = generateKey();
		Cipher cipher = Cipher.getInstance(EncryptNDecrypt.ALGORITHM);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decryptedValue64 = new BASE64Decoder().decodeBuffer(value);
		byte[] decryptedByteValue = cipher.doFinal(decryptedValue64);
		String decryptedValue = new String(decryptedByteValue, "utf-8");
		return decryptedValue;

	}

	private static Key generateKey() throws Exception {
		Key key = new SecretKeySpec(EncryptNDecrypt.KEY.getBytes(), EncryptNDecrypt.ALGORITHM);
		return key;
	}

/*	public static void main(String[] args) throws Exception {
		// System.out.println(EncryptNDecrypt.encrypt("admin1"));
		 System.out.println(EncryptNDecrypt.decrypt("DveiFW9XuCWBpTqKwly1yQ=="));
	}*/

}
