package ba.bitcamp.hajrudin.programming.with.objects.exercise;


public class PrinterNetwork {
	Printer [] printers;

	public PrinterNetwork(Printer[] printers) {
		this.printers = printers;
	}
	
	/**
	 * This method finds fist ready printer in array of printers from class Printer and prints pages
	 * @param numOfPages number of pages that will print
	 */
	public void printing(int numOfPages){
		boolean temp = false;
		for(int i = 0; i<printers.length; i++){
			if(printers[i].getAmountOfPaper()>=numOfPages && printers[i].getAmountOfInk()>=numOfPages*3){
				printers[i].setPaper(-numOfPages);
				printers[i].setInk(-(numOfPages*3));
				System.out.println("Pages printed. Printer details: \n"+printers[i].toString());
				temp = true;
				break;
			}
		}
		
		if(temp == false){
			System.out.println("There is no printer ready for print");
		}
		
		
		
	}
	
	
}
