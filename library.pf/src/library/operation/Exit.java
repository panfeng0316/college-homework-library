package library.operation;
import library.book.BookList;

public class Exit implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        bookList.save();
        System.exit(1);
    }
}