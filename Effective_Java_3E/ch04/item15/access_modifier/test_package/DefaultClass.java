package ch04.item15.access_modifier.test_package;

class DefaultClass {
    String info = this.getClass().getName();
}
