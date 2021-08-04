package math;

public class CountOfMatchesInTournament {

    public static void main(String[] args) {
        System.out.println(numberOfMatches(1));
        System.out.println(numberOfMatches(7));
        System.out.println(numberOfMatches(14));
    }

    public static int numberOfMatches(int n) {
        int count = 0;
        while (n != 1) {
            if(n%2==0) {
                n /= 2;
                count += n;
            } else {
                n = (n-1) / 2;
                count += n;
                n = n + 1;
            }
        }
        return count;
    }

}
