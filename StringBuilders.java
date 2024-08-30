
public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        // sb.append(" is a good boy");
        System.out.println(sb);
        System.out.println(sb.charAt(2));

        sb.append('b');
        // sb.reverse();
        System.out.println(sb);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char f = sb.charAt(front);
            char b = sb.charAt(back);
            sb.setCharAt(front, b);
            sb.setCharAt(back, f);

        }
        System.out.println(sb);
    }
}
