public class StringDemo {
    public static void main(String[] args) {

        // --- Demonstrating immutability of String ---
        String str1 = "Hello";
        String str2 = str1.concat(" World");

        System.out.println("Original String: " + str1);
        System.out.println("New String after concatenation: " + str2);
        System.out.println("Are both strings same object? " + (str1 == str2));

        // --- Common String methods ---
        System.out.println("\n--- String Methods ---");
        System.out.println("Length: " + str2.length());
        System.out.println("Character at index 4: " + str2.charAt(4));
        System.out.println("Substring (0,5): " + str2.substring(0, 5));
        System.out.println("Equals 'Hello World'? " + str2.equals("Hello World"));
        System.out.println("Replace 'World' with 'Java': " + str2.replace("World", "Java"));

        // --- StringBuffer (Mutable) ---
        System.out.println("\n--- StringBuffer Demonstration ---");
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse(); // To get back
        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

        // --- StringBuilder (Mutable) ---
        System.out.println("\n--- StringBuilder Demonstration ---");
        StringBuilder sb2 = new StringBuilder("Mutable");
        sb2.append(" Object");
        System.out.println("After append: " + sb2);
    }
}

