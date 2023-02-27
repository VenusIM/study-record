package ch04.item15.access_modifier.test_package;

public class PublicClass {
    public String info = this.getClass().getName();
}
