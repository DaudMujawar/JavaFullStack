package string;

public class StringDemo {
    public static void main(String[] args) {
        char[] arr = {'P', 'u', 'n', 'e'};
        String str = new String(arr);
        System.out.println(str);

        String str1 = "Mumbai is city";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.trim());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.charAt(2));

        String str2 = "Java";
        String str3 = "Java";
        String str4 = new String("java");
        String str5 = new String("java");

        System.out.println(str4 == str5); //reference

        System.out.println(str2.equals(str4));  //value

        System.out.println(str2.equalsIgnoreCase(str4));  //value
    }
}
