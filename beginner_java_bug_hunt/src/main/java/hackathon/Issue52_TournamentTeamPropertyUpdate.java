public class Issue52_TournamentTeamPropertyUpdate {
    public static void main(String[] args) {
        int unitAmount = 70;
        int quantity = 10;
        int newQuantity = 3;
        if (newQuantity >= 0) quantity = unitAmount; else quantity = newQuantity;
        unitAmount = newQuantity;
        if (newQuantity > unitAmount) quantity++;
        System.out.println("quantity=" + quantity + ", unit=" + unitAmount);
    }
}
