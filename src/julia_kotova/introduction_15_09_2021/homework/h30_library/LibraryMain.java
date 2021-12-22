package julia_kotova.introduction_15_09_2021.homework.h30_library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static julia_kotova.introduction_15_09_2021.homework.h30_library.LibraryObject.*;

public class LibraryMain {

    static List<Author> AUTHOR_LIST = new ArrayList<>();
    static List<Genre> GENRE_LIST = new ArrayList<>();
    static List<Book> BOOK_LIST = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        System.out.println("Pick object AUTHOR, GENRE, BOOK or CLOSE.");

        while (!(input = bufferedReader.readLine()).equals("CLOSE")) {

            try {

                LibraryObject libraryObject = valueOf(input);

                switch (valueOf(input)) {

                    case AUTHOR -> {

                        System.out.println("Pick function PRINT, ADD or DELETE.");
                        String inputAuthor = bufferedReader.readLine();

                        if (Objects.equals(inputAuthor, "PRINT")) {

                            printAuthor();
                            System.out.println(("Pick object AUTHOR, GENRE, BOOK or CLOSE."));

                        } else if (Objects.equals(inputAuthor, "ADD")) {

                            System.out.println("Input author name: ");
                            String nameAuthor = bufferedReader.readLine();

                            System.out.println("Input author surname: ");
                            String surnameAuthor = bufferedReader.readLine();

                            Author author = new Author(nameAuthor, surnameAuthor);
                            AUTHOR_LIST.add(author);

                            System.out.println("Congratulations! New author added. Pick object AUTHOR, GENRE, BOOK or CLOSE.");

                        } else if (Objects.equals(inputAuthor, "DELETE")) {

                            printAuthor();

                            System.out.println("Enter the sequence number from the list: ");
                            int authorDelete = Integer.parseInt(bufferedReader.readLine());
                            AUTHOR_LIST.remove(authorDelete - 1);
                            System.out.println("Author deleted. Pick object AUTHOR, GENRE, BOOK or CLOSE.");

                        }

                    }
                    case GENRE -> {

                        System.out.println("Pick function PRINT, ADD or DELETE.");
                        String inputGenre = bufferedReader.readLine();

                        if (Objects.equals(inputGenre, "PRINT")) {

                            printGenre();
                            System.out.println(("Pick object AUTHOR, GENRE, BOOK or CLOSE."));

                        } else if (Objects.equals(inputGenre, "ADD")) {

                            System.out.println("Input genre name: ");
                            String nameGenre = bufferedReader.readLine();

                            System.out.println("Input genre description: ");
                            String descriptionGenre = bufferedReader.readLine();

                            Genre genre = new Genre(nameGenre, descriptionGenre);
                            GENRE_LIST.add(genre);
                            System.out.println("Congratulations! New genre added. Pick object AUTHOR, GENRE, BOOK or CLOSE.");

                        } else if (Objects.equals(inputGenre, "DELETE")) {

                            printGenre();
                            System.out.println("Enter the sequence number from the list: ");
                            int genreDelete = Integer.parseInt(bufferedReader.readLine());
                            GENRE_LIST.remove(genreDelete - 1);
                            System.out.println("Genre deleted. Pick object AUTHOR, GENRE, BOOK or CLOSE.");

                        }

                    }
                    case BOOK -> {

                        System.out.println("Pick function PRINT, ADD or DELETE.");
                        String inputBook = bufferedReader.readLine();

                        if (Objects.equals(inputBook, "PRINT")) {

                            printBook();
                            System.out.println(("Pick object AUTHOR, GENRE, BOOK or CLOSE."));

                        } else if (Objects.equals(inputBook, "ADD")) {

                            System.out.println("Input book name: ");
                            String nameBook = bufferedReader.readLine();

                            printAuthor();
                            System.out.println("Pick author name: enter the sequence number from the list: ");
                            int authorNumber = Integer.parseInt(bufferedReader.readLine());
                            String authorBook = String.valueOf(GENRE_LIST.get(authorNumber - 1));

                            System.out.println("Input book description: ");
                            String descriptionBook = bufferedReader.readLine();

                            System.out.println("Input book year of issue: ");
                            String yearIssueBook = bufferedReader.readLine();

                            printGenre();
                            System.out.println("Pick book genre: enter the sequence number from the list: ");
                            int genreNumber = Integer.parseInt(bufferedReader.readLine());
                            String genreBook = String.valueOf(GENRE_LIST.get(genreNumber - 1));

                            Book book = new Book(nameBook, authorBook, descriptionBook, yearIssueBook, genreBook);
                            BOOK_LIST.add(book);

                            System.out.println("Congratulations! New book added. Pick object AUTHOR, GENRE, BOOK or CLOSE.");

                        } else if (Objects.equals(inputBook, "DELETE")) {

                            printBook();

                            System.out.println("Enter the sequence number from the list: ");
                            int bookDelete = Integer.parseInt(bufferedReader.readLine());
                            BOOK_LIST.remove(bookDelete - 1);
                            System.out.println("Book deleted. Pick object AUTHOR, GENRE, BOOK or CLOSE.");

                        }
                    }

                }

            } catch (Exception e) {
                System.out.println("Pick object AUTHOR, GENRE, BOOK or CLOSE.");
            }

        }

    }

    public static void printAuthor() {
        System.out.println("Authors: ");
        int countAuthor = 1;
        for (Author author : AUTHOR_LIST) {
            System.out.println(countAuthor + ". " + author.toString());
            countAuthor++;
        }
    }

    public static void printGenre() {
        System.out.println("Genres: ");
        int count = 1;
        for (Genre genre : GENRE_LIST) {
            System.out.println(count + ". " + genre.toString());
            count++;
        }
    }

    public static void printBook() {
        System.out.println("Books: ");
        int count = 1;
        for (Book book : BOOK_LIST) {
            System.out.println(count + ". " + book.toString());
            count++;
        }
    }

}
