import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

class HomeWork11 {
    public static void main (String[] args) {
        List<String> list = convertToList(args);

        String text = list.toString();
        AtomicLong totalCharCount = new AtomicLong();
        Map<Character, Long> charsCount = new TreeMap<>();

        text.chars().forEach(ch -> {
            if (ch == ',' || ch == '.' || ch == ' ' || ch == '[' || ch == ']'|| ch == '!'|| ch == '?') {
                return;

            } else {
                totalCharCount.incrementAndGet();
                Character character = (char) ch;
                charsCount.put(character, charsCount.getOrDefault(character, 0L) + 1);
            }
        });
        System.out.println("totalCharCount: " + totalCharCount);
        System.out.println("chars:");
        charsCount.forEach((k,v) -> System.out.format("'%s': %s\n", k, v));

    }

    public static <T> List<T> convertToList(T arr[]) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list;
    }
}
