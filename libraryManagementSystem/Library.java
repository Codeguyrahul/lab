package lab_2march;


import java.util.ArrayList;

class Book {
    int id;
    String name;
    String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(int id, String name, String author) {
        Book book = new Book(id, name, author);
        books.add(book);
        System.out.println("Book " + book.name + " added to the library.");
    }

    public void dispenseBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                books.remove(book);
                System.out.println("Book " + book.name + " dispensed.");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
}


	


