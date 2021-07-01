public class Problem_9_Special_Pythagorean_Triplet {

    public static void main(String[] args) {
        System.out.println(productOfTriplets(1000));
        findTripletsUsingNestedLoop(1000);
    }

    public static long productOfTriplets(int number) {
        long product = -1;
        for(int a=1; a<=number/3; a++) {
            int b = (number*number - 2 * number * a) / ( 2 * (number-a) );
            int c = number - a - b;
            if( a*a + b*b == c*c && a + b + c == number) {
                product = a * b * c;
            }
        }
        return product;
    }

    public static void findTripletsUsingNestedLoop(int number) {
        for(int i=1; i<=number/3; i++) {
            for(int j=i+1; j<=number/2; j++) {
                int k = number - i - j;
                if(i*i + j*j == k*k) {
                    System.out.println("Triplets are i="+i+", j="+j+", k="+k);
                }
            }
        }
    }

}
