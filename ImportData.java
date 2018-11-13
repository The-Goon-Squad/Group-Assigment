import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportData extends Runner {
	private double time = 0;
	private double distance = 0;
	private double altitude = 0;
	
	public ImportData(String file) {
		try {
			Scanner scanner = new Scanner(new File(file));
	        while(scanner.hasNext()){
	        	String str = scanner.nextLine();
	        	String[] tokens = str.split(",");
	        	this.time = this.time + Double.parseDouble(tokens[0]);
	        	this.distance = this.distance + Double.parseDouble(tokens[1]);
	        	this.altitude = Double.parseDouble(tokens[2]);
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//scanner.close();
			super.Steps = super.Steps + this.steps;
			super.time = super.time + this.time;
			super.Distance = super.Distance + this.distance;//
		}
		
        
		
	}
}
