package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //        String buffer is immutable object
        //        String buffer is non synchronized
        StringBuilder stringBuilder=new StringBuilder("JavaProgramming");
        stringBuilder.append("Language");
        System.out.println(stringBuilder);
    }
}
