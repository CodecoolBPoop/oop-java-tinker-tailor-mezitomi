package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    private static List<Integer> calculateSequence(int K, int N) {
        //Create number array from 1 to N
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            numbers.add(i);
        }

        List<Integer> solutionArray = new ArrayList<>();
        int iterator = -1;
        while (numbers.size() > 0) {
            //Adding K to iterator
            iterator += K;
            iterator %= numbers.size(); // This way iterator never overflows original array's size

            //Removing from an array returns the removed item as well, so lets add that to the solution array, then lower the iterator
            solutionArray.add(numbers.remove(iterator--));
        }
        return solutionArray;
    }

    public static void main(String[] args) {
        List<Integer> solution = calculateSequence(3, 5);
        System.out.println(solution.toString());
    }
}
