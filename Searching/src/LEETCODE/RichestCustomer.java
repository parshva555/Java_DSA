package LEETCODE;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomer {
    public static void main(String[] args) {

    }
    public int maximumWealth(int [] [] accounts){
        // Person row
        // account col
        int answer = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new column, take a sum for that new row
            int sum =0;
            for(int account = 0; account< accounts[person].length; account++){
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall answer
            if (sum > answer){
                answer = sum;
            }
        }
        return answer;
    }
}
