import java.util.HashMap;
import java.util.Map;
public class BannerAppUC8 {
    static Map<Character, String[]> patternMap = new HashMap<>();
    public static void main(String[] args) {
        loadPatterns();
        String word = "OOPS";
        renderBanner(word);
    }
    static void loadPatterns() {
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }
    static void renderBanner(String word) {
        int height = 5;
        for (int row = 0; row < height; row++) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }
}