package static_keyword;

public class StaticKeywordDemo {
    static final String collegeName;

    static {
        collegeName = "KWC";
        System.out.println("In Static Block");
    }

    int id;
    String name;

    public static void show() {
        System.out.println("in Show Method");
    }

    public static void main(String[] args) {
        StaticKeywordDemo.show();

        StaticKeywordDemo obj1 = new StaticKeywordDemo();
        obj1.id = 1;
        obj1.name = "Uday";

        StaticKeywordDemo obj2 = new StaticKeywordDemo();
        obj2.id = 2;
        obj2.name = "Mohan";

        System.out.println();
        System.out.println("Id:" + obj1.id + "  Name:" + obj1.name + "  Company Name:" + collegeName);
        System.out.println("Id:" + obj2.id + "  Name:" + obj2.name + "  Company Name:" + collegeName);

    }


}
