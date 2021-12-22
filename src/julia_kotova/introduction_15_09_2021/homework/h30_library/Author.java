package julia_kotova.introduction_15_09_2021.homework.h30_library;

public class Author {

    private String surnameAuthor;
    private String nameAuthor;

    public Author(String surnameAuthor, String nameAuthor) {
        this.surnameAuthor = surnameAuthor;
        this.nameAuthor = nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }

}
