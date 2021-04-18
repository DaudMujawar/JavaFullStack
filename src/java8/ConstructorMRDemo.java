package java8;



public class ConstructorMRDemo {
    public static void main(String[] args) {
        InterfaceMessage message=Message::new;
        message.getMsg("hii");
    }
}
interface InterfaceMessage{
    Message getMsg(String msg);
}
class Message{
    Message(String msg){
        System.out.println(msg);
    }
}
