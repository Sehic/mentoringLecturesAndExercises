package ba.bitcamp.hajrudin.stacks.queues.and.adts.exercise;

import java.util.Arrays;

public class QueueArrayDouble {
	private double[] array;
	
	public QueueArrayDouble(){
		this.array=new double [0];
	}
	
	public void add(double d){
		this.array=Arrays.copyOf(this.array, this.array.length+1);
		this.array[this.array.length]=d;
	}
	
	public double poll(){
		if(array.length==0){
			return 0;
		} else {
			double d = array[0];
			double[] arr = new double [array.length-1];
			for(int i = 0; i<arr.length; i++){
				arr[i]=array[i+1];
			}
			array=arr;
			return d;
		}
	}
	
	public double peek(){
		if(array.length==0){
			return 0;
		} else {
			return array[0];
		}
	}
}
