package array.easy;

import java.util.Arrays;

public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);
        for(int i=2; i<n; i++) {
            if(isPrimes[i] == true) {
                count++;
                for(int j=i*2; j<n; j+=i) {
                    isPrimes[j] = false;
                }
            }
        }
        return count;
    }

}
