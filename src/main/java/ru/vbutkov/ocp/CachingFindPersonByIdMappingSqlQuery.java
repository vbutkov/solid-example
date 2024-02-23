package ru.vbutkov.ocp;

import org.springframework.cache.Cache;
import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.util.Optional;

public class CachingFindPersonByIdMappingSqlQuery extends FindPersonByIdMappingSqlQuery {
    private Cache cache;

    public Optional<Person> findPersonById(PersonId id, boolean useCache) {
        if (useCache) {
            return Optional.ofNullable(this.cache.get(id.id(), Person.class))
                    .or(() -> super.findPersonById(id)
                            .map(person -> {
                                this.cache.put(id.id(), person);
                                return person;
                            }));
        } else
            return this.findPersonById(id);
    }
}
