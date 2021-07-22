package library.operation;
import library.book.BookList;

import java.util.Scanner;
public interface IOperation {
    Scanner scan = new Scanner(System.in);
    void work(BookList bookList);
}
