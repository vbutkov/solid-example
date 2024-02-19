package ru.vbutkov.srp02.after;

import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.util.Optional;

public interface PersonRepository {

    Optional<Person> findById(PersonId id);
}
