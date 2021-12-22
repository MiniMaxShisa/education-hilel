package julia_kotova.introduction_15_09_2021.classwork.l06_for_while_dowhile;

public class Bomb {

    public static void main(String[] args) {

        int timer = 10;
        do {
            if (timer == 3) {
                break;
            }

            System.out.println("До взрыва бомбы осталось: " + timer + " сек");
            timer--;
        } while(timer > 0);

        System.out.println("BOOM!");

    }

}
