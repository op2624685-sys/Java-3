package projects.PersonIdification;

public class Identify {
    public static void main(String[] args) {
        person per1 = new person("Mohit", 26);
        person per2 = new person("Sohit", 26);
        person per3 = new person("Mohit", 30);

        // identify using equals() 
        System.out.println(per1.equals(per3));
        System.out.println(per1.equals(per2));
    }
}
