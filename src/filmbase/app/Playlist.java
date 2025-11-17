package filmbase.app;

import filmbase.data.Film;

import java.util.ArrayList;

public class Playlist {
    ArrayList<Film> filmPlaylist = new ArrayList<>();

    public void addFilmToPlaylist(Film film) {
        filmPlaylist.add(film);
    }

    //------afspiller og fjerner film fra liste------
    //------prøv at fjerne getTitle, skal der så bruges toSting?------
    public void playAndRemoveFilm(Film film) {
        System.out.println(film.getTitle() + " afspilles LIGE NU!");
        filmPlaylist.remove(film);
    }

    public void displayNextFilm() {
        System.out.println(filmPlaylist.iterator().next());
    }

    public int numberOfFilms() {
        return filmPlaylist.size();
    }
    //------Lav en liste der f.eks. kan printes------
    public ArrayList<Film> getFilmPlaylist() {
        return filmPlaylist;
    }
    //------Tøm arrayliste-----
    public void clearPlaylist() {
        System.out.println("Sletter playliste nu ");
        filmPlaylist.clear();

    }

}

