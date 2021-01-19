package stringtest.day_02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/23 0023 19:10
 */
public class SplitDemo {
    public static void main(String[] args) {
        String a = "ajifdssf123df22ddddd66";
        String arr[] = a.split("[0-9]+");
        System.out.println(Arrays.toString(arr));
        String arr2[] = a.split("[a-z]+");
        System.out.println(Arrays.toString(arr2));
    }
}
