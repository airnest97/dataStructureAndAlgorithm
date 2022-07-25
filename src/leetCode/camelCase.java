package leetCode;


public class camelCase {
    public static void main(String[] args) {
        System.out.println(removeString("BOB lOVES-coding"));
    }

    public static StringBuilder removeString(String s){
        String[] element = s.split("[^a-zA-Z\\d]");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < element.length; i++) {
            String word =element[i];
            if (i == 0){
                sb.append(word.toLowerCase());
            } else {
                char firstChar = word.charAt(0);
                sb.append(word.replace(firstChar,
                        Character.toUpperCase(firstChar)).replace(word.substring(1),
                        word.substring(1).toLowerCase()));
            }
        }
        return sb;
    }
}
