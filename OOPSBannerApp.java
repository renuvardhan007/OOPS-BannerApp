public class OOPSBannerApp {
    static class CharacterPattern {
        private char character;
        private String[] pattern;
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                "  ******  ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                " **    ** ",
                "  ******  "
        });
        CharacterPattern p = new CharacterPattern('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });
        CharacterPattern s = new CharacterPattern('S', new String[]{
                "  ****** ",
                " **      ",
                " **      ",
                "  ****** ",
                "      ** ",
                "      ** ",
                " ******  "
        });
        CharacterPattern[] letters = {o, o, p, s};
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern letter : letters) {
                line.append(letter.getPattern()[i]).append("   ");
            }
            System.out.println(line);
        }
    }
}