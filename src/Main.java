import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 4);
        Rectangle r2 = new Rectangle(3, 4);
        Rectangle r3 = new Rectangle(1, 4);
        Rectangle[] rectangles = new Rectangle[]{r1, r2, r3};
        System.out.println("Initial array: " + Arrays.toString(rectangles));

        Arrays.sort(rectangles);
        System.out.println("Sorted array: " + Arrays.toString(rectangles));
    }
}
