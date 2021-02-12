public class Main {
    public static void main(String[] args) {
        int currentAccount = 300_00;
        int cashFlowInKopecks = 1600_00;
        int oneBonus = 100_00;
        int limitForBonus = 1000_00;
        int bonus;
        if (cashFlowInKopecks < limitForBonus) {
            bonus = 0;
        } else {
            bonus = cashFlowInKopecks / oneBonus;
        } int currentAccountUpdated = currentAccount / 100  + cashFlowInKopecks / 100 + bonus;

        System.out.println(bonus);
        System.out.println(currentAccountUpdated);
    }
    }