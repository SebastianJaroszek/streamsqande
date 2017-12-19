package pl.dominisz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Exercise from
 * https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 * <p>
 * Convert the following code into a new implementation that uses lambda expressions and aggregate operations
 * instead of nested for loops.
 * Hint: Make a pipeline that invokes the filter, sorted, and collect operations, in that order.
 */
public class ExerciseTwo {

    public static void main(String[] args) {
        List<Album> favs = new ArrayList<>();
        List<Album> albums = createAlbums();
        for (Album a : albums) {
            boolean hasFavorite = false;
            for (Track t : a.getTracks()) {
                if (t.getRating() >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                favs.add(a);
        }
        Collections.sort(favs, new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                return a1.getName().compareTo(a2.getName());
            }
        });

        favs.stream()
                .forEach(fav -> System.out.println(fav.getName()));

        //Collections.sort(favs, (a1, a2) -> a1.getName().compareTo(a2.getName()));
    }

    private static List<Album> createAlbums() {
        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Vudoe NIEPAMIĘĆ", createTracks(-2)));
        albums.add(new Album("PW NOTABENE", createTracks(3)));
        albums.add(new Album("JWP SEQUEL", createTracks(1)));
        return albums;
    }

    private static List<Track> createTracks(int count) {
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track(3 + count));
        tracks.add(new Track(4 + count));
        tracks.add(new Track(5 + count));
        tracks.add(new Track(1 + count));
        tracks.add(new Track(2 + count));
        return tracks;
    }
}
