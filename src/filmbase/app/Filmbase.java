package filmbase.app;

import filmbase.data.Film;
import filmbase.data.Genre;
import filmbase.data.Playlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Filmbase {
        public Filmbase(){


    }

    private Playlist playlist = new Playlist();
    //------Ændret fra Collection til list for at kunne bruge get(0) i testFiltrering------
    private List<Film> alleFilm = new ArrayList<>();

    private void initAndAdd() {
        alleFilm.add(new Film("A new hope", 1977, Genre.Scifi));
        alleFilm.add(new Film("Ferris Bueller's Day Off", 1986, Genre.Comedy));
        alleFilm.add(new Film("Planes, trains and automobiles", 1987, Genre.Comedy));
        alleFilm.add(new Film("Titan A.E", 2000, Genre.Scifi));
        alleFilm.add(new Film("Step Brothers", 2008, Genre.Comedy));
        alleFilm.add(new Film("Lord of the Rings", 2001, Genre.Fantasy));
        alleFilm.add(new Film("Elf", 2003, Genre.Comedy));
        alleFilm.add(new Film("Avatar", 2009, Genre.Scifi));
        alleFilm.add(new Film("Independence Day", 1996, Genre.Scifi));
        alleFilm.add(new Film("Trading Places", 1983, Genre.Comedy));
        alleFilm.add(new Film("What Jennifer did", 2024, Genre.Documentary));
        alleFilm.add(new Film("aka Charlie Sheen", 2025, Genre.Documentary));
        alleFilm.add(new Film("The Greatest night of pop", 2024,Genre.Music));
        alleFilm.add(new Film("Polarekspressen", 2004, Genre.Christmas));
        alleFilm.add(new Film("IT", 2017, Genre.Horror));
    }
    private void printList(Collection<Film> films) {
        for (Film f : films) {
            System.out.println(f.getTitle() + " (" + f.getYear() + ") " + ": " + f.getGenre() );
        }
    }

    public void start() {
        System.out.println("Filmbasen er startet");
        initAndAdd();
        printList(alleFilm);
        System.out.println("***************************************************");
        testFiltrering();
        System.out.println("***************************************************");
        playlist.displayNextFilm();
        System.out.println("***************************************************");
        playlist.numberOfFilms();
    }

    private void testFiltrering (){
        playlist = new Playlist();
        playlist.addFilmToPlaylist(alleFilm.get(0));
        playlist.addFilmToPlaylist(alleFilm.get(1));
        playlist.addFilmToPlaylist(alleFilm.get(12));
        playlist.addFilmToPlaylist(alleFilm.get(3));

        System.out.println("Før film i bestemt genre fjernes: ");
        printList(playlist.getFilmPlaylist());

        playlist.removeGenre(Genre.Music);
        System.out.println("***************************************************");
        System.out.println("Efter genre Music er fjernet: ");
        printList(playlist.getFilmPlaylist());

    }


    }

