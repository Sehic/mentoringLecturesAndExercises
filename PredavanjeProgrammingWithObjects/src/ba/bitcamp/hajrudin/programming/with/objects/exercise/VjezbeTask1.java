package ba.bitcamp.hajrudin.programming.with.objects.exercise;


public class VjezbeTask1 {

	public static void main(String[] args) {
		Printer p1 = new Printer();
		Printer p2 = new Printer("PrinterHP");
		//p1.printPages(12);
		p2.setInk(100);
		p2.setPaper(100);
		//p2.printPages(20);
		//System.out.println(p1.toString()+"Sum of printed pages: "+Printer.getSumOfPrintedPages());
		//System.out.println(p2.toString()+"Sum of printed pages: "+Printer.getSumOfPrintedPages());
		Printer p3 = new Printer();
		p3.setInk(10);
		p3.setPaper(1);
		//System.out.println(p3.toString()+"Sum of printed pages: "+Printer.getSumOfPrintedPages());
		Printer [] printers = {p1,p2,p3};
		PrinterNetwork pn1 = new PrinterNetwork(printers);
		pn1.printing(100);
		pn1.printing(10);
		
	}

}
