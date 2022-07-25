package ru.netology.FilmManager;

public class FilmManager {

    private static String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {

        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {

        return films;
    }


    public String[] findLastFilms() {
        int resultLeight;
        if (films.length >= limit) {
            resultLeight = limit;
        } else {
            resultLeight = films.length;
        }
        String[] result = new String[resultLeight];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
