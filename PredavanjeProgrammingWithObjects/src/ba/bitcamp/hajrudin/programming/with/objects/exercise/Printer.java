package ba.bitcamp.hajrudin.programming.with.objects.exercise;

public class Printer {
	private String name;
	private int amountOfPaper;
	private int amountOfInk;
	private static int sumOfPrintedPages=0;
	/**
	 * Default constructor
	 */
	public Printer (){
		this.name="DefaultPrinter";
		this.amountOfPaper=0;
		this.amountOfInk=0;
	}
	/**
	 * Constructor
	 * @param name name of printer
	 */
	public Printer(String name) {
		this.name = name;
		this.amountOfPaper =0;
		this.amountOfInk = 0;
	}
	/**
	 * Checking ink in printer
	 * @return true if printer has not ink false if the printer has ink
	 */
	public boolean isEmptyInk(){
		if(this.amountOfInk==0){
			return true;
		}
		return false;
	}
	
	/**
	 * Checking paper in printer
	 * @return true of printer has not paper, false if printer has paper
	 */
	public boolean isEmptyPaper(){
		if(this.amountOfPaper==0){
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return sum of printed pages of all printers
	 */
	public static int getSumOfPrintedPages(){
		return sumOfPrintedPages;
	}
	
	/**
	 * adding paper in printer (max 100 papers)
	 * @param amountOfPaper papers to add
	 */ 
	public void setPaper(int amountOfPaper){
		if(this.amountOfPaper+amountOfPaper<=100){
		this.amountOfPaper+=amountOfPaper;
		} 
	}
	/**
	 * adding ink in printer (max 100 ink) 
	 * @param amountOfInk ink to add in printer
	 */
	public void setInk(int amountOfInk){
		if(this.amountOfInk+amountOfInk<=100){
		this.amountOfInk+=amountOfInk;
		} 
	}
	
	
	public int getAmountOfInk(){
		return this.amountOfInk;
	}
	
	public int getAmountOfPaper(){
		return this.amountOfPaper;
	}
	
	
	/**
	 * Method for printing pages. If printer doesn't have paper or ink you will get message
	 * @param numOfPages number of pages that will print
	 */
	public void printPages(int numOfPages){
		int p = this.amountOfPaper-numOfPages;
		int i = this.amountOfInk-(numOfPages*3);
		if(p<0 && i<0){
			sumOfPrintedPages+=this.amountOfPaper;
			this.amountOfInk=0; 
			this.amountOfPaper=0;
			System.out.println("You need "+p*-1+" paper, and "+i*-1+" ink to finish printing.");
		} else if(p<0 && i>=0){
			sumOfPrintedPages+=this.amountOfPaper;
			this.amountOfPaper=0;
			this.amountOfInk=i;
			System.out.println("You need "+p*-1+" paper to finish printing.");
		} else if(p>=0 && i<0){
			sumOfPrintedPages+=numOfPages;
			this.amountOfPaper=p;
			this.amountOfInk=0;
			System.out.println("You need "+i*-1+" ink to finish printing");
		} else {
			this.amountOfPaper=p;
			this.amountOfInk=i;
			sumOfPrintedPages+=numOfPages;
		}
	}
	
	/**
	 * toString method for print
	 */
	public String toString() {
		String s = "";
		s = "Name: "+name+"\n";
		if(this.isEmptyInk()==true && this.isEmptyPaper()==true){
			s+="No ink and no paper \n";
		} else if(this.isEmptyInk()==true && this.isEmptyPaper()==false){
			s+="No ink \n";
		} else if(this.isEmptyInk()==false && this.isEmptyPaper()==true){
			s+="No paper \n";
		} else {
			s+="Ready \n";
		}
		return s;
	}
	
	
	
	
	
	
}
