package library.book;

import sun.security.krb5.internal.ccache.CredentialsCache;

import java.io.*;
import java.nio.file.ReadOnlyFileSystemException;

public class BookList {
    private Book[] books=new Book[10];
    private int usedSize;

    public BookList() {
        books[0] = new Book("离散数学", "顾晓峰", 56, "教材");
        books[1] = new Book("汉书", "班固", 76, "史书");
        books[2] = new Book("老人与海", "海明威", 56, "小说");
        this.usedSize = 3;
    }
    public void save(){
        File file = new File("books.txt");
        try {
            WriteFile(file, books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public void WriteFile(File file, Book[] books) throws IOException {
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Book s : books) {
            if (s==null){
                break;
            }
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public static void ReadFile(File file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        fr.close();
    }
}
