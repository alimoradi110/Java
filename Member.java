package library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private Integer id =250110;
    private Integer age;
    private List<Book> books = new ArrayList<>();

    public Member(String name, Integer age, Library library) {
        this.name = name;
        library.getMembers().add(this);
        this.id += library.getMembers().size();
        this.age = age;
        System.err.println("sabte nam ba mova faghiat anjam shod");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<String> browedBooks() {
        List<String> browedbook = new ArrayList<>();
        for (Book book : books) {
            browedbook.add(book.getName());
        }
        System.out.println(browedbook);
        return browedbook;
    }
}
