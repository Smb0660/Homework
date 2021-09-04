package myString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] array = {' ',' ',' ','A', 'a', 'B', 'a', 'S', 's',' ',' '};
        char[] array1 = {' ',' ',' ','a', 'A', 'b', 'S', 'A', 'A',' ',' '};
        char[] array2 = {'A', 'a', 'B',};

        MyString string = new MyString(array);
        System.out.println(MyString.valueOf(1000));
        System.out.println(string.indexOf('a'));
        System.out.println(string.lastIndexOf('a'));
        System.out.println(string.lastIndexOf('a',3));
        System.out.println(string.contains(array2));
        System.out.println(string.trim());
        System.out.println(string.subString(3, 7));
        System.out.println(string.subString(3));
        System.out.println(string.equalIgnoreCase(array1));
        System.out.println(string.charAt(5));
        System.out.println(string.isEmpty());
        System.out.println(string.length());
        System.out.println(string.getCharArray());
    }
}
