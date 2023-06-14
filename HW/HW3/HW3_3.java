package HW.HW3;

public class HW3_3 {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Книга 1", "Иванов", 100, 2012, 101),
            new Book("Книга 2", "Андреев", 200, 2009, 97),
            new Book("Книга 3", "Петров", 150, 2015, 103),
            new Book("Книга 4", "Алексеев", 250, 2010, 89),
            new Book("Книга 5", "Сидоров", 300, 2014, 107)
        };
        
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            int pageCount = book.getPageCount();
            String author = book.getAuthor();
            int year = book.getYear();
            
            if (isPrime(pageCount) && author.contains("А") && year >= 2010) {
                System.out.println(book.getTitle());
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

class Book {
    private String title;
    private String author;
    private int price;
    private int year;
    private int pageCount;
    
    public Book(String title, String author, int price, int year, int pageCount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.pageCount = pageCount;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getPageCount() {
        return pageCount;
    }
}

