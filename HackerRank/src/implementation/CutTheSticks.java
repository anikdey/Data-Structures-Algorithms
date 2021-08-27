package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        //inputList.add(5);inputList.add(4);inputList.add(4);inputList.add(2);inputList.add(2);inputList.add(8);
        inputList.add(1);inputList.add(2);inputList.add(3);inputList.add(4);inputList.add(3);inputList.add(3);inputList.add(2);inputList.add(1);
        System.out.println(cutTheSticks(inputList));

    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> result = new ArrayList<>();
        return getCutsNumber(arr, result, 0);
    }

    public static List<Integer> getCutsNumber(List<Integer> inputList, List<Integer> outputList, int currentMinIndex) {

        int tempMin = currentMinIndex;

        int currentMinNumber = inputList.get(currentMinIndex);
        int numberOfCuts = 0;
        for(int i=currentMinIndex; i<inputList.size(); i++) {
            int currentNumber = inputList.get(i);
            if(currentNumber > currentMinNumber) {
                currentNumber = currentNumber - currentMinNumber;
                inputList.set(i, currentNumber);
                numberOfCuts++;
            } else if(currentNumber>0 && currentNumber<=currentMinNumber) {
                inputList.set(i, 0);
                tempMin = i+1;
                numberOfCuts++;
            }
        }
        outputList.add(numberOfCuts);
        currentMinIndex = tempMin;
        if(currentMinIndex<inputList.size())
            return getCutsNumber(inputList, outputList, currentMinIndex);
        return outputList;
    }


}
