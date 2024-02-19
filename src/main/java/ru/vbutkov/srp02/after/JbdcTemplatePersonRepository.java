package ru.vbutkov.srp02.after;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class JbdcTemplatePersonRepository implements PersonRepository, RowMapper<Person> {

    JdbcTemplate jdbcTemplate;

    @Override
    public Optional<Person> findById(PersonId id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(
                "select * from t_person where id = ?", this, id.id()
        ));
    }

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
