import java.util.Arrays;
public class ArraysExercises {

    public static class Person {
        private String name;

        public Person(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] updatedPerson = Arrays.copyOf(people,people.length + 1);
        updatedPerson[updatedPerson.length - 1] = newPerson;
        return updatedPerson;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jake");
        people[2] = new Person("Jim");

        Person newPerson = new Person("Jill");

        people = addPerson(people, newPerson);

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}