package test_03;

/**
 * @author Hollow
 * @create 2020/12/28 0028 20:10
 */


public class Animal {
    public String noise() {
        return "Animal";
    }
    public static void main(String[] args) {
        Cat cat = null;
        Animal animal = new Dog();
        if (animal instanceof Animal) {
            cat = (Cat) animal;
            System.out.println(cat.noise());
        } else {
            System.out.println("animal is not Cat's instance");
        }
        byte a=1,b=2,c,d;
        final byte e=1,f=2,g=3;
//        c=a+b;
//        c=e+f;
//        c=a+e;
//        c=e+a;





    }
}
class Dog extends Animal {
    public String noise() {
        return "Dog";
    }
}
class Cat extends Animal {
    public String noise() {
        return "Cat";
    }
}