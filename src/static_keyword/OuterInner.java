package static_keyword;

public class OuterInner {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.show();

//        Outer.Inner inner=outer.new Inner();            when nothing(private or static)

//        Outer.Inner inner=new Outer.Inner();          for static keyword line no 28
//        inner.InnerShow();

    }
}

class Outer{
    int i=10;

    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.InnerShow();
    }
    public void show(){
        System.out.println(i);
    }

    private class Inner{
        int i=18;

        public void InnerShow(){
            System.out.println(i);
        }
    }
}
