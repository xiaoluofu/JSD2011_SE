package test_04_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {

		Random ran = new Random();
		int[] arr = new int[10];
		boolean[] b = new boolean[101];
		for (int i =0;i<10;i++){
			int num = ran.nextInt(101);
			while (b[num]){
				num = ran.nextInt(101);
			}
			b[num] = true;
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));

		List<Integer> list = new ArrayList<>();
		for (int i =0;i<10;i++) {
			int num2 = ran.nextInt(101);
			while (list.contains(num2)) {
				num2 = ran.nextInt(101);
			}
			list.add(num2);
		}
		System.out.println(list);

	}
}
