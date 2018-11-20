import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ImportData extends StatsData {
	private double time = 0;
	private double distance = 0;
	private double altitude = 0;
	private double Zero = 0;
	private Scanner scanner;
	
	public ImportData(String file) {
	}
	
	public void importData() {
		try {
			scanner = new Scanner(new File("C:\\Users\\conra\\eclipse-workspace\\activity tracker\\src\\Input Format.csv"));
	        while(scanner.hasNext()){
	        	String data = scanner.nextLine();
	        	String[] tokens = data.split(",");
	        	this.time = this.time + Double.parseDouble(tokens[0]);
	        	this.distance = this.distance + Double.parseDouble(tokens[1]);
	        	this.altitude = Double.parseDouble(tokens[2]);
	        	if (tokens[0].equals(Zero) ) {
	        		super.AddRun(time, distance, altitude);
	        		time = 0;
	        		distance = 0;
	        		altitude = 0;
	        	}
	        	
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		
        
		
		}
	}
}

