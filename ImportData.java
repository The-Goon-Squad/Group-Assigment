import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class ImportData {
	private Scanner scanner;
	private double[] altitude;
	private double totalAltLoss;
	private double totalAltGain;
	private double lastAlt;
	ArrayList<Running> Runs = new ArrayList<Running>();
	
	public void AddRun(Running run) {
		// a method to add different Runs to the list
		Runs.add(run);
	}
	
	
	
	public ArrayList<Running> importData() {
		
		try {
			Runs.clear();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			scanner = new Scanner(new File("/users/labnet5/gr1/ljs421/workspace/Activity Tracker/src/Input Format.csv"));
			lastAlt = 0;
			String data = scanner.nextLine();
        	String[] tokens = data.split(",");   //Split the csv file into time, distance, altitude and date
        	Date date = new Date();
        	date = sdf.parse(tokens[3]);
			Running run = new Running(0,0,0, date);
	        while(scanner.hasNext()){    //Read the csv file
	        	data = scanner.nextLine();
	        	tokens = data.split(",");
	        	if (Double.parseDouble(tokens[0])==0 && Double.parseDouble(tokens[1])==0){  //This means the current run has ended
	        		Runs.add(run);   		//Add the run to the arraylist and instantiate a new run
	        		date = new Date();
	    			lastAlt = 0;
	        		try {
						run = new Running(0,0,0, sdf.parse(tokens[3]));
					} catch (ParseException e) {
						e.printStackTrace();
					}
	        	}
	        	if (Double.parseDouble(tokens[2]) > lastAlt) {										//Determine whether the user has increased or decreased altitude
	        		run.setAltitudeGain(run.getAltitudeGain() + Double.parseDouble(tokens[2]));
	        	}
	        	
	        	else if(Double.parseDouble(tokens[2]) < lastAlt) {
	        		run.setAltitudeLoss(run.getAltitudeLoss() + Double.parseDouble(tokens[2]));;
	        	}
	        	
	        	lastAlt =  Double.parseDouble(tokens[2]);
	        	
	        	run.setTime(run.getTime() + Double.parseDouble(tokens[0]));
	        	run.setDistance(run.getDistance() + Double.parseDouble(tokens[1]));
	        	
	        }
	        Runs.add(run);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		return Runs;
	}
}

