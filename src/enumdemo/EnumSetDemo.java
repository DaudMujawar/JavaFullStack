package enumdemo;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetDemo {
    public static void main(String[] args) {
        Set<Color> set = EnumSet.of(Color.WHITE, Color.BLUE);
        Set<Color> colorSet = EnumSet.allOf(Color.class);

        colorSet.forEach(s -> {
            System.out.println(s);
        });
    }

    enum Color {
        WHITE, BLACK, ORANGE, BLUE
    }
}
