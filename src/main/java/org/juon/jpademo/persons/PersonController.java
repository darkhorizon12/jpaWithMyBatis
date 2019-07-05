package org.juon.jpademo.persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/list")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @PostMapping("/add")
    public Person insert(@RequestBody Person person) {
        return personService.insert(person);
    }
}
