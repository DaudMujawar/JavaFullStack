package final_keyword;

public class FinalKeywordDemo {
    //final classes can not be inherited
    final int i = 41;     //final variable

    public static void main(String[] args) {
        final int i;
        i = 21;

        FinalKeywordDemo finalKeywordDemo = new FinalKeywordDemo();
        finalKeywordDemo.show();
    }

    public final void show() {
        System.out.println(i);
    }
}

class FinalKeywordOverriding extends FinalKeywordDemo {
//    int i=23;
//
//    @Override
//    public void show(){
//        System.out.println(i);
//    }

    public static void main(String[] args) {
        FinalKeywordOverriding obj = new FinalKeywordOverriding();
        obj.show();
    }
}
