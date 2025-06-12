package am.order.homeworkForMap;

public class Task2 {
    public static void main(String[] args) {

        PhoneBook person = new PhoneBook();

        person.addContact("Anahit", "098653827");
        person.addContact("Vahe", "098235643");
        person.addContact("Mari", "0964523422");
        person.addContact("Anahit", "0987337644");
        person.addContact("Mher", "077356432");

        System.out.println(person);

        person.deleteContact("Mari");

        System.out.println(person);



    }
}
