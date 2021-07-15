	package com.bridgelabz.programs;

import java.util.Objects;

public class Person {
	String FirstName;
	String LastName;
	String Address;
	String City;
    String State;
    String Zip;
    String PhoneNumber;
	String Email;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, City, Email, FirstName, LastName, PhoneNumber, State, Zip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(City, other.City)
				&& Objects.equals(Email, other.Email) && Objects.equals(FirstName, other.FirstName)
				&& Objects.equals(LastName, other.LastName) && Objects.equals(PhoneNumber, other.PhoneNumber)
				&& Objects.equals(State, other.State) && Objects.equals(Zip, other.Zip);
	}
	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City=" + City
				+ ", State=" + State + ", Zip=" + Zip + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + "]";
	}
	
}

	
	
	
	
	
	

	