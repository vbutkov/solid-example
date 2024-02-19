package ru.vbutkov.srp03;

import org.springframework.jdbc.object.MappingSqlQuery;
import ru.vbutkov.srp02.Person;
import ru.vbutkov.srp02.PersonId;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;

public class FindPersonByIdMappingSqlQuery
        extends MappingSqlQuery<Person>
        implements FindPersonByIdSpi {

    @Override
    public Optional<Person> findPersonById(PersonId personId) {
        return this.executeByNamedParam(Map.of("personId", personId))
                .stream().findFirst();
    }

    @Override
    protected Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
