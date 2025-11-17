package filmbase.app;

import filmbase.data.Film;

import java.util.ArrayList;
import java.util.Collection;

public class Filmbase {

    public Filmbase(){


    }
    private Collection<Film> alleFilm = new ArrayList<>();

    private void initAndAdd() {
        alleFilm.add(new Film("A new hope", 1977));
        alleFilm.add(new Film("Ferris Bueller's Day Off", 1986));
        alleFilm.add(new Film("Planes, trains and automobiles", 1987));
        alleFilm.add(new Film("Titan A.E", 2000));
        alleFilm.add(new Film("Step Brothers", 2008));
        alleFilm.add(new Film("Lord of the Rings", 2001));
        alleFilm.add(new Film("Elf", 2003));
        alleFilm.add(new Film("Avatar", 2009));
        alleFilm.add(new Film("Independence Day", 1996));
        alleFilm.add(new Film("Trading Places", 1983));
    }


    public void start() {
        System.out.println("Filmbasen er startet");
        initAndAdd();
    }
}
