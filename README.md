
# Swirepay Encryption Java  
  
Swirepay Encryption SDK provides developers an easy way to communicate with Swirepay APIs using AES Encryption.  
  
## How to perform Encryption  
  
### Symmetric Encryption  
A symmetric key would be provided by Swirepay Representative or retrieved from the dashboard. These keys can be periodically rolled at regular intervals by merchants using their dashboard as well.
  
### Gettings SDK  
* Option 1: You can copy the following two files onto your existing source code:  
   * [AESAlgorithm.java](https://github.com/swirepay/swirepay-encryption-java/blob/master/src/com/swirepay/AESAlgorithm.java)   
   * [EncryptionUtils.java](https://github.com/swirepay/swirepay-encryption-java/blob/master/src/com/swirepay/EncryptionUtils.java)  
* Option 2: You can download the jar file from our releases here:  
   *   https://github.com/swirepay/swirepay-encryption-java/releases
     
### Sending Encrypted Requests  
Import following classes  
```  
import com.swirepay.AESAlgorithm; 
import com.swirepay.EncryptionUtils;  
```  
Encrypt using the `encryptAES` function  
  
```  
String requestBody = "{\"amount\":1000,\"currencyCode\":\"INR\",\"paymentMethodType\":[\"CARD\"]}";  // Please replace with actualy request body  
String key = "Lg5kaNjA9A2otL2xn5nSPlKAywaKauNlNqwlo/xpWmc=";  // Invalid AES KEY -> Please replace with provided AES KEY  
String encData = EncryptionUtils.encryptAES(AESAlgorithm.AES_CBC_PKCS5Padding, requestBody, key);  
```  
### Decrypting Encrypted Response  
Import following classes  
```  
import com.swirepay.AESAlgorithm; 
import com.swirepay.EncryptionUtils;  
```  
Decrypt using the `decryptAES` function  
  
```  
String encResponse = "cOdvN4bzxMiqQxL+BGMCkxgJjVkm7VL2I7MaSC0rRs5qk5eH1hIRv2w5/c1hqCUfQrVd4rOzeq4KHFqH4xZJ/iXck4PWEB0w95APlr9P5vBiKfJZXzsjfRqYdXGW+1r7RdGq5fxnxUvl+dV4tS/soTSWgX3v71x88fWleEXE6QYTMMl7QsAKPwa4Id1OnzVX1n6kzfKMklsw2gEgkfMMAB7DJLBHUxX3q+bDaorrScz2e/Ie5SdbNIyN8/m1ibwZ6d1MhSLUJTuFoto1xqXEVrlDzEntaV81+lrPw02UUvuZ/orqo/acRtinLUdKH+Vf36p38u1LBxPA+gaEdehreifWc2dy0PqgE3+Wd1doR7stKcfc0DojPXLLbNX9/XdJ/HCLVHl13yNiQeMO14mzoLu2VSy3S4NETd78cHf/3qw6W6IACU8GztuYw9M8kQdJ1Js6WBm/yElWV08+1vIMyY5cvBRYtpqKtJm24ZbvGhBfn5AlPaEOXhxLeqidIjYKpQGQB7FH1TWVJESu2vmo9Fn1GUwdMMzCNf+sMPyM3PivM3DGYI9gEaGtb8sH7nS9Y3BqY6N53TKl2pkUBmvtF5OyqR8uXdBqs8IEvIYL/jHoBnbWM7D/tWcfoWwrJQiJ3Rzah2h9tK1FP4Ik3fjDcweV9kyVn08I2mqShGx/+QfSD6kct0ugQDJy5Xnv2Fqo+/Pp31ziSWHV4bLGYJErB+tm8YvLTG7tHcK0A9OUUPQ4wzmKrul87LmgRLpKnyi61CZYh85amXEJon9uqvdJCOEqqOE1lyMnN2UEbLgRyh+jOQ/ZGb20Q2JQTiorNuhiCHp9pDjpJsh5VhyyM0CpBbbsB58lENNQmyj2FwIK5KRnfBUDFxDASTO9n7nrch7c2SKx5n9m1FBYdU6Hb1LYk/jXkFgCayhkUE1B1CrbhgNgfMPPXRSy+C36BTYnDQTakUYQEiULZtAjiAP9y2iGr4ryxxDuthplzBFQzwYw5dvoOyrDknsoiYWpaimf+mhWUsO/2OrYmEcDd3xOw766sg=="; 
String decryptedResponse = EncryptionUtils.decryptAES(AESAlgorithm.AES_CBC_PKCS5Padding, encResponse, key);
```
  
### Hybrid Encryption  
  
Swirepay performs Hybrid encryption with most banks in India and US. If there is a specific requirement for hybrid encryption using RSA keys please contact devsupport@swirepay.com