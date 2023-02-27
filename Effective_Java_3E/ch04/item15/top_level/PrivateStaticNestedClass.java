package ch04.item15.top_level;

class PrivateStaticNestedClass implements TopLevelClass {

    private static String staticInfo = PrivateStaticNestedClass.class.getName();

    /**
     * 중첩 클래스
     * 필드에 접근이 불가하며 별개의 클래스
     * 그러나 동일한 static 의 경우 접근 가능
     * InnerClass를 감싸고 있는 외부클래스 PrivateStaticNestedClassClass에서 접근 가능하다.
     */
    private static class InnerClass {
        private static String privateInfo = InnerClass.class.getName();
        private static void info() {
            /*
            System.out.println(super.getClass().getName()+"."+info);
            */
            System.out.println(privateInfo+"."+staticInfo);
        }
    }

    public static class TestInnerClass {
    }

    public void info() {
        InnerClass.info();
        System.out.println(InnerClass.privateInfo);
    }
}