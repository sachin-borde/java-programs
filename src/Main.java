import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.firstNonRepeatedCharacter("google"));
    }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

}