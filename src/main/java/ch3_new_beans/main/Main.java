package ch3_new_beans.main;

import ch3_new_beans.beans.Parrot;
import ch3_new_beans.beans.Person;
import ch3_new_beans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

//        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());
//        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}