/*Best Time to Buy and Sell Stock
 You are given an array of prices where prices[i] is the price of a
 given stock on an ith day.
 You want to maximize your profit by choosing a single day to buy
 one stock and choosing a different day in the future to sell that
 stock.
 Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0
 Input: prices = [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6),
 profit = 6-1 = 5.*/

import java.util.Scanner;
class BestBuySell{
static int maxProfit(int[] prices){
int n=prices.length;
int mini=prices[0];
int p=0;
for(int i=1;i<n;i++){
int diff=prices[i]-mini;
p=Math.max(p,diff);
mini=Math.min(mini,prices[i]);
}
return p;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++)
a[i]=sc.nextInt();

System.out.println(maxProfit(a));

}
}