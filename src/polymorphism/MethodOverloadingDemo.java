package polymorphism;

public class MethodOverloadingDemo {
    int c=0;

    public static void main(String[] args) {
        MethodOverloadingDemo demo= new MethodOverloadingDemo();
        demo.show();
        demo.add(5,4,5,3);

    }
    public int showDisplay(){
        return 1;
    }
    public void show(){
        System.out.println("In show 2");
    }
    public void add(int i,int j,int k){
        c=i+j+k;
        System.out.println(c);
    }
    public void add(int i, int j,int k,int l){
        c=i+j+k+l;
        System.out.println(c);
    }
}
class MethodOverriding extends MethodOverloadingDemo{
    public static void main(String[] args) {
        MethodOverriding methodOverriding= new MethodOverriding();
        methodOverriding.show();
    }
    public void show(){
        System.out.println("In Method overriding");
    }
}
