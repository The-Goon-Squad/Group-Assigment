import java.util.Date;

//All unneeded methods and variables are commented out
public class Running {
	//The variables are defaulted to zero if no data was collected during the run

	private double Distance = 0;
	private double time = 0;
	private double altitudeLoss;
	private double altitudeGain;
	private Date date;
	 // this method is used as the main setter of the class it will set all the stats of the run
	 public Running(double D, double T,double Alt, Date d){
		// this.CalBurn = CB;
		// this.HeartRate = HR;
		// this.Speed = S;
		 //this.Dehydration = DH;
		 this.Distance = D;
		// this.Steps = step;
		 this.time = T;
		 this.altitudeLoss = 0;
		 this.altitudeGain = 0;
		 this.date = d;
		    
	}
	 
	 public double getAvgSpeed() {
		 return Distance/time;
	 }
	 
	 public double getCalsBurned() {
		 double miles = getDistance() * 0.6214;		 
		 return 0.75 * 150 * miles / 1000;
		
	 }
	 
	 public void setAltitudeLoss(double a) {
		 this.altitudeLoss = a;
	 }
	 
	 public void setAltitudeGain(double a) {
		 this.altitudeGain = a;
	 }
	 
	 public double getAltitudeGain() {
		 return this.altitudeGain;
	 }
	 
	 public double getAltitudeLoss() {
		 return this.altitudeLoss;
	 }
	 
	 public void setDate(Date d) {
		 this.date = d;
	 }

	 public void setDistance(double d) {
		 this.Distance = d;
	 }
	 
	 
	 public void setTime(double d) {
		 this.time = d;
	 }

	 public Date getDate() {
		 return (date);
	 }
	 public double getDistance() {
		 return Distance;
	 }

	 public double getTime() {
		 return time;
	 }
}

