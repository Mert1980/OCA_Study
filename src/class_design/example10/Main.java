package class_design.example10;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        while(isAvailable(x)){
            System.out.println(x);
            x--;
        }
    }

    private static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }
}
