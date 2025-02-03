public class YearlyMaintenanceCost {
    public static void main(String[] args) {

        int winterCosts = 800;
        int springCosts = 400;
        int summerCosts = 600;
        int fallCosts = 300;
        int yearlyCosts;

        yearlyCosts = winterCosts + springCosts + summerCosts + fallCosts;

        System.out.println("Your costs for Winter are: $" + winterCosts);
        System.out.println("Your costs for Spring are: $" + springCosts);
        System.out.println("Your costs for Summer are: $" + summerCosts);
        System.out.println("Your costs for Fall are: $" + fallCosts);

        System.out.println("Your costs for for the year are: $" + yearlyCosts);

    }
}