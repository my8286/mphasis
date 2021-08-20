package com.javatpoint;
public class Emp {
private int id,salary;
private String name,password,email,city,designation,contact;


public Emp() {
	super();
}

public Emp(int id, int salary, String name, String password, String email, String city, String designation,
		String contact) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.password = password;
	this.email = email;
	this.city = city;
	this.designation = designation;
	this.contact = contact;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getSalary() {
	return salary;
}
public String getDesignation() {
	return designation;
}

@Override
public String toString() {
	return "Emp [id=" + id + ", salary=" + salary + ", name=" + name + ", password=" + password + ", email=" + email
			+ ", city=" + city + ", designation=" + designation + ", contact=" + contact + "]";
}


}
