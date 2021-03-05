package constructor_super_this;

public class Employee {
    int id;
    String name;
    String address;

    public Employee(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    private void show(){
        System.out.println("Id:"+id+"  Name:"+name+"  Address:"+address);
    }

    private void display(){
        this.show();
    }

    public static void main(String[] args) {
        Employee employee=new Employee(1,"Daud","Sangli");
        employee.show();
    }
}
