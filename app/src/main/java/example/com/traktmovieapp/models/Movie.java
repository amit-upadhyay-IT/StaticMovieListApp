package example.com.traktmovieapp.models;

public class Movie {
    public final String title;
    public final Image images;
    public final String overview;

    public Movie(String title, Image images, String overview) {
        this.title = title;
        this.images = images;
        this.overview = overview;
    }
}
