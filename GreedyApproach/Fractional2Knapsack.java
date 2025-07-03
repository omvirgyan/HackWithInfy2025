import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Fractional2Knapsack {

    static class Knapsack {
        int value, weight;

        Knapsack(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static void Solution(Knapsack[] items, int W) {
        Arrays.sort(items, Comparator.comparingDouble((Knapsack a) -> (double) a.value / a.weight).reversed());

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Knapsack item : items) {
            if (currentWeight + item.weight <= W) {
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                int remaining = W - currentWeight;
                totalValue += ((double) item.value / item.weight) * remaining;
                break;
            }
        }

        System.out.printf("Maximum value in knapsack: %.2f\n", totalValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int n = sc.nextInt();

        System.out.println("Enter max weight capacity of knapsack:");
        int W = sc.nextInt();

        Knapsack[] items = new Knapsack[n];

        System.out.println("Enter value and weight for each item:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Knapsack(value, weight);
        }

        Solution(items, W);
        sc.close();
    }
}
