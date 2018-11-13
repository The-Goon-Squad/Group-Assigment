public class Profile {
	private String name;
	private String gender;
	private String dob;
 	private float height;
	private float weight;
	   

    	public Profile(String name, String gender, String dob, float height, float weight) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
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
	
	public void setWeight(float weight) {
		this.weight = weight;
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

	public float getWeight(){
		return this.weight;
	}
}
