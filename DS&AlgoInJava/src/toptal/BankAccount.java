package toptal;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {

    public static void main(String[] args) {

        int[] A = {100, 100, 100};
        String[] D = {"2020-12-31", "2020-12-22","2020-12-03"};
        System.out.println(solution(A, D));

        int[] A1 = {180, -50, -25, -25};
        String[] D1 = {"2020-01-01", "2020-01-01","2020-01-01", "2020-01-31"};
        System.out.println(solution(A1, D1));

        int[] A2 = {1, -1, 0, -105, 1};
        String[] D2 = {"2020-12-31", "2020-04-04","2020-04-04","2020-04-14", "2020-07-12"};
        System.out.println(solution(A2, D2));

        int[] A3 = {100, 100, -10, -20, -30};
        String[] D3 = {"2020-01-01", "2020-02-01","2020-02-11","2020-02-05", "2020-02-08"};
        System.out.println(solution(A3, D3));

    }


    public static int solution(int[] A, String[] D) {
        int balance = 0;
        int monthToBeCharged = 12;
        String prevMonth = null;
        Map<String, Integer[][]> map = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            int amount = A[i];
            balance += amount;
            prevMonth = D[i].split("-")[1];
            if(map.containsKey(prevMonth)) {
                Integer[][] array = map.get(prevMonth);
                if(amount<0){
                    int count = array[0][0];
                    array[0][0] = count+1;
                    int prevAmount = array[0][1];
                    array[0][1] = prevAmount+amount;
                    map.put(prevMonth, array);
                }
            } else {
                Integer[][] array = new Integer[1][2];
                array[0][0] = 1;
                array[0][1] = 0;
                if(amount<0)
                    array[0][1] = amount;
                map.put(prevMonth, array);
            }
        }

        for(Map.Entry<String, Integer[][]> entry : map.entrySet()) {
            Integer[][] arr = entry.getValue();
            int abs = Math.abs(arr[0][1]);
            if(arr[0][0]>=3 && abs>=100)
                monthToBeCharged--;
        }

        int amountToBeCharged = monthToBeCharged * 5;
        return balance - amountToBeCharged;
    }



}
