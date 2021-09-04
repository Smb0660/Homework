package myString;

public class MyString {
    private final int length;
    private final char[] charArray;

    public int getLength() {
        return length;
    }


    public static char[] valueOf(long l) {
        int num = (int) l;
        int length = 0;
        while (l > 0) {
            l /= 10;
            length++;
        }
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[length - 1 - i] = Character.forDigit(num % 10, 10);
            num /= 10;
        }
        return array;
    }

    public MyString(char[] string) {
        this.charArray = string;
        length = string.length;
    }

    public int indexOf(int ch) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int ch) {
        return lastIndexOf(ch, charArray.length - 1);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        for (int i = 0; i <= fromIndex; i++) {
            if (charArray[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(char[] array) {
        if (array.length > length) {
            return false;
        }
        int count = 0;
        int j = 0;
        for (char c : charArray) {
            if (c == array[j]) {
                count++;
                j++;
                if (count == array.length) {
                    return true;
                }
                continue;
            }
            j = 0;
        }
        return false;
    }

    public char[] trim() {
        int count = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != 32) {
                firstIndex = i;
                break;
            } else
                count++;
        }
        for (int i = charArray.length - 1; i > 0; i--) {
            if (charArray[i] != 32) {
                lastIndex = i;
                break;
            } else
                count++;
        }
        int j = 0;
        char[] array = new char[charArray.length - count];
        for (int i = firstIndex; i <= lastIndex; i++) {
            array[j] = charArray[i];
            j++;
        }
        return array;
    }

    public char[] subString(int firstIndex, int lastIndex) {
        if (firstIndex > 0 && firstIndex < charArray.length && lastIndex > 0 && lastIndex < charArray.length) {
            int newLength = lastIndex - firstIndex;
            char[] array = new char[newLength];
            for (int i = firstIndex, j = 0; i < lastIndex; i++, j++) {
                array[j] = charArray[i];
            }
            return array;
        } else
            throw new StringIndexOutOfBoundsException();
    }

    public char[] subString(int firstIndex) {
        if (firstIndex > 0 && firstIndex < charArray.length) {
            int newLength = charArray.length - firstIndex;
            char[] array = new char[newLength];
            for (int i = firstIndex, j = 0; i < charArray.length; i++, j++) {
                array[j] = charArray[i];
            }
            return array;
        } else
            throw new StringIndexOutOfBoundsException();
    }


    public boolean equalIgnoreCase(char[] anotherString) {
        if (charArray == anotherString) {
            return true;
        }
        if (charArray.length != anotherString.length) {
            return false;
        }
        boolean equal = false;
        for (int i = 0; i < charArray.length; i++) {
            if (Math.abs(charArray[i] - anotherString[i]) == 32 || charArray[i] == anotherString[i]) {
                equal = true;
            } else {
                return false;
            }
        }
        return equal;
    }

    public char[] getCharArray() {
        return charArray;
    }

    public char charAt(int index) {
        if (index < 0 || index >= length) {
            try {
                throw new StringIndexOutOfBoundsException("Not valid index");
            } catch (StringIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return charArray[index];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

}

