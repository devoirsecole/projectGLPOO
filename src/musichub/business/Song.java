package musichub.business;

import org.w3c.dom.*;

import java.io.*;


public class Song extends AudioElement {
	private Genre genre;
	private String lyrics;
	
	public Song (String title, String artist, int length, String uid, String content, String genre,String lyrics) {
		super (title, artist, length, uid, content);
		this.setGenre(genre);
		this.setLyrics(lyrics);
	}
	
	public Song (String title, String artist, int length, String content, String genre, String lyrics) {
		super (title, artist, length, content);
		this.setGenre(genre);
		this.setLyrics(lyrics);
	}
	
	public Song (Element xmlElement) throws Exception {
		super(xmlElement);
		try {
			this.setGenre(xmlElement.getElementsByTagName("genre").item(0).getTextContent());
			this.setLyrics(xmlElement.getElementsByTagName("lyrics").item(0).getTextContent());
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public void setGenre (String genre) {	
		switch (genre.toLowerCase()) {
			case "jazz":
			default:
				this.genre = Genre.JAZZ;
				break;
			case "classic":
				this.genre = Genre.CLASSIC;
				break;
			case "hiphop":
				this.genre = Genre.HIPHOP;
				break;
			case "rock":
				this.genre = Genre.ROCK;
				break;
			case "pop":
				this.genre = Genre.POP;
				break;
			case "rap":
				this.genre = Genre.RAP;
				break;				
		}
	}

	public void setLyrics(String lyrics){

		this.lyrics = lyrics;

	}

	public String getGenre () {
		return genre.getGenre();
	}

	public void seeLyrics() throws FileNotFoundException{

		try {
			File file = new File(System.getProperty("user.dir") + "\\files\\" + this.lyrics);

		BufferedReader br = new BufferedReader(new FileReader(file));

		String string;

		while ((string = br.readLine()) != null)
			System.out.println(string);

		}catch(FileNotFoundException e){
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return super.toString() + ", Genre = " + getGenre() +" Lyrics : " +this.lyrics + "\n";
	}	
	
	public void createXMLElement(Document document, Element parentElement) {
		// song element
        Element song = document.createElement("song");

		super.createXMLElement(document, song);
		
		Element genreElement = document.createElement("genre");
        genreElement.appendChild(document.createTextNode(genre.getGenre()));
        song.appendChild(genreElement);

		Element lyricsElement = document.createElement("lyrics");
		lyricsElement.appendChild(document.createTextNode(this.lyrics));
		song.appendChild(lyricsElement);

		parentElement.appendChild(song);
		return;
	}
}