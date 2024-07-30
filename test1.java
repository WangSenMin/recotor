package ClassTest.collection;

import java.util.ArrayList;
import java.util.List;

//@SuppressWarnings({"all"})
public class test1 {
    public static void main(String[] args) {
        List book = new ArrayList();
        book.add(new Book("红楼梦", 25, "曹雪芹"));
        book.add(new Book("西游记", 10, "吴承恩"));
        book.add(new Book("三国演义", 50, "罗贯中"));
        book.add(new Book("水浒传", 18, "施耐庵"));
        book.add(new Book("三国演义", 100, "罗贯中"));

        sort(book);
//        Object Object = null;

        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));
        }
    }

    public static void sort(List book) {
        for (int i = 0; i < book.size() - 1; i++) {
            for (int j = i + 1; j < book.size() - 1; j++) {
                Book o = (Book) book.get(i);
                Book o1 = (Book) book.get(j);
                if (o.getPrice() > o1.getPrice()) {
//                   Object =  book.get(i);
                    book.set(i, o1);
                    book.set(j, o);
                }

            }
        }
    }
}

class Book {
    private String name;
    private double price;

    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return name + "\t\t\t\t" + price + "\t\t\t\t" + author + "";
    }
}