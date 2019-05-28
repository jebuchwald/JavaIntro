// This java file encrypts a message
// given by a user.
// Author: KCT

import java.util.Scanner;

public class Encrypt {
   public static void main(String args[]){	    Scanner scan = new Scanner(System.in);
       System.out.println("Type a message!");
       String message = scan.next();

       String encryptedMessage = "";

       for(int i = 0;
	i < message.length();
	i++) {
		encryptedMessage +=
		(char)
		((int) message.charAt(i) + 5);
	}
   	System.out.println(
		"Encrypted message: " +
		encryptedMessage);
	}
}
