

//All unneeded methods and variables are commented out
public class Running {
	//The variables are defaulted to zero if no data was collected during the run
	//private float CalBurn = 0;
	//private float HeartRate = 0;
	//private float Speed = 0;
	//private boolean Dehydration = false;
	private double Distance = 0;
	//private int Steps = 0;
	private double time = 0;
	private double altitude = 0;
	 // this method is used as the main setter of the class it will set all the stats of the run
	 public void Run(double D, double T,double Alt){
		// this.CalBurn = CB;
		// this.HeartRate = HR;
		// this.Speed = S;
		 //this.Dehydration = DH;
		 this.Distance = D;
		// this.Steps = step;
		 this.time = T;
		 this.altitude = Alt;
		    
	}
	 public void setAltitude(double a) {
		 this.altitude = a;
	 }
	 /*public void setCalburn(float CB) {
		 this.CalBurn = CB;
	 }
	 public void setHeartRate(float HR) {
		 this.HeartRate = HR;
	 }
	 public void setSpeed(float S) {
		 this.Speed = S;
	 }
	 public void setDehydration(Boolean DH) {
		 this.Dehydration = DH;
	 }*/
	 public void setDistance(double d) {
		 this.Distance = d;
	 }
	 /*public void setSteps(int step) {
		 this.Steps = step;
	 }*/
	 public void setTime(double d) {
		 this.time = d;
	 }
	 /*public float getCalBurn() {
		 return CalBurn;
	 }
	 public float getHeartRate() {
		 return HeartRate;
	 }
	 public float getSpeed() {
		 return Speed;
	 }*/
	 public double getAltitude() {
		 return altitude;
	 }
	 /*public boolean getDehydration() {
		 return Dehydration;
	 }*/
	 public double getDistance() {
		 return Distance;
	 }
	 /*public int getSteps() {
		 return Steps;
	 }*/
	 public double getTime() {
		 return time;
	 }
}
