package chapter3;

public class CaesarCipher {

    public String encrypt(String message, int offset) {
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



    public static void main(String[] args) {
        CaesarCipher cy = new CaesarCipher();
        System.out.println(cy.encrypt("xyz", 3));
    }

}
