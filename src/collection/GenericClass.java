package collection;

public class GenericClass<T> {
    private T t;

    private void add(T t){
        this.t=t;
    }

    private T get(){
        return t;
    }

    public static void main(String[] args) {
        GenericClass obj=new GenericClass();
        obj.add(4);
        System.out.println(obj.get());

        GenericClass obj1=new GenericClass();
        obj1.add("String");
        System.out.println(obj1.get());
    }
}
