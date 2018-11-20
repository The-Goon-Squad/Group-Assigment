



public class Profile {
	private String name;
	private String gender;
	private String dob;
 	private float height;
	private float weight;
	private ImportData data = new ImportData("src/Tracker/file.txt");
	
	   

    public Profile(String name, String gender, String dob, float height, float weight) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		
	}
    
    public void importData() {
    	data.importData();
    }
    public double getDistance() {
    	return data.getDistance();
    }
    public double getAltitude() {
    	return data.getAltitude();
    }
    public double getTime() {
    	return data.getTime();
    }
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
