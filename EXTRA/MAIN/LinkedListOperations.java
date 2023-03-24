import java.util.LinkedList;
public class LinkedListOperations {
    public static void main(String[] args) {
        // Creating
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C");
        languages.add("SQL");
        System.out.println("LL: " + languages);

        // Traversing
        String str0 = languages.get(0);
        String str1 = languages.get(1);
        String str2 = languages.get(2);
        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);

        // Changing
        languages.set(4,"Java Script");
        System.out.println("Updated LL: " + languages);

        // Delete
        String del = languages.remove(3);
        System.out.println("Newly updated LL: " + languages);
    }
}
