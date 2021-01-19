package test.string;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "ad5f1111adfd5fa5df113dd";
        String[] arr = str.split("[a-z]+");
        System.out.println(Arrays.toString(arr));
    }
}
