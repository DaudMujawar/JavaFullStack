package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    int id;
    String name;
    String address;

    public Student(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public static void main(String[] args) {
        Student student=new Student(1,"Nilesh","Miraj");
        Student student1=new Student(3,"Shubham","Sangli");
        Student student2=new Student(2,"Ashutosh","Pune");

        List<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);

        Collections.sort(list);

        list.forEach(s->{
            System.out.println("Id:"+s.id+" Name:"+s.name+" Address:"+s.address);
        });
    }

//    for sorting name wise
    @Override
    public int compareTo(Student student){
        return this.address.compareTo(student.address);
    }


//    for sorting id wise

//    @Override
//    public int compareTo(Student student) {
//        if(this.id==student.id){
//        return 0;}
//        else if (this.id>student.id){
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }
}
