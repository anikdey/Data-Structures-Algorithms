public class Test {


    public static void main(String[] args) {

        System.out.println(Gcd(12, 18));

    }


    public static int Gcd(int x,int y){
        int modulus =0;
        int result =0;


        while (y>0){
            modulus=y%x;

            if (modulus!=0){
                result=modulus;
                modulus=x%modulus;
                y=modulus;
            }else{
                y=modulus;
                result=x;
            }
        }
        return result;
    }

}
