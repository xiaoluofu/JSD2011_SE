package stringtest.day_02;

/**
 * @author Hollow
 * @create 2020/12/23 0023 19:03
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "人被杀就会死";
        StringBuilder builder = new StringBuilder(str);
        builder.append(",你说的这是废话");
        System.out.println(builder.toString());
        builder.delete(6,20);
        System.out.println(builder.toString());
        builder.replace(5,6,"活");
        System.out.println(builder.toString());
        builder.insert(4,"不");
        System.out.println(builder.toString());
    }
}
