package ba.bitcamp.hajrudin.stacks.queues.and.adts.exercise;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackArrayString {
	private String [] array;
	
	public StackArrayString(){
		this.array=new String [0];
	}
	
	public boolean isEmpty(){
		return (this.array.length==0);
	}
	
	public void push(String s){
		this.array=Arrays.copyOf(this.array, this.array.length+1);
		this.array[this.array.length]=s;
	}
	
	public String pop(){
		if(this.isEmpty()){
			throw new EmptyStackException();
		} else {
			String s = this.array[this.array.length-1];
			this.array=Arrays.copyOf(this.array, this.array.length-1);
			return s;
		}
	}
	
	public String peek(){
		if(this.isEmpty()){
			throw new EmptyStackException();
		} else {
			String s = this.array[this.array.length-1];
			return s;
		}
	}
	
	
	
}
