package ba.bitcamp.hajrudin.writing.generic.classes.and.methods.exercise;

public class VideoGame extends Application{
	private String genre;
	private String studio;
	private int numOfCopies;
	
	

	public VideoGame(String name, int year, int ver, int size, String genre,
			String studio, int numOfCopies) {
		super(name, year, ver, size);
		this.genre = genre;
		this.studio = studio;
		this.numOfCopies = numOfCopies;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	@Override
	public String toString() {
		return "VideoGame [genre=" + genre + ", studio=" + studio
				+ ", numOfCopies=" + numOfCopies + "]";
	}
	
	
	
}
