public class Issue50_TournamentTeamTotalMethod {
    public static void main(String[] args) {
        int unitFee = 70;
        int quantity = 10;
        int discountPercent = 15;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
