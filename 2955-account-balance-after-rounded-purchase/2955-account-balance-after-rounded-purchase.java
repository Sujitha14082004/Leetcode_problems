class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int amount=(purchaseAmount+5)/10*10;
        return 100-amount;
    }
}