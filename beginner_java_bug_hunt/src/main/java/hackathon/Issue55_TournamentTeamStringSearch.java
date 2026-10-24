public class Issue55_TournamentTeamStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A19", "B19", "C19"};
        String target = new String("B19");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
