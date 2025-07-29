package chapter04;

// 예제 4-5
public class Book {
    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    // 예제에 int로 ISBN을 선언하였는데 적절하지 않은 것 같음
    public static void main(String[] args) {
        Book GOAT = new Book("The Fragrant Flower Blooms with Dignity 1", "三香見サカ", "9791170628606");
    }
}
