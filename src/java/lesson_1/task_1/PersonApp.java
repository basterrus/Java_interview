package lesson_1.task_1;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .addFirstName("Peter")
                .addLastName("Peterson")
                .addGender("Male")
                .build();
        System.out.println(person);
    }
}
