package HW.HW3;

public class HW3 {
    /**
     * @param args
     */
     public static void main(String[] args) {
        String[][] product = {
            {"Высший сорт молочного шоколада", "200","2-й сорт" },
            {"Молоко высшего сорта", "150", "2-й сорт"},
            {"Заводской хлеб,","100","1-й сорт"},
            {"Высший молочный сыр","300","1-й сорт"}
        };
        for (int i = 0; i < product.length; i++) {
            String name = product[i][0];
            int price = Integer.parseInt(product[i][1]);
            String sort = product[i][2];
            int maxPrice = 0;
            
            if (name.contains("высший") && (sort.equals("1-й сорт") || sort.equals("2-й сорт"))) {
               
             if (price > maxPrice);
             maxPrice = price;
              
            
        }
        
        
        System.out.println(maxPrice);;
}
     }
    }