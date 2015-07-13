package ba.bitcamp.hajrudin.linked.data.structures.exercise;

public class LinkedListSong {
	private Song start;
	private Song end;
	
	public LinkedListSong(){
		this.start=null;
		this.end=null;
	}
	
	public LinkedListSong(Song[] songs){
		for(int i = 0; i<songs.length; i++){
			this.addSong(songs[i]);
		}
	}
	
	public void addSong(Song s){
		if (this.start == null) {
			this.start = s;
			this.end = s;
		} else {
			end.setNextSong(s);
			end = s;
		}
	}
	
	public Song getSong(int index){
		Song s=start;
		for(int i = 0; i<=index; i++){
			s=s.getNextSong();
		}
		return s;
	}
	
	public void remove(int index){
		Song s = start;
		for(int i = 0; i<index-1; i++){
			s = s.getNextSong();
		}
		Song s1 = start;
		for(int i = 0; i<index+1; i++){
			s1 = s1.getNextSong();
		}
		s.setNextSong(s1);
	}
	
	public void remove(Song s){
		int count = 0;
		Song s1 = start;
		while(true){
			s1=s1.getNextSong();
			count++;
			if(s1.equals(s)){
				this.remove(count);
				break;
			}
		}
	}
	
	public int getSize(){
		int count = 1;
		Song s = start;
		while(true){
			s=s.getNextSong();
			count++;
			if(s.equals(end)){
				break;
			}
		}
		return count;
	}
	
	public void clear(){
		this.start=null;
	}
	
	public int indexOf(Song s){
		Song s1 = start;
		for(int i = 0; i<this.getSize(); i++){
			if(s1.equals(s))
				return i;
			s1=s1.getNextSong();
		}
		return 0;
	}
	
	

	@Override
	public String toString() {
		if(this.start!=null)
		return "Song: "+start;
		return "There is no songs in list";
	}
	
	
	
}
