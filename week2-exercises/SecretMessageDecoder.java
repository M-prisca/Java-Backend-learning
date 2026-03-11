// Exercise 1: Secret Message Decoder
// A spy agency sends encoded messages where every character is shifted forward
// by 2 letters in the alphabet.

// For example: Encoded: jgnnq
// Original: hello

// Your job is to decode the message.

// Tasks
// Given a string: ex: String encoded = "jgnnq yqtnf";
// Decode the message by shifting each letter 2 positions backward.
// Spaces should remain unchanged.
// Print the decoded message
public class SecretMessageDecoder {
    public static void main(String[] args) {
        String encoded = "jgnnq yqtnf";
        String decoded = "";

        for (int i = 0; i < encoded.length(); i++) {
            char character = encoded.charAt(i);
            if (character == ' ') {
                decoded += " ";
            } else {
                character = (char) (character - 2);
                decoded += character;
            }

        }
        System.out.println(decoded);
    }

}