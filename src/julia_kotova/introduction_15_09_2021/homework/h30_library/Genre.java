package julia_kotova.introduction_15_09_2021.homework.h30_library;

public class Genre {

    private String nameGenre;
    private String descriptionGenre;

    public Genre(String nameGenre, String descriptionGenre) {
        this.nameGenre = nameGenre;
        this.descriptionGenre = descriptionGenre;
    }

    public String getNameGenre() {
        return nameGenre;
    }

    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    public String getDescriptionGenre() {
        return descriptionGenre;
    }

    public void setDescriptionGenre(String descriptionGenre) {
        this.descriptionGenre = descriptionGenre;
    }

    @Override
    public String toString() {
        return nameGenre + "\n" +
                descriptionGenre;
    }

}
