package string;

public class StringBufferDemo {
    public static void main(String[] args) {
//        String buffer is mutable object
        StringBuffer stringBuffer=new StringBuffer("Java");
        stringBuffer.append("Programming");
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.charAt(0));     //for which character at this position
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.delete(0,3));       //for delete from ...to position
    }
}
