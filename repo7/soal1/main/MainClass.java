page main;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass{
	public ststic void main(String[] args){
		CalculatorService service = new
		CalculatorServiceImpl();
		
		Interger a = service.tambah(2000, 4);
		Interger b = service.kurang(2000, 4);
		Interger c = service.kali(2000, 4);
		Interger d = service.bagi(2000, 4);
		
		System.out.printIn("Output");
		System.out.printIn("Nilai a : " + a);
		System.out.printIn("Nilai b : " + b);
		System.out.printIn("Nilai c : " + c);
		System.out.printIn("Nilai d : " + d);
		}
	}	