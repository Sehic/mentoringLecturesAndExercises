package ba.bitcamp.hajrudin.linked.data.structures.exercise;

import java.util.Arrays;

public class ArrayListSong {
	private Song[] songs;
	
	public ArrayListSong(){
		songs= new Song [0];
	}
	
	public ArrayListSong(Song[] songs){
		this.songs = new Song [songs.length];
		for(int i = 0; i<songs.length; i++){
			this.songs[i]=songs[i];
		}
	}
	
	public void addSong(Song s){
		if(this.songs.length==0){
			this.songs=new Song [1];
			this.songs[0]=s;
		} else {
			Song[] temp = new Song[this.songs.length*2];
			for(int i = 0; i<this.songs.length; i++){
				temp[i]=this.songs[i];
			}
			temp[this.songs.length]=s;
			this.songs=temp;
		}
	
	}
	
	public Song getElement(int index){
		return this.songs[index];
	}
	
	public void removeSong(int index){
		if(index!=this.songs.length-1){
		for(int i = index; i<this.songs.length-1; i++){
			this.songs[i]=this.songs[i+1];
		}
		}
		Song[] temp = new Song[this.songs.length-1];
		for(int i = 0; i<temp.length; i++){
			temp[i]=this.songs[i];
		}
		this.songs=temp;
	}
	
	public void removeSong(Song s){
		for(int i = 0; i<this.songs.length; i++){
			if(this.songs[i].getNameOfSong().equals(s.getNameOfSong())){
				this.removeSong(i);
				break;
			}
		}
	}
	
	public int getSize(){
		return this.songs.length;
	}
	
	public int getIndexOfSong(Song s){
		for(int i = 0; i<this.songs.length; i++){
			if(this.songs[i].getNameOfSong().equals(s.getNameOfSong())){
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i<this.songs.length; i++){
			s+=this.songs[i].toString();
		}
		return s;
	}
	
	
	
	
}	
