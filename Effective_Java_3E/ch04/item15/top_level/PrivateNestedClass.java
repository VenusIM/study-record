package ch04.item15.top_level;

class PrivateNestedClass implements TopLevelClass{

    private String info = this.getClass().getName();

    /**
     *  필드에 접근 가능
     */
    private class InnerClass {
        private String privateInfo = this.getClass().getName();
        void info() {
            System.out.println(privateInfo+"."+info);
        }
    }

    public class PublicInnerClass {

    }

    public void info() {
        InnerClass innerClass = new InnerClass();
        innerClass.info();
        System.out.println(innerClass.privateInfo);
    }
}
