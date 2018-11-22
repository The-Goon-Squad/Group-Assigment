import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ImportData {
	private Scanner scanner;
	ArrayList<Running> Runs = new ArrayList<Running>();
	
	public void AddRun(Running run) {
		// a method to add different Runs to the list
		Runs.add(run);
	}
	
	
	
	public ArrayList<Running> importData() {
		
		try {
			scanner = new Scanner(new File("/Users/mallorynolan/git/Group-Assigment/ActivityTracker/InputFormat.csv"));
			String data = scanner.nextLine();
        	String[] tokens = data.split(",");
        	double totalAltitude = 0;
        	int altCount = 0;
			Running run = new Running(0,0,0,tokens[3]);
	        while(scanner.hasNext()){
	        	data = scanner.nextLine();
	        	tokens = data.split(",");
	        	if (Double.parseDouble(tokens[0])==0 && Double.parseDouble(tokens[1])==0){
	        		run.setAltitude(totalAltitude/altCount);
	        		altCount = 0;
	        		Runs.add(run);
	        		run = new Running(0,0,0, tokens[3]);
	        		run.setDate(tokens[3]);
	        	}
	        	run.setTime(run.getTime() + Double.parseDouble(tokens[0]));
	        	run.setDistance(run.getDistance() + Double.parseDouble(tokens[1]));
	        	totalAltitude += Double.parseDouble(tokens[2]);
	        	altCount++;
	        	
	        }
	        run.setAltitude(totalAltitude/altCount);
	        altCount = 0;
	        Runs.add(run);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Runs;
	}
}

