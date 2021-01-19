package string;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//65-91 97-123
public class Test {
    //生成随机字母和数字
    public char[] ranArr(char []arr){
        Random random = new Random();
        for (int i = 0;i < arr.length;i++){
            int num = random.nextInt(10)+48;//0-9
            int letter1 = random.nextInt(26)+65;//A-Z
            int letter2 = random.nextInt(26)+97;//a-z
            int ran = random.nextInt(62);//共62个数
            if (ran < 10 ){
                arr[i] = (char)num;
            }else if (ran < 36){
                arr[i] = (char)letter1;
            }else {
                arr[i] = (char)letter2;
            }
        }
        return arr;
    }
    //打印数组并将数组转化为String类型并返回
    public String printArr(char arr[]){
        String code ="";
        StringBuilder builder = new StringBuilder(code);
        for (int i =0;i<arr.length;i++){
            builder.append(arr[i]);
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
    public boolean compareStr(String code,boolean flag){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String bigCode = code.toUpperCase();
        String bigInput = input.toUpperCase();

        if (bigCode.equals(bigInput)) {
            System.out.println("验证码输入正确");
            flag = false;

        }else{
            System.out.println("验证码输入错误，请重新输入");
        }
        return flag;
    }

    public static void main(String[] args) {
        char arr[] = new char[5];
        Test test = new Test();
        System.out.println("请输入验证码：");
        boolean flag = true;
        while (flag){
            test.ranArr(arr);//输错了继续生成随机数组
            String code = test.printArr(arr);
            flag = test.compareStr(code,flag);
        }
    }
}
