package com.content;

public class Animals {
private int animalsID;
private String name;
private String gender;
private int year;
private int SID;
private int DID;
private int KID;
private int EID;
private String keepername;
private int totalanimals;

public String getKeepername() {
	return keepername;
}
public void setKeepername(String keepername) {
	this.keepername = keepername;
}
public int getTotalanimals() {
	return totalanimals;
}
public void setTotalanimals(int totalanimals) {
	this.totalanimals = totalanimals;
}
public int getAnimalsID() {
	return animalsID;
}
public void setAnimalsID(int animalsID) {
	this.animalsID = animalsID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getSID() {
	return SID;
}
public void setSID(int SID) {
	this.SID = SID;
}
public int getDID() {
	return DID;
}
public void setDID(int dID) {
	this.DID = dID;
}
public int getKID() {
	return KID;
}
public void setKID(int KID) {
	this.KID = KID;
}
public int getEID() {
	return EID;
}
public void setEID(int EID) {
	this.EID = EID;
}
public Animals(int _animalsID, String _name, String _gender, int _year, int _SID, int _DID, int _KID, int _EID) {
	this.animalsID = _animalsID;
	this.name= _name;
	this.gender= _gender;
	this.year= _year;
	this.SID= _SID;
	this.DID= _DID;
	this.KID= _KID;
	this.EID= _EID;
}
public Animals(String _name, String _gender, int _year, int _SID, int _DID, int _KID, int _EID) {
	this.name= _name;
	this.gender= _gender;
	this.year= _year;
	this.SID= _SID;
	this.DID= _DID;
	this.KID= _KID;
	this.EID= _EID;
}
public Animals (int _animalId,String _name,String _gender,int _year,int _keeperId,String _keepername) {
	this.animalsID=_animalId;
	this.name=_name;
	this.gender=_gender;
	this.year=_year;
	this.KID=_keeperId;
	this.keepername=_keepername;
}
public Animals (String _keepername, int _totalanimals) {
	this.keepername=_keepername;
	this.totalanimals=_totalanimals;
}
}
