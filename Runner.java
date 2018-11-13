public class Running {
	//The variables are defaulted to zero if no data was collected during the run
	private float CalBurn = 0;
	private float HeartRate = 0;
	private float Speed = 0;
	private boolean Dehydration = false;
	private float Distance = 0;
	private int Steps = 0;
	private int time = 0;
	 // this method is used as the main setter of the class it will set all the stats of the run
	 public void Run(float CB, float HR,float S,boolean DH,
					float D, int step, int T){
		 this.CalBurn = CB;
		 this.HeartRate = HR;
		 this.Speed = S;
		 this.Dehydration = DH;
		 this.Distance = D;
		 this.Steps = step;
		 this.time = T;
		    
	}
	 public void setCalburn(float CB) {
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
	 }
	 public void setDistance(float D) {
		 this.Distance = D;
	 }
	 public void setSteps(int step) {
		 this.Steps = step;
	 }
	 public void setTime(int T) {
		 this.time = T;
	 }
	 public float getCalBurn() {
		 return CalBurn;
	 }
	 public float getHeartRate() {
		 return HeartRate;
	 }
	 public float getSpeed() {
		 return Speed;
	 }
	 public boolean getDehydration() {
		 return Dehydration;
	 }
	 public float getDistance() {
		 return Distance;
	 }
	 public int getSteps() {
		 return Steps;
	 }
	 public int getTime() {
		 return time;
	 }
}
