package stringtest.day_02;

import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/23 0023 19:10
 */
public class MatchDemo {

    public static void main(String[] args) {
        String s = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean b = input.matches(s);
        System.out.println(b);

    }

}
