package prj5;

import java.util.LinkedList;
import student.TestCase;

/**
 * Tests the Song class, and all of its methods.
 * @author Jonathan Rukaj (jrukaj)
 * @version 6.30.19
 */
public class SongTest extends TestCase {

    private Song song1;
    private Song song2;
    
    /**
     * Sets up the test fixture.
     */
    public void setUp() {
        song1 = new Song("Eminem", "I'm back", "Rap", "2001");
        song2 = new Song("Beyonce", "Halo", "Pop", "2005");
    }
    
    /**
     * Tests the getArtistName() method, ensuring all the correct values 
     * are returned.
     */
    public void testGetArtistName() {
        assertEquals("Eminem", song1.getArtistName());
        assertEquals("Beyonce", song2.getArtistName());
    }
    
    /**
     * Tests the getSongName() method, ensuring the correct values are returned.
     */
    public void getSongName() {
        assertEquals("I'm back", song1.getSongName());
        assertEquals("Halo", song2.getSongName());
    }
    
    /**
     * Tests the getGenre() method, ensuring the correct values are returned.
     */
    public void testGetGenre() {
        assertEquals("Rap", song1.getGenre());
        assertEquals("Pop", song2.getGenre());
    }
    
    /**
     * Tests the getDate() method, ensuring the correct values are returned.
     */
    public void testGetDate() {
        assertEquals("2001", song1.getDate());
        assertEquals("2005", song2.getDate());
    }
    
    /**
     * Tests the equals() method, ensuring it runs correctly.
     */
    public void testEquals() {
        Song sameSong = new Song("Eminem", "I'm back", "Rap", "2001");
        Song otherSame = song1;
        Song nullSong = null;
        LinkedList<String> list = new LinkedList<String>();
        
        assertTrue(song1.equals(sameSong));
        assertTrue(song1.equals(otherSame));
        assertFalse(song1.equals(song2));
        assertFalse(song1.equals(nullSong));
        assertFalse(song1.equals(list));
    }
    
    /**
     * Tests the toString() method.
     */
    public void testToString() {
        assertEquals("[I'm back, Eminem, Rap, 2001]", song1.toString());
        assertEquals("[Halo, Beyonce, Pop, 2005]", song2.toString());
    }
}
