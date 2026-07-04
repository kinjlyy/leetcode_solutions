// Last updated: 7/4/2026, 7:41:36 PM
class Solution {
    public String generateTag(String caption) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');

        boolean newword = true;
        boolean firstword = true;

        for (int i = 0; i < caption.length(); i++) {

            if (sb.length() == 100) break;

            char ch = caption.charAt(i);

            if (ch == ' ') {
                newword = true;
                continue;
            }

            if (newword) {
                if (firstword) {
                    sb.append(Character.toLowerCase(ch));
                    firstword = false;
                } else {
                    sb.append(Character.toUpperCase(ch));
                }
                newword = false;
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return sb.toString();
    }
}
