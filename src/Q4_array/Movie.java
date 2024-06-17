package Q4_array;

public class Movie {
    public static void main(String[] args) {


        String[] movieList = {"BladeRunner", "Star Wars", "BladeRunner 2049"};
        String[] bladeRunner = {"Harrison Ford", "Rutger Hauer", "Sean Young"};
        String[] starWars = {"Mark Hamill", "Harrison Ford", "Carrie Fisher"};
        String[] bladeRunner2049 = {"Harrison Ford", "Ryan Gosling", "Ana de Armas"};
        String[][] movies = {bladeRunner, starWars, bladeRunner2049};
        for (int i = 0; i < movies.length; i++) {
            System.out.println("movie name: " + movieList[i]);
            for (int j = 0; j < movies[i].length; j++) {
                System.out.println("actors are " + movies[i][j]);
            }
        }
    }

}
