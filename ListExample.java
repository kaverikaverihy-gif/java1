import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("John");
        names.add("Priya");
        names.add("Rahul");
        names.add("Sneha");
        names.remove("John");
        System.out.println("Final List: " + names);
    }
}
