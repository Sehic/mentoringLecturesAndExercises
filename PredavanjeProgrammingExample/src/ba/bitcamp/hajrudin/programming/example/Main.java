package ba.bitcamp.hajrudin.programming.example;

import java.util.Scanner;

public class Main {
	//Pokusavam napraviti program za kartasku igru remi (NE BAS PO PRAVIM PRAVILIMA)
    //Program inicijalizira dva spila za remi. Pita korisnika koliko ce igraca igrati i unos imena igraca.
	//Podijeli karte prvi put svakom igracu po 14, prvom jedna vise.
	//Zatim prvi igrac  koji ima 15 karti baca kartu koju zeli. Ta karta se sprema u novi spil
	//Zatim sljedeci igrac dobija kartu iz spila iz kojeg su se podjelile karte i trazi se od njega da izabere kartu koju zeli baciti
	//Karte od svih igraca se u medjuvremenu sortiraju
	//Igrac nakon dobijene karte bira koju ce kartu baciti
	//Nakon toga igrac ima mogucnost da se otvori (odnosno da zavrsi igru)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Enter number of cards (One deck have 52 cards)");
		int numOfCards = 52;
		//System.out.println("Do you want jokers in deck: Yes/No");
		//input.nextLine();
		String joker = "YES";
		//System.out.println("How many decks you want?");
		int numOfDecks = 2;
		Deck d = new Deck(numOfCards, joker, numOfDecks);
		Card [] c;
		d.shuffle();
		System.out.println("Your deck is shuffled");
		System.out.println("How many players will play?");
		int numOfPlayers = input.nextInt();
		Player [] players = new Player [numOfPlayers];
		input.nextLine();
		for(int i = 0; i< players.length; i++){
			System.out.println("Enter name of player "+(i+1));
			String name = input.nextLine();
			players[i] = new Player(name);
		}
		//System.out.println("Enter number of cards to deal first time");
		int numOfCardsToDeal = 14; // Stavio sam 14 jer se u remiu prvi put dijeli 14 karti prvom igracu 15 
		for(int i = 0; i< players.length; i++){
			players[i].setCards(numOfCardsToDeal);
		}
		c=d.dealCards(numOfCardsToDeal, players);
		System.out.println("Cards are dealt to all players.");
		Hand h = new Hand(c);
		do{
			for(int i = 0; i<players.length;i++){
				System.out.println(players[i].getName()+" on the move.");
				h.playRemi(players[i]);
			}
		}while(h.getHasWinner()==false);
		
	}

}
