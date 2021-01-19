package test_02;

import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位以上.
 * 
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
 *
 * 
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 * 
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String name = "^[a-zA-Z0-9_]{3,15}$";
		String age = "[0-9]{1,3}";
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的用户名，格式为：3-15位,内容只能是数字,字母下,划线");
		boolean flag1 = true;
		boolean flag2 = true;

		while (flag1) {

			String inputName = scan.nextLine();
			if (inputName.matches(name)) {
				System.out.println("请输入您的年龄，在1-100之间哦");
				flag1 = false;
			}else {
				System.out.println("您输入的用户名，格式错误，请看上面的格式,重新输入");
			}
		}
		while (flag2){
			String inputAge = scan.nextLine();
			if (inputAge.matches(age)) {
				int i = Integer.parseInt(inputAge);
				if (i>=1 && i<=100){
					System.out.println("恭喜您注册成功");
					flag2 = false;
				}else{
					System.out.println("请在1-100之间输入");
				}
			}else{
				System.out.println("您输入的年龄，格式错误，请看上面格式，重新输入");
			}
		}
	}
}





