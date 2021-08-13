package decimalToBinary;

import java.text.CollationElementIterator;
import java.util.*;
public class DecimalToBinary {
    ArrayList<Integer> convertedList = new ArrayList<>();
    public void converting(int num){
        int number = num;
        while (num >=2){
            convertedList.add(num % 2);
            num = num / 2;
        }
        if (number > 0) convertedList.add(0);
        else convertedList.add(1);
        Collections.reverse(convertedList);
        System.out.println(convertedList);
    }
}
