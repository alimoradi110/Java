package library;

public class Book {
    private String name;
    private String aouturage;
    private Integer pages;
    private Integer price;

    public Book(String name, String aouturage, Integer pages, Integer price, Library library) {
        library.getAvailablebooks().add(this);
        this.name = name;
        this.aouturage = aouturage;
        this.pages = pages;
        this.price = price;
        System.err.println("ketab"+name+"ba movafaghiat ezafe shod");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAouturage() {
        return aouturage;
    }

    public void setAouturage(String aouturage) {
        this.aouturage = aouturage;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
