public class FloydsTriangle {

    public static void main(String[] args) {
        int count = 0;
        int rows = 7;

        for(int i=1; i<=rows; i++) {
            for(int x=1; x<=i; x++) {
                System.out.print(++count+" ");
            }
            System.out.println();
        }
    }


}
