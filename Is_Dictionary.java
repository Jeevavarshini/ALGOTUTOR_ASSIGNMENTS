import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static boolean canFormString(List<String> wordList, String target) {
        Set<String> usedWords = new HashSet<>();
        return canFormStringHelper(wordList, target, usedWords);
    }
    private static boolean canFormStringHelper(List<String> wordList, String target, Set<String> usedWords) {
        if (target.isEmpty()) {
            return true;
        }
        for (String word : wordList) {
            if (!usedWords.contains(word) && target.startsWith(word)) {
                usedWords.add(word); 
                if (canFormStringHelper(wordList, target.substring(word.length()), usedWords)) {
                    return true;
                }
                usedWords.remove(word);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<String> wordList = List.of("apple", "banana", "orange", "peach");
        String target1 = "applebanana";
        String target2 = "bananaorange";
        String target3 = "peachappleorange";
        System.out.println(canFormString(wordList, target1));
        System.out.println(canFormString(wordList, target2)); 
        System.out.println(canFormString(wordList, target3)); 
    }
}
