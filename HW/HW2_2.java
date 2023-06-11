// 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
package HW;

public class HW2_2 {
    public static void main(String[] args) {
        int[] N = { 2, 3, 5, 6 };
        int i = 0;
        boolean b = true;
        while (i < N.length) {
            if (i == N.length - 1) {
                break;
            }
            if (N[i] > N[i + 1]) {
                b = false;

            }
            i++;

        }
        if (b == false) {
            System.out.println("Not increasing");
        } else {
            System.out.println("Increasing");
        }
    }
}
        

