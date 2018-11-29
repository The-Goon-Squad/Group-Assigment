



import java.util.ArrayList;

public class StatsData{
	Running run;//Class variable of runs
	ImportData imports = new ImportData();
	ArrayList<Running> Runs = new ArrayList<Running>(); //an array list of all runs
   
	ArrayList<Double> calories = new ArrayList<Double>();
    ArrayList<Double> steps = new ArrayList<Double>();
    ArrayList<Double> activeTimes = new ArrayList<Double>();
    ArrayList<Double> distances = new ArrayList<Double>();
    ArrayList<Double> speeds = new ArrayList<Double>();
    ArrayList<Double> heartRates = new ArrayList<Double>();
	
	public StatsData() {
	}
	
	
	public void importData(String fileField) {
		ArrayList<Running> newData = imports.importData(fileField);
		
		for (int i = 0; i < newData.size(); i++){
			Runs.add(newData.get(i));
		}
		
	}
	
	public ArrayList<Running> getRuns() {
		return this.Runs;
	}
	
	//method to calculate average of steps
	public Double avgSteps()
    {
 		return avgCalc(steps);
    }
    
    //method to calculate average of calories burnt
    public Double avgCalsBurnt()
    {
    	ArrayList<Double> cals = new ArrayList<Double>();
    	for(Running i : Runs) {
    		cals.add(i.getCalsBurned());
    	}
    	return avgCalc(cals);
    }
    
    //method to calculate average of active times
    public Double avgActiveTime()
    {
    	ArrayList<Double> times = new ArrayList<Double>();
    	for(Running i : Runs) {
    		times.add(i.getTime());
    	}
    	return avgCalc(times);
    }
    
    //method to calculate average of distances
    public Double avgDistance()
    {
    	ArrayList<Double> distances = new ArrayList<Double>();
    	for(Running i : Runs) {
    		distances.add(i.getDistance());
    	}
    	return avgCalc(distances);
    }

    
   //method to calculate average of average paces
    public Double avgSpeed()
    {
    	ArrayList<Double> speeds = new ArrayList<Double>();
    	for(Running i : Runs) {
    		speeds.add(i.getAvgSpeed());
    	}
    	return avgCalc(speeds);
    }
    
    //method to calculate average of heart rates
    public Double avgHeartRate(ArrayList<Double> heartRates)
    {
        return avgCalc(heartRates);
    }
	
    //method to calculate average of a given array list
	public double avgCalc(ArrayList<Double> list1)
	{
		Double sum = 0.0;
    	for(int i=0; i<list1.size(); i++)
    	{
    		sum += list1.get(i);
    	}
    	return sum / list1.size();
	}
}