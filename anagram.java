public class anagram {
    public static void main(String[] args) {
        String str = "silent";
        String str1 = "listeon";
        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();
        if (!java.util.Arrays.equals(arr, arr1)) {
            System.out.println("an anagram");
            return;
        }
        System.out.println("anagram");
    }
}
