package com.aro.handlingformsubmission;

public class RegistrationForm {

  public String firstname;
  public String middlename;
  public String lastname;
  public String phoneNo ;
  public String countryCode;
  public String email;
  public String organization;
  public String password;
  public String environmentType;
  
  public String getEnvType() {
	    return environmentType;
	  }

	  public void setEnvType(String environmentType) {
	    this.environmentType = environmentType;
	  }


  public String getFirstName() {
	    return firstname;
	  }

	  public void setFirstName(String firstname) {
	    this.firstname = firstname;
	  }

	  
}