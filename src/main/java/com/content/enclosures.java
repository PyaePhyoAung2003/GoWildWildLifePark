package com.content;

public class enclosures {
private int enclosuresID;
private String type;
private String location;

public int getEnclosuresID() {
	return enclosuresID;
}
public void setEnclosuresID(int enclosuresID) {
	this.enclosuresID = enclosuresID;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

public enclosures(int _enclosuresID, String _type, String _location) {
	this.enclosuresID = _enclosuresID;
	this.type = _type;
	this.location = _location;
	
}
public enclosures( String _type, String _location) {
	this.type = _type;
	this.location = _location;
	
}
}
