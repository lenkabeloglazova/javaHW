package HW4;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class HW4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
        List<Integer> ourDeque = new LinkedList<>();
            for (Integer i = 1; i <=5; i++ ){
                ourDeque.add(i);
            }

        System.out.println(ourDeque);
        ourDeque.sort(Comparator.reverseOrder());
         System.out.println(ourDeque);


    }
    
}