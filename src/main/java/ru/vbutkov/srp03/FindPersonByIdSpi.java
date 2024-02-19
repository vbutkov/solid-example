package ru.vbutkov.srp03;

import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.util.Optional;

@FunctionalInterface
public interface FindPersonByIdSpi {
    Optional<Person> findPersonById(PersonId personId);
}
