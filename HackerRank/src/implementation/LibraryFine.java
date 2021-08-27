package implementation;

public class LibraryFine {

    public static void main(String[] args) {
        System.out.println(libraryFine(9, 7, 2015,6, 6, 2015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fineAmount = 0;

        if(y1>y2) {
            return 10000;
        } else if(y1<y2) {
            return 0;
        } else if(y1==y2) {
            if(m1 < m2) {
                return 0;
            } else if(m1>m2) {
                return (m1-m2) * 500;
            } else {
                if(d1 <= d2) {
                    return 0;
                } else {
                    return (d1-d2) * 15;
                }
            }
        }

        return fineAmount;
    }

}
