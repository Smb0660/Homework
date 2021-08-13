package dicimalToHexadecimal;

import java.util.Collections;
import java.util.LinkedList;

public class DecimalToHexadecimal {
    LinkedList convertedList = new LinkedList();

    public void converting(int num) {
        while (num > 0) {
            if (num % 16 == 10)
                convertedList.add('A');
            else if (num % 16 == 11)
                convertedList.add('B');
            else if (num % 16 == 12)
                convertedList.add('C');
            else if (num % 16 == 13)
                convertedList.add('D');
            else if (num % 16 == 14)
                convertedList.add('E');
            else if (num % 16 == 15)
                convertedList.add('F');
            else {
                convertedList.add(num % 16);
            }
            num /= 16;
        }
        Collections.reverse(convertedList);
        System.out.println(convertedList);
    }

    }

