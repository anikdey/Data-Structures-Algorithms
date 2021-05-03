package string;

public class CaesarCipher {

    public static void main(String[] args) {

        int sdA = 'A';
        int sddfZ = 'Z';

        int sd = 'a';
        int sddf = 'z';


        System.out.println(sd);
        System.out.println(sddf);
        System.out.println(sdA);
        System.out.println(sddfZ);

        System.out.println(caesarCipher("Anik", 3));
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
        System.out.println(caesarCipher("159357lcfd", 98));
    }


    public static String caesarCipher(String s, int k) {
        char[] array = s.toCharArray();
        k = k % 26;
        for(int i = 0; i<array.length; i++) {
            char currentChar = array[i];
            if(currentChar>=65 && currentChar<=90) {
                int newChar = currentChar + k;
                if(newChar>90) {
                    newChar = newChar % 90 + 64;
                }
                array[i] = (char) newChar;
            } else if( currentChar>=97 && currentChar<=122 ) {
                int newChar = currentChar + k;
                if(newChar>122) {
                    newChar = newChar % 122 + 96;
                }
                array[i] = (char) newChar;
            }
        }
        return new String(array);
    }

}
