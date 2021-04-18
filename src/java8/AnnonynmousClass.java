package java8;

public class AnnonynmousClass {
    public static void main(String[] args) {
        MyInterface3 myInterface3=new MyInterface3() {
            @Override
            public String msg() {
                return "hello";
            }
        };
        System.out.println(myInterface3.msg());
    }
}

//If interface contains only one abstract method then this is functional interface
@FunctionalInterface
interface MyInterface3{
    String msg();

    String toString();  //toString is default method so it is allowed
}
