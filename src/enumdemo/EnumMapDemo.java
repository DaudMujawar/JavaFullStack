package enumdemo;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Color, Integer> enumMap = new EnumMap<Color, Integer>(Color.class);
        enumMap.put(Color.BLACK, 1);
        enumMap.put(Color.ORANGE, 5);
        enumMap.put(Color.BLUE, 8);

        for (Map.Entry m : enumMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }

    }

    enum Color {
        WHITE, BLACK, ORANGE, BLUE
    }
}

