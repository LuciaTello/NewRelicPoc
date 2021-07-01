package newrelicpoc;

import newrelicpoc.model.Person;
import newrelicpoc.service.Generator;

import java.util.ArrayList;
import java.util.List;

public class NewRelicPocMain {

    public static void main(String[] args) throws InterruptedException {

        List<Person> personList = new ArrayList<>();
        Generator generator = new Generator();

        while (personList.size() < 1000) {
            Person person = Person.builder()
                    .name(generator.generateRandomString(100))
                    .age(generator.generateRandomInteger())
                    .build();
            personList.add(person);

            System.out.println(person.toString());

            Thread.sleep(5000);
        }
    }
}
