package control_statement;

public class IfStatementDemo {
    public static void main(String[] args) {
        int a=10,b=20,c=15,d=25;
        int g=0;

        if(a>b && a>c && a>d){
            System.out.println("a is greater");
        }else if(b>c && b>d){
            System.out.println("b is greater");
        }
        else if(c>d){
            System.out.println("c is greater");
        }
        else{
            System.out.println("d is greater");
        }


        int age = 18;
        String nationality = "Indian";

        if(age >=18){
            if(nationality=="Indian"){
                System.out.println("You can vote");
            }else{
                System.out.println("You are not indian");
            }
        }else {
            System.out.println("You can not vote");
        }

        int s= g>0?100:200;
        System.out.println(s);

    }

}
