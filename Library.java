package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books = new ArrayList<>();
    private List<Book> availablebooks = new ArrayList<>();
    private List<Book> browedbooks = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Library(String name) {
        this.name = name;
    }

    public Member addMember(String name, Integer ID, Integer age) {
        Member member = new Member(name, age, this);
        members.add(member);
        return member;
    }

    public Book addBook(String name, String aouturage, Integer pages, Integer price, Library library) {
        Book book = new Book(name, aouturage, pages, price, library);
        books.add(book);
        availablebooks.add(book);
        return book;
    }

    public void lending(Book book, Member member) {
        if (availablebooks.contains(book)) {
            browedbooks.add(book);
            availablebooks.remove(book);
            member.getBooks().add(book);
            System.err.println("ketabe " + book.getName() + " amanat dadeh shod");
        } else {
            System.err.println("The Book is not Available");
        }


    }

    public void restore(Book book, Member member) {
        browedbooks.remove(book);
        availablebooks.add(book);
        member.getBooks().remove(book);
        System.err.println("Ketabe " + book.getName() + " bazgardandeh shod");
    }

    public List<String> getAvailableBookNames() {
        List<String> names = new ArrayList<>();
        for (Book book : availablebooks) {
            names.add(book.getName());
        }
        return names;
    }


    public List<Book> getAvailablebooks() {

        return availablebooks;
    }

    public List<String> getBrowedbooksname() {
        List<String> names = new ArrayList<>();
        for (Book book : browedbooks) {
            names.add(book.getName());


        }

        return names;
    }

    public List<Book> getBrowedbooks() {
        return browedbooks;
    }

    public void showuserinfo(Member member) {
        String name = member.getName();
        Integer id = member.getId();
        Integer age = member.getAge();
        List<String> browedbook = new ArrayList<>();
        for (Book book : member.getBooks()) {
            browedbook.add(book.getName());
        }
        if (browedbook != null) {
            System.out.println("Name: " + name + " ID: " + id + " Age: " + age + " Browed book:" + browedbook);
        } else {
            System.out.println("Name: " + name + " ID: " + id + " Age: " + age + " not browed book");
        }
    }
}
