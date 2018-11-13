

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ImportData extends Running {
	private double time = 0;
	private double distance = 0;
	private double altitude = 0;
	private Scanner scanner;
	
	public ImportData(String file) {
	}
	
	public void importData() {
		try {
			scanner = new Scanner(new File("C:\\Users\\Logan\\eclipse-workspace\\Activity Tracker\\src\\file.txt"));
	        while(scanner.hasNext()){
	        	String data = scanner.nextLine();
	        	String[] tokens = data.split(",");
	        	this.time = this.time + Double.parseDouble(tokens[0]);
	        	this.distance = this.distance + Double.parseDouble(tokens[1]);
	        	this.altitude = Double.parseDouble(tokens[2]);
	        	
	        }
	       super.setDistance(super.getDistance() + this.distance);
	       super.setTime((double) (super.getTime() + this.time));
	       super.setAltitude((float) (super.getAltitude() + this.altitude));
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		
        
		
		}
	}
}

