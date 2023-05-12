import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private int age;
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", 30);
        System.out.println(person.getFirstName()); // output: Jan
        System.out.println(person.getLastName()); // output: Kowalski
        System.out.println(person.getAge()); // output: 30
        System.out.println(person.toString()); // output: Person(firstName=Jan, lastName=Kowalski, age=30)
        person.setAge(35);
        System.out.println(person.getAge()); // output: 35
    }
}