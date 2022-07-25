package ru.netology.FilmManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestFilmManager {

    @Test
    public void shouldAddNullFilms() {

        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFewFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] expected = {"film1", "film2", "film3", "film4", "film5"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastTen() {
        FilmManager manager = new FilmManager();
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 6");
        manager.addFilm("film 7");
        manager.addFilm("film 8");
        manager.addFilm("film 9");
        manager.addFilm("film 10");
        manager.addFilm("film 11");
        manager.addFilm("film 12");

        String[] actual = manager.findLastFilms();
        String[] expected = {
                "film 12",
                "film 11",
                "film 10",
                "film 9",
                "film 8",
                "film 7",
                "film 6",
                "film 5",
                "film 4",
                "film 3",
        };

        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastFive() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 6");
        manager.addFilm("film 7");
        manager.addFilm("film 8");
        manager.addFilm("film 9");
        manager.addFilm("film 10");
        manager.addFilm("film 11");
        manager.addFilm("film 12");

        String[] actual = manager.findLastFilms();
        String[] expected = {
                "film 12",
                "film 11",
                "film 10",
                "film 9",
                "film 8"
        };

        assertArrayEquals(expected, actual);
    }

}
