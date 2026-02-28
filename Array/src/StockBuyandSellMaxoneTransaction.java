public class StockBuyandSellMaxoneTransaction {

    static int maxProfit(int prices[]){

        int ans = 0;
        int min_element = prices[0];

        for(int i=0; i<prices.length; i++){

            min_element = Math.min(prices[i], min_element);

            int profit = prices[i] - min_element;

            ans = Math.max(profit,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int prices[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));

    }
}
