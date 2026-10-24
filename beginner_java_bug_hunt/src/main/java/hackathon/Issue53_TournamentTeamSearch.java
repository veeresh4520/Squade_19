public class Issue53_TournamentTeamSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {7, 10, 3, 119};
        int target = 119;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
