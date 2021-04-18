package java8;

interface MyInterface4 {
    static String add() {
        return "In static";
    }
    String show();
    default String msg(){
        return "Hii";
    }
}

interface MyInterface5 {
    default String msg() {
        return "Hello";
    }
}

public class DefaultAndStaticDemo implements MyInterface4, MyInterface5 {
    public static void main(String[] args) {
        DefaultAndStaticDemo demo = new DefaultAndStaticDemo();
        System.out.println(demo.show());
        System.out.println(demo.msg());
        System.out.println(MyInterface4.add());
    }

    @Override
    public String show() {
        return "show method";
    }

    @Override
    public String msg() {
        return "hii";
    }
}
