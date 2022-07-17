public class Main {
    public static void main(String[] args) {
        int threshold = 1000; // порог пополнения для бонусов
        int accountRefill; // пополнение счета
        int amount = 100; // начальная сумма на счету
        int bonus; // бонус за пополнение
        accountRefill = 1100;
        if (accountRefill > threshold) {
            bonus = accountRefill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus + " Бонусов за пополнение баланса");
        System.out.println(amount + accountRefill + bonus + " Итоговый счёт");
    }
}