package com.content;

public class diet {
private int dietID;
private String type;
private int NOF;

public int getDietID() {
	return dietID;
}

public void setDietID(int dietID) {
	this.dietID = dietID;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getNOF() {
	return NOF;
}

public void setNOF(int NOF) {
    this.NOF = NOF;
}
public diet(int _dietID, String _type, int _NOF) {
	this.dietID = _dietID;
	this.type = _type;
	this.NOF = _NOF;
}
public diet( String _type, int _NOF) {
	this.type = _type;
	this.NOF = _NOF;
}
}
