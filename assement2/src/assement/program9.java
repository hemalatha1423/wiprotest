package assement;
import java.util.*;

class program9 {
    public String identifyPossibleWords(String input1, String input2) {
        String[] words = input2.split(":");
        List<String> matches = new ArrayList<String>();
        for (String word : words) {
            if (word.length() != input1.length()) {
                continue;
            }
            boolean match = true;
            for (int i = 0; i < input1.length(); i++) {
                char c1 = input1.charAt(i);
                char c2 = word.charAt(i);
                if (c1 != '_' && Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                matches.add(word.toUpperCase());
            }
        }
        if (matches.isEmpty()) {
            return "ERROR-009";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matches.size(); i++) {
            sb.append(matches.get(i));
            if (i < matches.size() - 1) {
                sb.append(":");
            }
        }
        return sb.toString();
    }
}
