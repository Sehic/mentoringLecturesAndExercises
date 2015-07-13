package ba.bitcamp.hajrudin.linked.data.structures;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pozitivan broj");
		Node head = null;
		Node last = null;
		while(true){
			int num = input.nextInt();
			if(num>0){
				Node n = new Node(num);
				if(head == null && last == null){
					head=n;
					last=n;
				} else {
					last.setNext(n);
					last = n;
				}
			} else {
				break;
			}
		}
		
		
	}

}
