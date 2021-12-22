package julia_kotova.introduction_15_09_2021.homework.h25_family;

public class Member {

    public static int COUNT;

    private String name;
    private String surname;

    public Member() {
    }

    public Member(String name, String surname) {

        this.name = name;
        this.surname = surname;
        COUNT++;
        System.out.println(this);

    }

    public static class Family {

        private Member child;
        private Member father;
        private Member mother;

        public Family() {
        }

        public Family(Member child, Member father, Member mother) {

            this.child = child;
            this.father = father;
            this.mother = mother;

            System.out.println(this);
        }

        @Override
        public String toString() {

            return child + "'s family:" +
                    " father - " + father +
                    ", mother - " + mother + ".";

        }

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void setName() {
        this.name = name;
    }

    public void setSurname() {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return getFullName();
    }

    public static void printCount() {
        System.out.println("Number of members: " + Member.COUNT);
        System.out.println();
    }

}
