package org.juon.jpademo.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person insert(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(Long id) {
        return personRepository.findById(id).get();
    }

    public Person findByName(String name) {
        Optional<Person> person = personRepository.findByName(name);
        if (person.isPresent()) return person.get();
        else return null;
    }
}
