class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, double price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = 0;
    }

    public Book(String name, double price, Author author, int qty) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + ",author=" + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}