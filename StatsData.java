import java.util.ArrayList;

public class StatsData{
	
	ArrayList<Double> calories = new ArrayList<Double>();
    ArrayList<Double> steps = new ArrayList<Double>();
    ArrayList<Double> activeTimes = new ArrayList<Double>();
    ArrayList<Double> distances = new ArrayList<Double>();
    ArrayList<Double> speeds = new ArrayList<Double>();
    ArrayList<Double> heartRates = new ArrayList<Double>();
	
	public StatsData() {
	}
	
	public ArrayList<Running> importStats() {
		this.Runs = imports.importData();
		return this.Runs;
	}

    
	//method to calculate average of steps
	public Double avgSteps(ArrayList<Double> steps)
    {
 		return avgCalc(steps);
    }
    
    //method to calculate average of calories burnt
    public Double avgCalBurnt(ArrayList<Double> calories)
    {
    	return avgCalc(calories);
    }
    
    //method to calculate average of active times
    public Double avgActiveTime(ArrayList<Double> activeTimes)
    {
    	return avgCalc(activeTimes);
    }
    
    //method to calculate average of distances
    public Double avgDistance(ArrayList<Double> distances)
    {
    	return avgCalc(distances);
    }
    
    //method to calculate average of average speeds
    public Double avgSpeed(ArrayList<Double> speeds)
    {
    	return avgCalc(speeds);
    }
    
   //method to calculate average of average paces
    public Double avgSpeed(ArrayList<Double> paces)
    {
    	return avgCalc(paces);
    }
    
    //method to calculate average of heart rates
    public Double avgHeartRate(ArrayList<Double> heartRates)
    {
        return avgCalc(heartRates);
    }
	
    //method to calculate average of a given array list
	public float avgCalc(ArrayList<Double> list1)
	{
		Double sum=0;
    	for(i=0; i<list1.size(); i++)
    	{
    		sum += list1.get(i);
    	}
    	return sum / list1.size();
	}
}