package sample;

public class Test {
    public void add(){
        System.out.println("Hello");
    }
    public int display(){
        return 3;
    }

    public static void main(String[] args) {
        Test demo= new Test();
        demo.add();
        demo.display();
    }
}
