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

  /** The key string. */
  private static String keyString = "YOUR_PRIVATE_KEY";
  
  // The URL shown in these examples is a static URL which should already
  // be URL-encoded. In practice, you will likely have code
  // which assembles your URL from user or web service input
  // and plugs those values into its parameters.
  /** The url string. */
  private static String urlString = "YOUR_URL_TO_SIGN";

  // This variable stores the binary key, which is computed from the string (Base64) key
  /** The key. */
  private static byte[] key;
  
  /**
   * The main method.
   * 
   * @param args the arguments
   * 
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws InvalidKeyException the invalid key exception
   * @throws NoSuchAlgorithmException the no such algorithm exception
   * @throws URISyntaxException the URI syntax exception
   */
  public static void main(String[] args) throws IOException,
    InvalidKeyException, NoSuchAlgorithmException, URISyntaxException {
    
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    String inputUrl, inputKey = null;

    // For testing purposes, allow user input for the URL.
    // If no input is entered, use the static URL defined above.    
    System.out.println("Enter the URL (must be URL-encoded) to sign: ");
    inputUrl = input.readLine();
    if (inputUrl.equals("")) {
      inputUrl = urlString;
    }
    
    // Convert the string to a URL so we can parse it
    URL url = new URL(inputUrl);
 
    // For testing purposes, allow user input for the private key.
    // If no input is entered, use the static key defined above.   
    System.out.println("Enter the Private key to sign the URL: ");
    inputKey = input.readLine();
    if (inputKey.equals("")) {
      inputKey = keyString;
    }
    
    UrlSigner signer = new UrlSigner(inputKey);
    String request = signer.signRequest(url.getPath(),url.getQuery());
    
    System.out.println("Signed URL :" + url.getProtocol() + "://" + url.getHost() + request);
  }
  
  /**
   * Instantiates a new url signer.
   * 
   * @param keyString the key string
   * 
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public UrlSigner(String keyString) throws IOException {
    // Convert the key from 'web safe' base 64 to binary
    keyString = keyString.replace('-', '+');
    keyString = keyString.replace('_', '/');
    System.out.println("Key: " + keyString);
    this.key = Base64.decode(keyString);
  }

  /**
   * Sign request.
   * 
   * @param path the path
   * @param query the query
   * 
   * @return the string
   * 
   * @throws NoSuchAlgorithmException the no such algorithm exception
   * @throws InvalidKeyException the invalid key exception
   * @throws UnsupportedEncodingException the unsupported encoding exception
   * @throws URISyntaxException the URI syntax exception
   */
  public String signRequest(String path, String query) throws NoSuchAlgorithmException,
    InvalidKeyException, UnsupportedEncodingException, URISyntaxException {
    
    // Retrieve the proper URL components to sign
    String resource = path + '?' + query;
    
    // Get an HMAC-SHA1 signing key from the raw key bytes
    SecretKeySpec sha1Key = new SecretKeySpec(key, "HmacSHA1");

    // Get an HMAC-SHA1 Mac instance and initialize it with the HMAC-SHA1 key
    Mac mac = Mac.getInstance("HmacSHA1");
    mac.init(sha1Key);

    // compute the binary signature for the request
    byte[] sigBytes = mac.doFinal(resource.getBytes());

    // base 64 encode the binary signature
    String signature = Base64.encodeBytes(sigBytes);
    
    // convert the signature to 'web safe' base 64
    signature = signature.replace('+', '-');
    signature = signature.replace('/', '_');
    
    return resource + "&signature=" + signature;
  }
}
