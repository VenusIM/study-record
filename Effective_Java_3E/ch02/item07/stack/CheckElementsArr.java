package ch02.item07.stack;

import java.lang.reflect.Field;

public class CheckElementsArr {
    public static void main(String[] args) throws ClassNotFoundException {

        Class stack = Class.forName("java.util.Stack");
        Field[] fields = stack.getSuperclass().getDeclaredFields();

        String fieldName;
        for(Field field : fields) {
            fieldName = field.getName();
            if(fieldName.equals("elementData")) {
                System.out.print(field.getType()+" "+fieldName);
                break;
            }
        }


}
}
