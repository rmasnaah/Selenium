import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;



public class productsCSV {
	
	public static void main(String[]args) throws IOException {
		
		CSVWriter write = new CSVWriter(new FileWriter("productData//sample.csv"));
		
		
		String set1[] = {"Product", "Price"};
		String set2[] = { "HP LP3065", "$100.00"};
		String set3[] = { "MacBook","$500.00"};
		String set4[] = { "MacBook Air","$1000.00"};
		String set5[] = { "MacBook Pro","$2000.00"};
		String set6[] = { "Sony VAIO","$1000.00"};
		String set7[] = { "Apple Cinema 30", "$90.00"};
		String set8[] = { "Canon EOS 5D", "$80.00"};
		String set9[] = { "HTC Touch HD","$100.00"};
		String set10[] = { "iPhone","$101.00"};
		String set11[] = { "iPod Classic","$100.00"};
		String set12[] = { "Palm Treo Pro","$279.99"};
		String set13[] = { "Product 8","$100.00"};
		String set14[] = { "Samsung SyncMaster 941BW","$200.00"};
		String set15[] = { "iMac","$100.00"};
		String set16[] = { "Samsung Galaxy Tab 10.1","$199.99"};
		String set17[] = { "Nikon D300","$80.00"};
		String set18[] = { "iPod Nano","$100.00"};
		String set19[] = { "iPod Shuffle", "$100.00"};
		String set20[] = { "iPod Touch", "$100.00"};
		
		
		write.writeNext(set1);
		write.writeNext(set2);
		write.writeNext(set3);
		write.writeNext(set4);
		write.writeNext(set5);
		write.writeNext(set6);
		write.writeNext(set7);
		write.writeNext(set8);
		write.writeNext(set9);
		write.writeNext(set10);
		write.writeNext(set11);
		write.writeNext(set12);
		write.writeNext(set13);
		write.writeNext(set14);
		write.writeNext(set15);
		write.writeNext(set16);
		write.writeNext(set17);
		write.writeNext(set18);
		write.writeNext(set19);
		write.writeNext(set20);
		
		
		write.flush();
		
		System.out.println("data is entered");
		
	}
}
