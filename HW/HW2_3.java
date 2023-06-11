// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
// // Пример:
// Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
// Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
// Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
package HW;

import java.util.Arrays;

public class HW2_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i]>=10 && numbers[i]<=99){
                sum+=i;
            }
        }
        System.out.println(sum);
        for(int i = 0 ;i < numbers.length;i++){
         if (numbers[i]< 0){
            numbers[i]= sum;
         }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
