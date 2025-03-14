public class RemoveSubstring {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String toRemove = "World";
        String result = str.replace(toRemove, "");
        System.out.println(result);
    }
}
