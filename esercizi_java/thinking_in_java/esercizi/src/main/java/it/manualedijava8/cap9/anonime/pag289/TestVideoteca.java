package it.manualedijava8.cap9.anonime.pag289;

import java.util.List;

public class TestVideoteca {
    public static void main(String[] args) {
        Videoteca videoteca= new Videoteca();
        System.out.println("Film di Fantascienza:");
        List<Film> filmDiFantascienza = videoteca.getFilmDiFantascienza();
        for (Film film : filmDiFantascienza) {
            System.out.println(film);
        }

        System.out.println("Film belli:");
        List<Film> filmBelli = videoteca.getBeiFilm();
        for (Film film : filmBelli) {
            System.out.println(film);
        }

    }
}
