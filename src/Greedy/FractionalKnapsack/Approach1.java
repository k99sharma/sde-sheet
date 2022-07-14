package Greedy.FractionalKnapsack;

// Approach: Greedy
// Time Complexity: O(n log(n))
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static class Item{
        int value, weight;

        public Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }

    public static class ItemValue{
        Double cost;
        double weight, value, id;

        public ItemValue(int weight, int value, int id){
            this.value = value;
            this.weight = weight;
            this.id = id;
            this.cost = (double) value / (double) weight;
        }
    }

    public static double fractionalKnapsack(int W, Item[] items, int n){
        ItemValue[] itemValues = new ItemValue[n];
        for(int i=0; i<n; i++){
            itemValues[i] = new ItemValue(items[i].weight, items[i].value, i+1);
        }

        // sort items by value
        Arrays.sort(itemValues, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });

        // variable to store total value
        double totalValue = 0d;

        for(ItemValue item : itemValues){
            int currentWeight = (int) item.weight;
            int currentValue = (int) item.value;

            // taking whole item if W is greater than current weight
            if(W-currentWeight >= 0){
                W = W - currentWeight;
                totalValue += currentValue;
            }else{
                // fraction we can take
                double fraction = (double)W / (double) currentWeight;
                totalValue += currentValue * fraction;
                W = (int) (W - (fraction * currentWeight)); // calculating left weight
                break; // because no more item can be packed
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int W = in.nextInt();
        Item[] items = new Item[n];

        for(int i=0; i<n; i++){
            int value = in.nextInt();
            int weight = in.nextInt();
            items[i] = new Item(value, weight);
        }

        double maxProfit = fractionalKnapsack(W, items, n);
        System.out.println(maxProfit);
    }
}
