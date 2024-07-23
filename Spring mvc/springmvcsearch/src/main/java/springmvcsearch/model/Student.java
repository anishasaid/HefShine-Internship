package springmvcsearch.model;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private String email;
	private Long id;
	private Date dob;
	private List<String> courses ;
	private String gender;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", id=" + id + ", dob=" + dob + ", courses=" + courses
				+ ", gender=" + gender + ", type=" + type + "]";
	}
}
