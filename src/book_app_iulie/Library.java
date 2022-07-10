package book_app_iulie;

public class Library {
    Book[] bookList = new Book[100];
    int numberOfBooksAdded;

    public void printBooks() {
        for (int i = 0; i < numberOfBooksAdded; i++) {
            System.out.println(bookList[i]);
        }
    }

    public boolean addBook(Book book) {
        bookList[numberOfBooksAdded++] = book;
        return true;
    }

    public String[] findBooksByAuthor(String author) {
        String[] foundBooks = new String[numberOfBooksAdded];
        int numberOfFoundBooksAdded = 0;
        for (int i = 0; i < numberOfBooksAdded; i++) {
            if (author == bookList[i].author) {
                foundBooks[numberOfFoundBooksAdded++] = bookList[i].title;
                // metoda de cautare a unui nume de autor
                if (bookList[i].author.contains(author)) {
                    foundBooks[numberOfFoundBooksAdded++] = bookList[i].title;
                }
            }
            return foundBooks;
        }

        return foundBooks;
    }

    public boolean isPalindrom(String word) {
        boolean isPalindrom = false;
        String reverseString = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverseString = reverseString + word.charAt(i);
        }
        System.out.println(reverseString);
        if (word.equals(reverseString)) {
            isPalindrom = true;
            System.out.println(word+ " este palindrom");
        }
        System.out.println(word+ " nu este palindrom");
            return isPalindrom;
        }
    }

