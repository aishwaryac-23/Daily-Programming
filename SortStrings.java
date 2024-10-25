import java.util.Arrays;

public class SortStrings {

    public static void main(String[] args) {

        String[] strings = {"orange", "apple", "banana", "grape"};

        Arrays.sort(strings);

        System.out.println("Sorted Strings:");

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
