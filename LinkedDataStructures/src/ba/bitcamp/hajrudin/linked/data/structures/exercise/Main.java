package ba.bitcamp.hajrudin.linked.data.structures.exercise;

public class Main {
	public static void main(String[] args) {
		Song s1 = new Song("Song 1","Author 1", 1990, Song.POP);
		Song s2 = new Song("Song 2","Author 2", 1990, Song.POP);
		Song s3 = new Song("Song 3","Author 3", 2000, Song.ROCK);
		Song s4 = new Song("Song 4","Author 4", 2001, Song.TECHNO);
		Song s5 = new Song("Song 5","Author 5", 2010, Song.ROCK);
		Song s6 = new Song("Song 6","Author 6", 2011, Song.TECHNO);
		Song s7 = new Song("Song 7","Author 7", 2015, Song.ROCK);
		
		Song [] songs = {s1,s2,s3,s4,s5,s6,s7};
		
		LinkedListSong ls = new LinkedListSong(songs);
		
		System.out.println(ls.toString());
		
		ls.remove(1);
		
		System.out.println(ls.toString());
		
		ls.remove(s6);
		
		System.out.println(ls.toString());
		
		System.out.println(ls.getSize());
		
		System.out.println(ls.indexOf(s4));
		

		ls.clear();
		
		System.out.println(ls.toString());
	}
}
