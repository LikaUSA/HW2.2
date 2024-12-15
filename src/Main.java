public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // начальный баланс
        int refill = 1100; //пополнение счета
        int bonus; //бонус
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        String bonusMoney = (bonus + refill + initialBalance + " " + "рублей");

        System.out.println("Подарочный бонус за пополнение счета превышающий 1000 рублей");
        System.out.println("У вас" + " " + (bonusMoney));


    }
}

