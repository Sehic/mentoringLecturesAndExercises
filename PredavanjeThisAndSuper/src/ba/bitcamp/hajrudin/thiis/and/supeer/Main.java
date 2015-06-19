package ba.bitcamp.hajrudin.thiis.and.supeer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int brojPokusaja = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite maximalni broj za pogadjanje (0 za random)");
		int maxBroj = input.nextInt();
		if(maxBroj==0){
			IgrajPogodiBroj igra = new IgrajPogodiBroj();
			int broj = 0;
			do{
			System.out.println("Unesite broj: ");
			broj = input.nextInt();
			}while(igra.pogodi(broj)==false);
		} else{
		System.out.println("Unesite maximalni broj pokusaja (0 za random)");
		brojPokusaja = input.nextInt();
		}
		if(brojPokusaja==0){
			IgrajPogodiBroj igra = new IgrajPogodiBroj(maxBroj);
			int broj = 0;
			do{
			System.out.println("Unesite broj: ");
			broj = input.nextInt();
			}while(igra.pogodi(broj)==false);
		} else {
		IgrajPogodiBroj igra = new IgrajPogodiBroj(maxBroj,brojPokusaja);
		int broj = 0;
		do{
		System.out.println("Unesite broj: ");
		broj = input.nextInt();
		}while(igra.pogodi(broj)==false);
		
		}

	}

}
