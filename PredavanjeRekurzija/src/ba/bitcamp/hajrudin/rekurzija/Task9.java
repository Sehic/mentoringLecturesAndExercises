package ba.bitcamp.hajrudin.rekurzija;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		
		int [][]matr = new int[10][10];
		randomMatr(matr);
		print(matr);
		fill(matr);
		print(matr);
	}
	
	public static void randomMatr(int[][]matr){
		for(int i = 0; i<matr.length; i++){
			for(int j = 0; j<matr[i].length; j++){
				matr[i][j]=(int)(Math.random()*2);
			}
		}
	}
	
	public static void print(int [][] matr){
		for(int i =0; i< matr.length; i++){
			for(int j =0; j< matr[i].length; j++){
				System.out.print(matr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void fill(int [][]matr){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter i");
		int n = input.nextInt();
		System.out.println("Enter j");
		int m = input.nextInt();
			fill(matr,n,m);
			fill(matr,n+1,m);
			fill(matr,n-1,m);
			fill(matr,n,m-1);
			fill(matr,n,m+1);
	}
	public static void fill(int [][]matr, int n, int m){
		if(n<0 || n>matr.length-1 || m<0 || m>matr.length-1){
			return;
		}
		if(matr[n][m]==1){
			return;
		} 
		else {
			matr[n][m]=1;
			fill(matr,n,m);
			fill(matr,n+1,m);
			fill(matr,n-1,m);
			fill(matr,n,m-1);
			fill(matr,n,m+1);
			
	}
	
}
}
