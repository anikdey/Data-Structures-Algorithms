package chapter3;

public class CaesarCipher {

    private final char[] encoderArray = new char[26];
    private final char[] decoderArray = new char[26];
    private int offset;

    public CaesarCipher(int offset) {
        this.offset = offset % 26;
        for(int i=0; i<26; i++) {
            encoderArray[i] = (char) ('A' + (i + this.offset) % 26);
            //todo create the decoder array
        }
    }

    // works only for A-Z
    public String encode(String message) {
        return transform(message, encoderArray);
    }

    // works only for A-Z
    public String decode(String encodedMessage) {
        return transform(encodedMessage, decoderArray);
    }

    private String transform(String message, char[] arr) {
        char[] chars = message.toCharArray();
        for(int i=0; i<chars.length; i++) {
            int index = chars[i] - 'A';
            chars[i] = arr[index];
        }
        return new String(chars);
    }

    public String encrypt(String message) {
        char[] chars = message.toCharArray();
        offset = offset % 26;
        for (int i=0; i<chars.length; i++) {
            char currentChar = chars[i];
            int encodedChar = currentChar + offset;
            if(currentChar >= 'A' && currentChar <= 'Z') {
                if(encodedChar>90) {
                  encodedChar = encodedChar % 90 + 65 - 1;
                }
            } else {
                if(encodedChar>122) {
                    encodedChar = encodedChar % 122 + 97 - 1;
                }
            }
            chars[i] = (char) encodedChar;
        }
        return new String(chars);
    }

    public String decrypt(String encodedMessage) {
        char[] chars = encodedMessage.toCharArray();
        offset = offset % 26;
        for (int i=0; i<chars.length; i++) {
            char currentChar = chars[i];
            int decodedChar = currentChar - offset;
            if(currentChar >= 'A' && currentChar <= 'Z') {
                if(decodedChar<65) {
                    decodedChar =  90 - (64 - decodedChar);
                }
            } else {
                if(decodedChar<97) {
                    decodedChar =  122 - (96 - decodedChar);
                }
            }
            chars[i] = (char) decodedChar;
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        CaesarCipher cy = new CaesarCipher(50);

        String inputString = "XYZ";

        String encodedMessage = cy.encrypt(inputString);
        System.out.println(encodedMessage);
        System.out.println(cy.decrypt(encodedMessage));

        System.out.println(cy.encode(inputString));

    }

}
