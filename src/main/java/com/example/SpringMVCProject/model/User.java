package com.example.SpringMVCProject.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
@NotNull(message="is required")
@Size(min=4, message="is required")
private String name;
@NotNull(message = "Email cannot be empty")
@Email(message = "Invalid email format")
private String email;
@NotNull(message = "Password is required")
@Size(min = 8, message = "Password must be at least 8 characters long")
private String password;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
