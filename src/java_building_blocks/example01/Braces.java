package java_building_blocks.example01;

public class Braces {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 8;
        for (int i = 0; i < 3; i++)
            if (num1 == num2)
                try {
                    System.out.println("t");
                } catch (Exception e) {
                    System.out.println("c");
                }
    }
}

