package com.tests.javatests.movies.data;

import com.tests.javatests.movies.model.Genre;
import com.tests.javatests.movies.model.Movie;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {
    @Test
    public void load_all_movies() throws SQLException {
        //creando una base de datos en memoria
        DataSource dataSource =
                new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL","sa","sa");
        //ejecutando un scripts para crear la tabla de peliculas, las 3 pelis de ejemplo
        ScriptUtils.executeSqlScript(dataSource.getConnection(),new ClassPathResource("sql-scripts/test-data.sql"));

        //JdbcTemplate => creada para conexion de repositorio a base de datos
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        MovieRepositoryJdbc movieRepository = new MovieRepositoryJdbc(jdbcTemplate);

        //capturacion de las peliculas
        Collection<Movie> movies = movieRepository.findAll();

        //comprobacion de que el test haya salido correcto
        assertThat(movies, is(Arrays.asList(
                new Movie(1,"Dark Knight",152, Genre.ACTION),
                new Movie(2,"Memento",113, Genre.THRILLER),
                new Movie(3,"Matrix",136, Genre.ACTION)
                )));
    }
}