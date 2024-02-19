package ru.vbutkov.ocp;

import org.springframework.jdbc.object.MappingSqlQuery;
import ru.vbutkov.srp02.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FindPersonByIdMappingSqlQuery extends MappingSqlQuery<Person> {

    @Override
    protected Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
