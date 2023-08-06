import java.util.HashSet;
public class Solution {
    public static boolean isColorful(int number) {
        String numStr = String.valueOf(number);
        HashSet<Integer> subProducts = new HashSet<>();
        for (int i = 0; i < numStr.length(); i++) {
            int product = 1;
            for (int j = i; j < numStr.length(); j++) {
                int digit = Character.getNumericValue(numStr.charAt(j));
                product *= digit;
           if (subProducts.contains(product)) {
                    return false;
                }
                subProducts.add(product);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number1 = 3245;
        int number2 = 326;
        System.out.println(isColorful(number1)); 
        System.out.println(isColorful(number2)); 
    }
}
