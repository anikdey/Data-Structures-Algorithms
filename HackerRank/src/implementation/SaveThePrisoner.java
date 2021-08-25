package implementation;

public class SaveThePrisoner {

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(4, 6, 2));
        System.out.println(saveThePrisoner(7, 19, 2));
        System.out.println(saveThePrisoner(3, 7, 3));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int rem = m % n;
        if(rem == 0) {
            if(s == 1)
                return n;
            else
                return s-1;
        } else {
            int sweetsToAllocate = rem - 1;
            int diff = n - s;
            if(diff>=sweetsToAllocate)
                return s + sweetsToAllocate;
            else
                return (s + sweetsToAllocate) % n;
        }
    }

}
