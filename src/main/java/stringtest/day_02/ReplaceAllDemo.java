package stringtest.day_02;

import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/23 0023 19:21
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String str = input.replaceAll("wdnmd|rlnml|cnm|tm|dsb","***");
        System.out.println(str);

    }
}
