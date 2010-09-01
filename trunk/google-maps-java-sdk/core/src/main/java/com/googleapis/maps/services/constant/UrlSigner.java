/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.googleapis.maps.services.constant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * The Class UrlSigner.
 */
public class UrlSigner {

	// Note: Generally, you should store your private key someplace safe
	// and read them into your code

	/**
	 * Instantiates a new url signer.
	 * 
	 * @param keyString
	 *            the key string
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private UrlSigner() {
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws InvalidKeyException
	 *             the invalid key exception
	 * @throws NoSuchAlgorithmException
	 *             the no such algorithm exception
	 * @throws URISyntaxException
	 *             the URI syntax exception
	 */
	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		String inputUrl, inputKey = null;

		// For testing purposes, allow user input for the URL.
		// If no input is entered, use the static URL defined above.
		System.out.println("Enter the URL (must be URL-encoded) to sign: ");
		inputUrl = input.readLine();

		// For testing purposes, allow user input for the private key.
		// If no input is entered, use the static key defined above.
		System.out.println("Enter the Private key to sign the URL: ");
		inputKey = input.readLine();

		String request = UrlSigner.getUrlSignature(inputUrl, inputKey);

		System.out.println("Signed URL :" + request);
	}

	/**
	 * Sign request.
	 * 
	 * @param path
	 *            the path
	 * @param query
	 *            the query
	 * 
	 * @return the string
	 * 
	 * @throws NoSuchAlgorithmException
	 *             the no such algorithm exception
	 * @throws InvalidKeyException
	 *             the invalid key exception
	 * @throws UnsupportedEncodingException
	 *             the unsupported encoding exception
	 * @throws URISyntaxException
	 *             the URI syntax exception
	 */
	public static String getUrlSignature(String urlStr, String privateKey)
			throws Exception {
		URL url = new URL(urlStr);
		// Retrieve the proper URL components to sign
		String resource = url.getPath() + '?' + url.getQuery();

		privateKey = privateKey.replace('-', '+');
		privateKey = privateKey.replace('_', '/');
		byte[] key = Base64.decode(privateKey);

		// Get an HMAC-SHA1 signing key from the raw key bytes
		SecretKeySpec sha1Key = new SecretKeySpec(key, "HmacSHA1");

		// Get an HMAC-SHA1 Mac instance and initialize it with the HMAC-SHA1
		// key
		Mac mac = Mac.getInstance("HmacSHA1");
		mac.init(sha1Key);

		// compute the binary signature for the request
		byte[] sigBytes = mac.doFinal(resource.getBytes());

		// base 64 encode the binary signature
		String signature = Base64.encodeBytes(sigBytes);

		// convert the signature to 'web safe' base 64
		signature = signature.replace('+', '-');
		signature = signature.replace('/', '_');

		return signature;
	}
}
