package musichub.UnitTesting;

import musichub.business.Album;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    void getTitle() {

        Album a = new Album("Dark side of the moon","Pink Floyd",340,"1973-03-01");

        assertEquals("Dark side of the moon", a.getTitle());

        Album a2 = new Album("Master of Puppets","Metallica",280,"1986-03-03");

        assertEquals("Master of Puppets", a2.getTitle());

        Album a3 = new Album("Magma","Gojira",610,"2016-06-20");

        assertEquals("Magma", a3.getTitle());

    }

    @Test
    void getDate() {

        Album a = new Album("Dark side of the moon","Pink Floyd",340,"1973-03-01");

        assertEquals("1973-03-01", a.getDate());

        Album a2 = new Album("Master of Puppets","Metallica",280,"1986-03-03");

        assertEquals("1986-03-03", a2.getDate());

        Album a3 = new Album("Magma","Gojira",610,"2016-06-20");

        assertEquals("2016-06-20", a3.getDate());

    }

    @Test
    void getLength(){

        Album a = new Album("Dark side of the moon","Pink Floyd",340,"1973-03-01");

        assertEquals(340, a.getLength());

        Album a2 = new Album("Master of Puppets","Metallica",280,"1986-03-03");

        assertEquals(280, a2.getLength());

        Album a3 = new Album("Magma","Gojira",610,"2016-06-20");

        assertEquals(610, a3.getLength());


    }

    @Test
    void getArtist(){

        Album a = new Album("Dark side of the moon","Pink Floyd",340,"1973-03-01");

        assertEquals("Pink Floyd", a.getArtist());

        Album a2 = new Album("Master of Puppets","Metallica",280,"1986-03-03");

        assertEquals("Metallica", a2.getArtist());

        Album a3 = new Album("Magma","Gojira",610,"2016-06-20");

        assertEquals("Gojira", a3.getArtist());

    }

}