package ru.vbutkov.ocp;

import org.springframework.jdbc.object.MappingSqlQuery;
import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

public class FindPersonByIdMappingSqlQuery extends MappingSqlQuery<Person> {

    public Optional<Person> findPersonById(PersonId id) {
        return Optional.ofNullable(this.findObjectByNamedParam(Map.of("id", id.id())));
    }

    @Override
    protected Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Person(new PersonId(rs.getInt("id")));
    }
}
