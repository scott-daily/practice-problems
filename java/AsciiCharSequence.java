/*
Write a class named AsciiCharSequence that implements compact storage of ASCII-character sequences. 
Their codes can be stored in one single byte, unlike Unicode characters. 
Compared to the standard String class, your class will half the memory (before Java 9).

The class AsciiCharSequence should:
1) implement the interface java.lang.CharSequence;
2) have a constructor that takes a byte array;
3) define methods length, charAt, subSequence, and toString.
*/

import java.nio.charset.Charset;
import java.util.*;

class AsciiCharSequence implements CharSequence {
    byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public char charAt(int index) {
        return  (char) array[index];
    }

    public CharSequence subSequence(int start, int end){
            byte[] slice = Arrays.copyOfRange(array, start, end-1);
            AsciiCharSequence subSeq = new AsciiCharSequence(slice);
            return subSeq;
        }

    public String toString() {
        return new String(array, Charset.defaultCharset());
    }
}