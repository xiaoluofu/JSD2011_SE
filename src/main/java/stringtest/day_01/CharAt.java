package stringtest.day_01;

/**
 * @author Hollow
 * @create 2020/12/22 0022 19:07
 */
public class CharAt {
    public static void main(String[] args) {
        String index = "abdf153545";
        char a = index.charAt(5);
        System.out.println(a);
        String b = "上海自来水来海上";
        for (int i = 0;i<=b.length()/2;i++){
            char start = b.charAt(i);
            char end = b.charAt(b.length()-1-i);
            if (start != end){
                System.out.print("不");
                break;
            }
        }
        System.out.println("是回文");
    }
}
