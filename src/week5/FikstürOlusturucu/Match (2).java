package week5.FikstürOlusturucu;

import java.util.*;

public class Match {
    private ArrayList<String> teams;

    public Match(ArrayList<String> teams) {
        this.teams = teams;
        // Eğer takım sayısı tek ise "Bay" ekleyin
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
    }

    // Fikstür oluşturma fonksiyonu
    public void generateFixtures() {
        int numTeams = teams.size(); // Takım sayısı
        int rounds = (numTeams - 1) * 2; // Toplam tur sayısı (çift devreli lig)
        int matchesPerRound = numTeams / 2; // Her turdaki maç sayısı

        ArrayList<String> teamsCopy = new ArrayList<>(teams); // Takım listesinin kopyası

        // Her tur için döngü
        for (int round = 0; round < rounds; round++) {
            System.out.println("Round " + (round + 1));

            // Her turdaki maçlar için döngü
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (numTeams - 1); // Ev sahibi takım indeksi
                int away = (numTeams - 1 - match + round) % (numTeams - 1); // Deplasman takım indeksi

                // Son takımın sabit olması için
                if (match == 0) {
                    away = numTeams - 1;
                }

                // İkinci yarı (deplasman - ev sahibi)
                if (round >= numTeams - 1) {
                    System.out.println(teamsCopy.get(away) + " vs " + teamsCopy.get(home));
                }
                // İlk yarı (ev sahibi - deplasman)
                else {
                    System.out.println(teamsCopy.get(home) + " vs " + teamsCopy.get(away));
                }
            }
            System.out.println(); // Her turun sonunda boş satır
        }
    }
}