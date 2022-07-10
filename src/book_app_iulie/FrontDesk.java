package book_app_iulie;

public class FrontDesk {
    public static void main(String[] args) {
        Library library = new Library();
        // adaugam carti
        Book book = new Book("Book1", "John Author1", 30); //creem carte
        Book book1 = new Book("Book2", "Author1", 54);
        Book book2 = new Book("Book3", "John Author2", 54);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.printBooks();
        boolean isPalindrom = library.isPalindrom("eba");
       // String[] foundBooks = library.findBooksByAuthor("Author1");
       // find name of author using contains from library in found
        String[] foundBooks = library.findBooksByAuthor("John");
        for(int i = 0; i< foundBooks.length; i++){
            System.out.println(foundBooks[i]);
        }
    }
}

