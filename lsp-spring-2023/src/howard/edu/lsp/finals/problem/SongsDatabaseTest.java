package howard.edu.lsp.finals.problem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

    @Test
    public void testAddSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Hip-Hop", "Humble");
        db.addSong("Electronic", "Strobe");
        db.addSong("Hip-Hop", "Sicko Mode");
        db.addSong("Electronic", "Shelter");

        Set<String> hip_hop_songs = db.getSongs("Hip-Hop");
        Set<String> electronic_songs = db.getSongs("Electronic");

        assertTrue(hip_hop_songs.contains("Humble"));
        assertTrue(electronic_songs.contains("Shelter"));
        assertFalse(hip_hop_songs.contains("Strobe"));
        assertFalse(electronic_songs.contains("Sicko Mode"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Reggae", "One Love");
        db.addSong("Reggae", "Three Little Birds");
        db.addSong("Funk", "Superstition");
        db.addSong("Funk", "Brick House");

        Set<String> reggae_songs = db.getSongs("Reggae");
        assertTrue(reggae_songs.contains("One Love"));
        assertTrue(reggae_songs.contains("Three Little Birds"));
    }

    @Test
    public void testGetGenre() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Metal", "Master of Puppets");
        db.addSong("Metal", "Iron Man");
        db.addSong("Folk", "Blowin' in the Wind");
        db.addSong("Folk", "This Land Is Your Land");

        assertEquals("Folk", db.getGenre("Blowin' in the Wind"));
        assertEquals("Metal", db.getGenre("Master of Puppets"));
        assertEquals("That song is not in the Database.", db.getGenre("Imagine"));
        
        System.out.println( db.getGenre("Blowin' in the Wind"));// prints "Folk"
        System.out.println( db.getGenre("Master of Puppets"));// prints "Metal"

    }
}
