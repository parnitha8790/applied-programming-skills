class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result=prices.clone();
        Stack<Integer>Stack=new Stack();
        for(int i=0;i<prices.length;i++){
            while(!Stack.isEmpty()&&prices[Stack.peek()]>=prices[i]){
                result[Stack.pop()]-=prices[i];
            }
            Stack.add(i);
        }
        return result;
    }
}