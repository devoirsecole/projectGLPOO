package musichub.UnitTesting;

import musichub.business.AudioBook;
import musichub.business.Category;
import musichub.business.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioBookTest {

    @Test
    void getLanguage() {

        AudioBook audiob1 = new AudioBook("Dune","Herbert",120,"dune.wav","english","novel");

        assertEquals(Language.ENGLISH,audiob1.getLanguage());

        AudioBook audiob2 = new AudioBook("Gomora","Saviani",120,"gomora.wav","italian","documentary");

        assertEquals(Language.ITALIAN,audiob2.getLanguage());

        AudioBook audiob3 = new AudioBook("Misérables","Hugo",120,"misérables.wav","french","documentary");

        assertEquals(Language.FRENCH,audiob3.getLanguage());

        AudioBook audiob4 = new AudioBook("Quichote","Cervantes",120,"quichote.wav","spanish","novel");

        assertEquals(Language.SPANISH,audiob4.getLanguage());

        AudioBook audiob5 = new AudioBook("Momo","Ende",120,"momo.wav","german","novel");

        assertEquals(Language.GERMAN,audiob5.getLanguage());




    }

    @Test
    void getCategory() {

        AudioBook audiob1 = new AudioBook("Dune","Herbert",120,"dune.wav","english","youth");

        assertEquals(Category.YOUTH,audiob1.getCategory());

        AudioBook audiob2 = new AudioBook("Gomora","Saviani",120,"gomora.wav","italian","documentary");

        assertEquals(Category.DOCUMENTARY,audiob2.getCategory());

        AudioBook audiob3 = new AudioBook("Misérables","Hugo",120,"misérables.wav","french","speech");

        assertEquals(Category.SPEECH,audiob3.getCategory());

        AudioBook audiob4 = new AudioBook("Quichote","Cervantes",120,"quichote.wav","spanish","novel");

        assertEquals(Category.NOVEL,audiob4.getCategory());

        AudioBook audiob5 = new AudioBook("Momo","Ende",120,"momo.wav","german","theater");

        assertEquals(Category.THEATER,audiob5.getCategory());

    }

    @Test
    void setLanguage() {

        AudioBook audiob1 = new AudioBook("Quichote","Cervantes",120,"quichote.wav","spanish","novel");

        audiob1.setLanguage("french");

        assertEquals(Language.FRENCH, audiob1.getLanguage());

        AudioBook audiob2 = new AudioBook("Gomora","Saviani",120,"gomora.wav","italian","documentary");

        audiob2.setLanguage("german");

        assertEquals(Language.GERMAN,audiob2.getLanguage());

        AudioBook audiob3 = new AudioBook("Misérables","Hugo",120,"misérables.wav","french","speech");

        audiob3.setLanguage("english");

        assertEquals(Language.ENGLISH,audiob3.getLanguage());




    }

    @Test
    void setCategory() {

        AudioBook audiob1 = new AudioBook("Quichote","Cervantes",120,"quichote.wav","spanish","theater");

        audiob1.setCategory("novel");

        assertEquals(Category.NOVEL, audiob1.getCategory());

        AudioBook audiob2 = new AudioBook("Gomora","Saviani",120,"gomora.wav","italian","documentary");

        audiob2.setCategory("theater");

        assertEquals(Category.THEATER,audiob2.getCategory());

        AudioBook audiob3 = new AudioBook("Misérables","Hugo",120,"misérables.wav","french","speech");

        audiob3.setCategory("youth");

        assertEquals(Category.YOUTH,audiob3.getCategory());

    }

    @Test
    void testToString() {

        AudioBook audiob = new AudioBook("Quichote","Cervantes",120,"quichote.wav","spanish","novel");

        String toStringreal  = audiob.toString();

        String toStringtest = "Title = Quichote" + ", Artist = Cervantes" + ", Length = 120" + ", Content = quichote.wav"+ ", Language = spanish" + ", Category = novel" + "\n";

        assertEquals(toStringtest,toStringreal);



    }
}