package ba.bitcamp.hajrudin.linked.data.structures.exercise;

public class Song {
	
	public static final int TECHNO = 1;
	public static final int POP = 2;
	public static final int ROCK = 3;
	
	private String nameOfSong;
	private String nameOfAuthor;
	private int year;
	private int genre;
	private Song nextSong;
	
	public Song(String nameOfSong, String nameOfAuthor, int year, int genre) {
		super();
		this.nameOfSong = nameOfSong;
		this.nameOfAuthor = nameOfAuthor;
		this.year = year;
		this.genre = genre;
	}
	
	public String getNameOfSong() {
		return nameOfSong;
	}
	public void setNameOfSong(String nameOfSong) {
		this.nameOfSong = nameOfSong;
	}
	public String getNameOfAuthor() {
		return nameOfAuthor;
	}
	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenre(int genre) {
		switch(genre){
		case Song.POP:
			return "POP";
		case Song.ROCK:
			return "ROCK";
		case Song.TECHNO:
			return "Techno";
		}
		return null;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		String s = "";
		s="Name of song: "+this.nameOfSong+"\n";
		s+="Name of Author: "+this.nameOfAuthor+"\n";
		s+="Year: "+this.year+"\n";
		s+="Genre: "+this.getGenre(this.genre)+"\n";
		if(nextSong!=null){
			s+=this.nextSong.toString();
		}
		return s;
	}
	public void setNextSong(Song s) {
		this.nextSong=s;
	}
	public Song getNextSong(){
		return this.nextSong;
	}
	
	
	
	
}
