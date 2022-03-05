package com.content;

public class Keeper {
  int idkeeper;
  String keeperName;
  String keeperDOB;
  String keeperEmail;
  String keeperPhone;
  String keeperType;
public int getIdkeeper() {
	return idkeeper;
}
public void setIdkeeper(int idkeeper) {
	this.idkeeper = idkeeper;
}
public String getKeeperName() {
	return keeperName;
}
public void setKeeperName(String keeperName) {
	this.keeperName = keeperName;
}
public String getKeeperDOB() {
	return keeperDOB;
}
public void setKeeperDOB(String keeperDOB) {
	this.keeperDOB = keeperDOB;
}
public String getKeeperEmail() {
	return keeperEmail;
}
public void setKeeperEmail(String keeperEmail) {
	this.keeperEmail = keeperEmail;
}
public String getKeeperPhone() {
	return keeperPhone;
}
public void setKeeperPhone(String keeperPhone) {
	this.keeperPhone = keeperPhone;
}
public String getKeeperType() {
	return keeperType;
}
public void setKeeperType(String keeperType) {
	this.keeperType = keeperType;
}

public Keeper(int _idkeeper, String _keeperName, String _keeperDOB,
		String _keeperEmail, String _keeperPhone, String _keeperType) {
	 this.idkeeper = _idkeeper;
	 this.keeperName = _keeperName;
	 this.keeperDOB = _keeperDOB;
	 this.keeperEmail= _keeperEmail;
	 this.keeperPhone = _keeperPhone;
	 this.keeperType= _keeperType;
}
public Keeper(String _keeperName, String _keeperDOB,
		String _keeperEmail, String _keeperPhone, String _keeperType) {
	 this.keeperName = _keeperName;
	 this.keeperDOB = _keeperDOB;
	 this.keeperEmail= _keeperEmail;
	 this.keeperPhone = _keeperPhone;
	 this.keeperType= _keeperType;
}

}