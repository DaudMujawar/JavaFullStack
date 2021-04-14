package java8;

public class MethodReferencesDemo {

    public static void main(String[] args) {
//        MyInterface1 obj=MethodReferencesDemo::display; //for static methods
//        System.out.println(obj.show());

        MethodReferencesDemo obj=new MethodReferencesDemo();
        MyInterface1 interface1=obj::display1;  //for non static methods
        System.out.println(obj.display1());
    }

    private static String display(){
        return "Hello";
    }

    private String display1(){
        return "Hiii";
    }
}

interface MyInterface1{
    String show();
}
