package org.example.code;

import java.util.ArrayList;
import java.util.List;

public class Java8 {
    public static void main(String[] args) {
        int number = 2317895;
        List<Integer> lis = new ArrayList<>();

        while (number > 0) {

            int k = number % 10;
            lis.add(k);
            number = number / 10;


        }
        for (int i = lis.size() - 1; i >= 2; i--) {
            if ((lis.get(i).intValue() == lis.get(i - 1).intValue() - 1) && (lis.get(i - 1).intValue() == lis.get(i - 2).intValue() - 1)) {
                System.out.println(lis.get(i) + "" + lis.get(i - 1) + "" + lis.get(i - 2));

            }

        }


    }
}

