import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(9, 8, 8, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1));
        String str = "one one two three three three four";
        System.out.println(nums);
        printOdd(nums);
        printEven(nums);
        printWithoutDuplicate(str);
        print(str);
        print2(str);
    }

    static void printOdd(List<Integer> num) {
        for (Integer nums : num) {
            if (nums % 2 == 0) {
                System.out.print(nums + " ");
            }
        }
        System.out.println();
    }

    static void printEven(List<Integer> num) {
        Set<Integer> set = new TreeSet<>(num);
        for (Integer nums : set) {
            if (nums % 2 != 0) {
                System.out.print(nums + " ");
            }
        }
        System.out.println();
    }

    static void printWithoutDuplicate(String str) {
        Set<String> strWithoutDuplicate = new LinkedHashSet<>(List.of(str.split("\\s+")));
        for (String string : strWithoutDuplicate) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    static void print(String str) {
        ArrayList<String> strings = new ArrayList<>(List.of(str.split("\\s+")));
        Set<String> words = new LinkedHashSet<>(strings);
        for (String word : words) {
            System.out.println(word + " : " + Collections.frequency(strings, word));
        }
    }

    static void print2(String str) {
        ArrayList<String> strings = new ArrayList<>(List.of(str.split("\\s+")));
        HashMap<String, Integer> words = new HashMap<>();
        for (String word : strings) {
            if (!words.containsKey(word)) {
                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }
        }
        for (int num: words.values()){
            if (num > 1){
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println(words);
        List<Integer> num = new ArrayList<>(words.values());
        System.out.println(num);
    }

}
