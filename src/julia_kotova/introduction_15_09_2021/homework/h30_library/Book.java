package julia_kotova.introduction_15_09_2021.homework.h30_library;

public class Book {

    private String nameBook;
    private String descriptionBook;
    private String yearIssueBook;
    private String genreBook;
    private String authorBook;

    public Book(String nameBook, String descriptionBook, String yearIssueBook, String genreBook, String authorBook) {
        this.nameBook = nameBook;
        this.descriptionBook = descriptionBook;
        this.yearIssueBook = yearIssueBook;
        this.genreBook = genreBook;
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getDescriptionBook() {
        return descriptionBook;
    }

    public void setDescriptionBook(String descriptionBook) {
        this.descriptionBook = descriptionBook;
    }

    public String getYearIssueBook() {
        return yearIssueBook;
    }

    public void setYearIssueBook(String yearIssueBook) {
        this.yearIssueBook = yearIssueBook;
    }

    public String getGenreBook() {
        return genreBook;
    }

    public void setGenreBook(String genreBook) {
        this.genreBook = genreBook;
    }

    public String getAuthorBookBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return nameBook + "\n" +
                "Author: " + authorBook + "\n" +
                "Description: " + descriptionBook + "\n" +
                "Year of issue: " + yearIssueBook + "\n" +
                "Genre: " + genreBook;
    }

}
