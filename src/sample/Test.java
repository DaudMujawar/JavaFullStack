package sample;

public class Test {
    public void add(){
        System.out.println("Hello");
    }
    public void display(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test demo= new Test();
        demo.add();
        demo.display(3);
    }
}
