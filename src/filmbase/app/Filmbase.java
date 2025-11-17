package filmbase.app;

import filmbase.data.Film;
import filmbase.data.Genre;

import java.util.ArrayList;
import java.util.Collection;

public class Filmbase {

    public Filmbase(){


    }
    private Collection<Film> alleFilm = new ArrayList<>();

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
    }

    }

