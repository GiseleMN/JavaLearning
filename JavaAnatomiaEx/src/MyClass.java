public class MyClass {
    public static void main(String[] args) {

        String firstName = "Gisele";
        String lastName = "Nisimura";

        String nameCompleted = nameCompleted(firstName, lastName);

        System.out.println(nameCompleted);
    }

    public static String nameCompleted(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }

}
