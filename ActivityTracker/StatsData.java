



import java.util.ArrayList;

public class StatsData extends Running
{
	Running run;//Class variable of runs
	ArrayList<Running> Runs = new ArrayList<Running>(); //an array list of all runs
 
    /*public int avgSteps(super.Steps)
    {
    	
    }
    public float avgCalBurnt(super.CalBurn)
    {
    	
    }
    public int avgActiveTime(super.time)
    {
    	
    }
    public float avgDistance(super.Distance)
    {
    	
    }
    public float avgSpeed(super.Speed)
    {
    	
    }
    public float avgHeartRate(super.HeartRate)
    {
    	
    }*/
	public void AddRun(double time,double distance,double altitude) {
		// a method to add different Runs to the list
		run.Run(distance, time, altitude);
		Runs.add(run);
	}
	public ArrayList<Running> ReturnRuns() { //Returns the list of runs
		return Runs;
	}
}


