package ch07.item45;

public class Person {

    private String name;
    private int age;
    private Sex sex;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Sex sex) {
        this(name, age);
        this.sex = sex;
    }

    public Person(String name, int age, String sex) {
        this(name, age, Sex.valueOf(sex));
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public enum Sex {
        MALE, FEMALE
    }
}
