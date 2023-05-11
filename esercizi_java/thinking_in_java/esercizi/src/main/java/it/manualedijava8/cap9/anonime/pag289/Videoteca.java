package it.manualedijava8.cap9.anonime.pag289;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Videoteca {
    private Film[] films;

    public Videoteca() {
        caricaFilms();
    }
    public List<Film> getFilmDiFantascienza() {

        List<Film> filmDiFantascienza=new ArrayList<>();
        for (int i = 0; i < films.length; i++) {
            if ("Fantascienza".equals(films[i].getGenere())) {
                filmDiFantascienza.add(films[i]);
             }
        }
        return filmDiFantascienza;
    }


    public List<Film> getBeiFilm() {
        List<Film> beiFilms=new ArrayList<>();
        for (int i = 0; i < films.length; i++) {
            if (films[i].getMediaRecensione()>3) {
                beiFilms.add(films[i]);
            }
        }
        return beiFilms;
    }

    private void caricaFilms() {
        List<Film> elencoFilms = new ArrayList<>();
        elencoFilms.add(new Film("Film1", Genere.Horror.value(), 1));
        elencoFilms.add(new Film("Film2", Genere.Sentimentale.value(), 2));
        elencoFilms.add(new Film("Film3", Genere.Fantascienza.value(), 5));
        elencoFilms.add(new Film("Film4", Genere.Sentimentale.value(), 2));
        elencoFilms.add(new Film("Film5", Genere.Sentimentale.value(), 3));
        elencoFilms.add(new Film("Film6", Genere.Horror.value(), 4));
        elencoFilms.add(new Film("Film7", Genere.Sentimentale.value(), 4));
        elencoFilms.add(new Film("Film8", Genere.Fantascienza.value(), 2));
        elencoFilms.add(new Film("Film9", Genere.Sentimentale.value(), 2));
        films= new Film[elencoFilms.size()];
        elencoFilms.toArray(this.films);

    }
}
