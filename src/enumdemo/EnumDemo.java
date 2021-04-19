package enumdemo;

public class EnumDemo {
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c + " " + c.vl);

        }
    }

    enum Color {
        WHITE(1), ORANGE(2), BLACK(9), RED(6);

        int vl;

        Color(int v) {
            this.vl = v;
        }
    }
}
