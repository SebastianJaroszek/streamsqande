package pl.dominisz;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Track {

    private int rating;

    /*public Track(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Track{" +
                "rating=" + rating +
                '}';
    }*/
}
