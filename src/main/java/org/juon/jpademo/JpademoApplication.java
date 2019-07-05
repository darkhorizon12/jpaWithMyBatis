package org.juon.jpademo;

import org.juon.jpademo.persons.Person;
import org.juon.jpademo.persons.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JpademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpademoApplication.class, args);
    }

    @Bean
    public CommandLineRunner lineRunner(PersonRepository repository) {
        return (args) -> {
//            long cnt = repository.findAll().stream().count();
//            if (cnt > 0) {
//                repository.deleteAll();
//            }
            repository.save(new Person("name2", 32));
            repository.save(new Person("name3", 33));
            repository.save(new Person("name1", 31));

            repository.findAll().stream().forEach(System.out::println);
        };
    }

}
