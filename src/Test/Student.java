package Test;

public class Student {
    int id;
    String name;
    String address;
    int marks;

    public Student(int id, String name, String address, int marks) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Daud", "Sangli", 75);
        Student student1=new Student(2,"Uday","Kirloskarwadi",55);
        Student student2=new Student(3,"Mohan","Miraj",80);
        Student student3=new Student(4,"Nilesh","Bisur",60);
        Student student4=new Student(5,"Shubham","Budhgaon",70);


        student.show();
        student1.show();
        student2.show();
        student3.show();
        student4.show();
    }

    public void show() {
        if (marks >= 70) {
            System.out.println("Id:" + id + "  Name:" + name + "  Address:" + address + "  Marks:" + marks);
        }
    }
}


