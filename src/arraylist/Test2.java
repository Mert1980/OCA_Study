package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
     String[] arr = {"Hir", "How", "Are", "You"};
    List<String> arrList = new ArrayList<>(Arrays.asList(arr));
  //   List<String> arrList = Arrays.asList(arr);

        if(arrList.removeIf(s -> { // Exception in thread "main" java.lang.UnsupportedOperationException: remove
            System.out.print(s);
            return s.length() <= 2;
        })){
            System.out.println(" removed");
        };
        System.out.println();
        for (String str:arrList
        ) {
            System.out.println(str);
        }
    }
}
