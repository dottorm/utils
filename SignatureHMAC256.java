import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 * 
 * A class to generate HMAC-SHA256 encryption
 *
 */

public class SignatureHMAC256{
	
	private static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";
	private String data;
	private String key;

	private static String calculateHMAC(String data, String key)
		throws SignatureException, NoSuchAlgorithmException, InvalidKeyException
	{
		SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA256_ALGORITHM);
		Mac mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);
		mac.init(signingKey);
		byte[] result = mac.doFinal(data.getBytes());
		
		return Base64.encodeBase64String(result);
	}

}
