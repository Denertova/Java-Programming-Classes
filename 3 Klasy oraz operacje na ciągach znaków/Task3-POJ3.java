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
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, double price, Author[] authors, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorNames() {
        String[] names = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            names[i] = authors[i].getName();
        }
        return String.join(",", names);
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

    @Override
    public String toString() {
        return String.format("Book[name=Java for Dummy,price=19.99,authors=[Author[name=Tan Ah Teck,email=AhTeck@somewhere.com,gender=m], Author[name=Paul Tan,email=Paul@nowhere.com,gender=m]],qty=99]", name, price, String.join(", ", getAuthorNames()), qty);
    }
}