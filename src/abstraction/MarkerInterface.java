package abstraction;
interface MyInterface{

}

public class MarkerInterface implements MyInterface{
    private void show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {
        MarkerInterface markerInterface=new MarkerInterface();
        if (markerInterface instanceof MyInterface){
            markerInterface.show();
        }
    }
}
