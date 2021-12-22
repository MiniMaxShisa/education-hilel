package julia_kotova.introduction_15_09_2021.homework.h25_family;

public class FamilyTree {

    public static void main(String[] args) {

        System.out.println("Members:");
        Member member1 = new Member("Jhon", "Watson");
        Member member2 = new Member("Mary", "Watson");
        Member member3 = new Member("Sherlock", "Holmes");
        Member member4 = new Member("Irene", "Adler");
        Member member5 = new Member("Bubenchik", "Holmes");
        Member.printCount();

        Member.Family family1 = new Member.Family(member3, member1, member2);
        Member.Family family2 = new Member.Family(member5, member3, member4);

    }

}
