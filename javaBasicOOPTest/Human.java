package javaBasicOOPTest;

public class Human {
	protected String name;
	private String gender;
	private String job;
	public int age;
	
	public Human(String name, String gender, String job, int age) {
		this.name = name;
		this.gender = gender;
		this.job = job;
		this.age = age;
	}

	protected String getName() {
		return name;
		
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getJob() {
		return job;
	}
}
