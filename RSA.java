/**
 * @author Adam Schilperoort & Zachary Spielberger
 */
import java.util.Random;
import java.math.BigInteger;

public class RSA {
                        //n,e, and d are the three global variables needed
  private BigInteger n; //n is the least common multiple of (p, q), used in Encrypt
  private BigInteger e; //e is used in Encrypt, assigned value below
  private BigInteger d; // used in Decrypt, assigned value in GenerateKeys

/**
 * GenerateKeys initializes and calculates the necessary numbers to be used later in Encrypt and Decrypt
 * @param Bits [description]
 */
  public void GenerateKeys(int Bits){  //using p and q, n is computer, totient calculated
                                  //tot = lcm(p-1, q - 1)
    int certainty = 100;

    Random rnd = new Random();
    BigInteger one = new BigInteger("1");
    BigInteger zero = new BigInteger("0");
    BigInteger p = new BigInteger(Bits, certainty, rnd);
    BigInteger q = new BigInteger(Bits, certainty, rnd);
               e = new BigInteger(Bits, certainty, rnd);
               n = p.multiply(q);            //Calculates the LCM of P and Q, used in Decrypt
    BigInteger y = (p.subtract(one)).gcd(q.subtract(one));  //Calculates the Gcd of p and q/ LCM is p*q
    BigInteger x = ((p.subtract(one)).multiply(q.subtract(one))).divide(y);  //the totient, which is (p-1)(q-1)/gcd(pq)

/** while loop guarantees e is greater than 1, less than x, and not coprime to x
 */
    while(e.compareTo(one) != 1 || e.compareTo(x)!= -1 ||  (x.mod(e)).compareTo(zero) == 0 ){
        e = new BigInteger(Bits, certainty, rnd);
    }
    d = e.modInverse(x);  //modular multiplicative inverse of e under totient
  }

/**
* Encrypt takes a message and returns calculated gibberish (codedmessage), generated through by using modPow(e,n)
* @param  message message is a BigInteger passed into Encrypt from the main method
* @return codedmessage is the encrypted message
*/
    public BigInteger Encrypt(BigInteger message){

      if(n == null || e == null){
        return null;
      }
        BigInteger codedmessage;
        codedmessage= message.modPow(e,n);
        return codedmessage;
      }

  /**
  * Decrypt takes a gibberish message (cipher) and returns the decrypted message (ciphermesage)
  * @param  cipher is the encrypted message
  * @return  ciphermessage, which is the decrypted message
  */
      public BigInteger Decrypt(BigInteger cipher){ //uses n and d to act as the key for decryption

        if(n== null || d == null){
          return null;
        }

          BigInteger ciphermessage;
          ciphermessage= cipher.modPow(d,n);
          return ciphermessage;
      }


}
