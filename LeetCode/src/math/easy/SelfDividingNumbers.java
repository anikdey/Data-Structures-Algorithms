package math.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(0, 10));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        outerLoop:
        for(int i=left; i<=right; i++) {
            int currentNumber = i;
            if(currentNumber==0)
                continue outerLoop;
            while (currentNumber != 0) {
                int rem = currentNumber % 10;
                if (rem == 0 || i % rem != 0)
                    continue outerLoop;
                currentNumber /= 10;
            }
            list.add(i);
        }

        return list;
    }

}
