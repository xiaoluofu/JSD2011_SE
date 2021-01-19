package exception;

/**
 * @author Hollow
 * @create 2020/12/30 0030 9:15
 * 使用当前类测试异常的抛出
 */
public class Person {
    private int age;
    public int getAge() {

        return age;
    }
    public void setAge(int age) throws IllegalAgeExeception {
        if (age<0||age>100){
            throw new IllegalAgeExeception("年龄不合法"+age);
        }
        this.age = age;
    }
}
