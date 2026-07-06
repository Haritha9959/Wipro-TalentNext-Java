package encapulationAndAbstraction;

import encapulationAndAbstraction.Author;
import encapulationAndAbstraction.Book;

public class BookDemo {

    public static void main(String[] args) {

        Author writer = new Author("Haritha", "haritha@gmail.com", 'F');

        Book book = new Book("Java Programming", writer, 599.50, 20);

        System.out.println("Book Name : " + book.getName());
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Author Email : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity : " + book.getQtyInStock());
    }
}

