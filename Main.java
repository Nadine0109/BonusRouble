public class Main {
    public static void main(String[] args) {
        int cashflowinKopecks = 1600_00;
        int onebonus = 100_00;
        int bonustotal = cashflowinKopecks / onebonus;
        int limit = 1000_00;
        if (cashflowinKopecks < limit) {
            bonustotal = 0;
        }
        System.out.println(bonustotal);
    }
}