package reflect;

public class Student {
    private String name = "小明";
    private int age = 18;
    private int num = 1;

    public Student(){

    }
    public Student(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }

    public void sayHi(){
        System.out.println(name+"向大家问好");
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                '}';
    }
}
