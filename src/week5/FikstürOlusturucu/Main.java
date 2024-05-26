package week5.FikstürOlusturucu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        Match scheduler = new Match(teams);
        scheduler.generateFixtures();
    }
}