package leetCode;

public class StockChallenge {
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println(maximumProfit(array));
        System.out.println(maximumProfit2(array));
        System.out.println(maximumProfit3(array));
    }

    public static int maximumProfit(int[] price) {
        int profit = 0;
        for (int i = 0; i < price.length - 1; i++) {
            if (price[i + 1] > price[i]) {
                profit = price[i + 1] - price[i] + profit;
            }
        }
        return profit;
    }

    public static int maximumProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if ((price - minPrice) > maximumProfit) {
                maximumProfit = price - minPrice;
            }
        }
        return maximumProfit;
    }

    public static int maximumProfit3(int[] price) {
        int maxProfit = 0;
        int profit;
        for (int i = 0; i < price.length - 1; i++) {
            for (int j = i + 1; j < price.length; j++) {
                profit = price[j] - price[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
