package pl.dominisz;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Album {

    private String name;
    private List<Track> tracks;

    /*public Album(String name, List<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                '}';
    }*/
}
