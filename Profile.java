import java.util.ArrayList;

public class Profile {
	private String name;
	private String gender;
	private String dob;
 	private float height;
	private float weight;
	private StatsData data = new StatsData();
	
	   

    public Profile(String n, String d, String g, float h, float w) {
		this.name = n;
		this.dob = d;
		this.gender = g;
		this.height = h;
		this.weight = w;
		
	}
    
    public void importData() {
    	data.importData();
    }
    
    public ArrayList<Running> getData() {
    	return data.getRuns();
    }
    
    public double getAvgSpeed() {
    	return data.avgSpeed();
    }
    
    public double getAvgCalsBurned() {
    	return data.avgCalsBurnt();
    }
    
    public double getAvgDistance() {
    	return data.avgDistance();
    }
    
    public double getAvgTime() {
    	return data.avgActiveTime();
    }
    /*public double getDistance() {
    	return data.getDistance();
    }
    public double getAltitude() {
    	return data.getAltitude();
    }
    public double getTime() {
    	return data.getTime();
    }*/
	public void setName(String name) {
		this.name = name;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setweight(float weight) {
		this.weight = weight;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName(){
		return this.name;
	}

	public String getDOB(){
		return this.dob;
	}

	public float getHeight(){
		return this.height;
	}
	
	public String getGender() {
		return this.gender;
	}

	public float getWeight(){
		return this.weight;
	}
}

