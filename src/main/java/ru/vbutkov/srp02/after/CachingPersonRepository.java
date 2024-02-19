package ru.vbutkov.srp02.after;

import org.springframework.cache.Cache;
import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.util.Optional;


public class CachingPersonRepository implements PersonRepository {
    Cache cache;
    PersonRepository delegate;

    @Override
    public Optional<Person> findById(PersonId id) {
        return Optional.ofNullable(cache.get(id, Person.class))
                .or(() -> delegate.findById(id).map(person -> {
                    cache.put(person.id(), person);
                    return person;
                }));
    }
}
