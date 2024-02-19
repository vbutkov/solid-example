package ru.vbutkov.srp02.before;

import org.springframework.cache.Cache;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;


public class PersonRepository implements RowMapper<Person> {

    JdbcTemplate jdbcTemplate;
    Cache cache;

    Optional<Person> findById(PersonId id) {
        return Optional.ofNullable(cache.get(id, Person.class))
                .or(() -> Optional.ofNullable(jdbcTemplate.queryForObject(
                                "select * from t_person where id = ?", this, id))
                        .map(person -> {
                            cache.put(person.id(), person);
                            return person;
                        }));
    }


    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
