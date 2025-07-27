package Task3;
interface PrintTable{
	void Print();
}
interface ScanTable{
	void Print();
}
class MultifunctionPrinter implements PrintTable , ScanTable{
	public void Print(){
		System.out.println("Printing....");
	}
	public void Scan(){
		System.out.println("Scanning...");
	}
	
}

public class Task_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultifunctionPrinter m = new MultifunctionPrinter();
		m.Print();
		m.Scan();

	}

}
