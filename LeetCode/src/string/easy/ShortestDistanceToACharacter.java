package string.easy;

import java.util.Arrays;

public class ShortestDistanceToACharacter {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));
    }

    public static int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] distance = new int[length];
        for(int i=0; i<length; i++) {
            char currentChar = s.charAt(i);
            if(currentChar == c){
                distance[i] = 0;
            } else {
                int leftPointer = i-1;
                int rightPointer = i+1;
                loop:
                while (leftPointer>=0 || rightPointer<length) {

                    if(leftPointer>=0) {
                        if(s.charAt(leftPointer) == c) {
                            distance[i] = i-leftPointer;
                            break loop;
                        }
                    }

                    if(rightPointer<length) {
                        if(s.charAt(rightPointer) == c) {
                            distance[i] = rightPointer-i;
                            break loop;
                        }
                    }
                    rightPointer++;
                    leftPointer--;
                }

            }
        }
        return distance;
    }


}
