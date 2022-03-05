package com.content;

public class Species {
private int SpeciesID;
String type;
String group;
String lifestyle;
String conservationstatus;


public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
public String getLifestlye() {
	return lifestyle;
}
public void setLifestlye(String lifestlye) {
	this.lifestyle = lifestlye;
}
public String getConservationstatus() {
	return conservationstatus;
}
public void setConservationstatus(String conservationstatus) {
	this.conservationstatus = conservationstatus;
}
public Species(int _SpeciesID, String type, String _group, String _lifestyle, String _conservationstatus) {
	this.setSpeciesID(_SpeciesID);
	this.type = type;
	this.group = _group;
	this.lifestyle = _lifestyle;
	this.conservationstatus = _conservationstatus;
}
public Species(String type, String _group, String _lifestyle, String _conservationstatus) {
	this.type = type;
	this.group = _group;
	this.lifestyle = _lifestyle;
	this.conservationstatus = _conservationstatus;
}
public static void add(Species s) {
	// TODO Auto-generated method stub
	
}
public int getSpeciesID() {
	return SpeciesID;
}
public void setSpeciesID(int speciesID) {
	SpeciesID = speciesID;
}
}
