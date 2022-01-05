package array;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices2 = new int[]{1, 2, 3, 4, 5};
        int[] prices3 = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices)+ "\n");
        System.out.println(maxProfit(prices2)+ "\n");
        System.out.println(maxProfit(prices3)+ "\n");
    }

    public static int maxProfit(int[] prices) {

        int buy;
        int sell;
        int profit = 0;

        for (int i = 0; i < prices.length ; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    buy = prices[i];
                    sell = prices[j];
                    profit = profit + (sell - buy);
                    i = j;
                } else break;
            }
        }
        return profit;
    }
}
