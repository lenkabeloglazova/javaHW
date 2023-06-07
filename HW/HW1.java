package HW;

//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//        Пример ввода:
//        1 2 1 2 -1 1 3 1 3 -1 0
public class HW1 {
    public static void main(String[] args) {
    int []array = {1,2,1,2,-1,1,3,1,3,-1,0};
        System.out.print(summ(array));
    }
    static int summ(int []nums)
    {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
                result = result + nums[i-1];
        }
        return result;
    }
}