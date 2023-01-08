public class App {
    public static void main(String[] args) throws Exception {

        String[] animeList = { "One Piece", "Evangelion", "N.H.K", "Gurren Lagann", "Hajime No Ippo" };

        String best = "One Piece";

        System.out.println("These are my top 5 anime");

        for (String anime : animeList) {
            System.out.println(anime + (" - 10/10"));

            if (anime.equals(best)) {
                System.out.println("The best ✨");
            }

        }

    }
}
