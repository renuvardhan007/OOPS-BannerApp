import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    public static void main(String[] args) {
        Map<Character, String[]> patterns = new HashMap<>();
        patterns.put('O', new String[]{
                "  ******  ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                "  ******  "
        });
        patterns.put('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });
        patterns.put('S', new String[]{
                "  ****** ",
                " **      ",
                " **      ",
                "  ****** ",
                "      ** ",
                "      ** ",
                " ******  "
        });
        char[] banner = {'O','O','P','S'};
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : banner) {
                line.append(patterns.get(c)[i]).append("   ");
            }
            System.out.println(line);
        }
    }
}