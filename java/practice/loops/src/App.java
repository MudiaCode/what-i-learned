public class App {
    public static void main(String[] args) throws Exception {
        String[] animeList = { "One Piece", "Evangelion", "Gurren Lagann", "N.H.K", "Dororo" };

        String best = "One Piece";

        System.out.println("My Top 5 Anime");

        for (String anime : animeList) {
            System.out.println(anime + " 10/10✨");

            if (anime.equals(best)) {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Best Anime Of All Time");
            }

        }

    }
}