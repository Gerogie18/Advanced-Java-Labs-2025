package Week1;

public class InvestCase {
    public static void main(String[] args) {
        double investedAmount = 1000.0;
        double annualProfitPercentage = 0.05;
        int year = 0;

        System.out.printf("year %2d: $%,.2f %n", year, investedAmount);

        for (year = 1; year <=10; year ++ ) {
            double profit = investedAmount*annualProfitPercentage;
            investedAmount += profit;
            System.out.printf("year %2d: $%,.2f %n", year, investedAmount);
        }
    }
}
