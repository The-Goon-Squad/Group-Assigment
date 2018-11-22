import java.util.ArrayList;

public class StatsData{
	Running run;//Class variable of runs
	ImportData imports = new ImportData();
	ArrayList<Running> Runs = new ArrayList<Running>(); //an array list of all runs
   
	/*ArrayList<Double> calories = new ArrayList<Double>();
    ArrayList<Double> steps = new ArrayList<Double>();
    ArrayList<Double> activeTimes = new ArrayList<Double>();
    ArrayList<Double> distances = new ArrayList<Double>();
    ArrayList<Double> speeds = new ArrayList<Double>();
    ArrayList<Double> heartRates = new ArrayList<Double>();*/
	
	public StatsData() {
	}
	
	public ArrayList<Running> importStats() {
		this.Runs = imports.importData();
		return this.Runs;
	}

    
	//method to calculate average of steps
	/*public int avgSteps(ArrayList<Double> steps)
    {
        Double sum=0;
    	for(i=0; i<steps.size(); i++)
    	{
    		sum += steps.get(i);
    	}
    	return sum / steps.size();
    }
    
    //method to calculate average of calories burnt
    public float avgCalBurnt(ArrayList<Double> calories)
    {
    	Double sum=0;
    	for(i=0; i<calories.size(); i++)
    	{
    		sum += calories.get(i);
    	}
    	return sum / calories.size();
    }
    
    //method to calculate average of active times
    public int avgActiveTime(ArrayList<Double> activeTimes)
    {
    	Double sum=0;
    	for(i=0; i<activeTimes.size(); i++)
    	{
    		sum += activeTimes.get(i);
    	}
    	return sum / activeTimes.size();
    }
    
    //method to calculate average of distances
    public float avgDistance(ArrayList<Double> distances)
    {
    	Double sum=0;
    	for(i=0; i<distances.size(); i++)
    	{
    		sum += distances.get(i);
    	}
    	return sum / distances.size();
    }
    
    //method to calculate average of average speeds
    public float avgSpeed(ArrayList<Double> speeds)
    {
    	Double sum=0;
    	for(i=0; i<speeds.size(); i++)
    	{
    		sum += speeds.get(i);
    	}
    	return sum / speeds.size();
    }
    
    //method to calculate average of heart rates
    public float avgHeartRate(ArrayList<Double> heartRates)
    {
    	Double sum=0;
    	for(i=0; i<heartRates.size(); i++)
    	{
    		sum += heartRates.get(i);
    	}
    	return sum / heartRates.size();
    }*/
	
}

