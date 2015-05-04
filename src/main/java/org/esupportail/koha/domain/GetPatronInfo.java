/**
 * Licensed to EsupPortail under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * EsupPortail licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.esupportail.koha.domain;

import java.util.List;

public class GetPatronInfo {

	String category_type;
	String categorycode;
	String B_address;
	String contactnote;
	String endguaranteedate;
	String email;
	String B_country;
	String borrowernumber;
	String lost;
	String branchcode;
	String amountoutstanding;
	String description;
	String altcontactaddress3;
	String title;
	String enrolmentperiod;
	String mobile;
	String fax;
	String altcontactphone;
	String country;
	String dateenrolled;
	String guarantorid;
	String address2;
	String borrowernotes;
	String dateexpiry;
	String sort2;
	String phonepro;
	String emailpro;
	String firstname;
	String altcontactcountry;
	String gonenoaddress;
	String othernames;
	String altcontactaddress2;
	String address;
	String B_address2;
	String streetnumber;
	String branchname;
	String lostcomment;
	String surname;
	String gonenoaddresscomment;
	String cardnumber;
	String altcontactsurname;
	String altcontactzipcode;
	String opacnote;
	String altcontactfirstname;
	String B_zipcode;
	String B_email;
	String city;
	String B_phone;
	String debarredcomment;
	String sort1;
	String zipcode;
	String phone;
	String altcontactaddress1;
	String B_city;
	
	List<Loan> loans;
	
	public String getCategory_type() {
		return category_type;
	}
	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}
	public String getCategorycode() {
		return categorycode;
	}
	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}
	public String getB_address() {
		return B_address;
	}
	public void setB_address(String b_address) {
		B_address = b_address;
	}
	public String getContactnote() {
		return contactnote;
	}
	public void setContactnote(String contactnote) {
		this.contactnote = contactnote;
	}
	public String getEndguaranteedate() {
		return endguaranteedate;
	}
	public void setEndguaranteedate(String endguaranteedate) {
		this.endguaranteedate = endguaranteedate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getB_country() {
		return B_country;
	}
	public void setB_country(String b_country) {
		B_country = b_country;
	}
	public String getBorrowernumber() {
		return borrowernumber;
	}
	public void setBorrowernumber(String borrowernumber) {
		this.borrowernumber = borrowernumber;
	}
	public String getLost() {
		return lost;
	}
	public void setLost(String lost) {
		this.lost = lost;
	}
	public String getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}
	public String getAmountoutstanding() {
		return amountoutstanding;
	}
	public void setAmountoutstanding(String amountoutstanding) {
		this.amountoutstanding = amountoutstanding;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAltcontactaddress3() {
		return altcontactaddress3;
	}
	public void setAltcontactaddress3(String altcontactaddress3) {
		this.altcontactaddress3 = altcontactaddress3;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEnrolmentperiod() {
		return enrolmentperiod;
	}
	public void setEnrolmentperiod(String enrolmentperiod) {
		this.enrolmentperiod = enrolmentperiod;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAltcontactphone() {
		return altcontactphone;
	}
	public void setAltcontactphone(String altcontactphone) {
		this.altcontactphone = altcontactphone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDateenrolled() {
		return dateenrolled;
	}
	public void setDateenrolled(String dateenrolled) {
		this.dateenrolled = dateenrolled;
	}
	public String getGuarantorid() {
		return guarantorid;
	}
	public void setGuarantorid(String guarantorid) {
		this.guarantorid = guarantorid;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getBorrowernotes() {
		return borrowernotes;
	}
	public void setBorrowernotes(String borrowernotes) {
		this.borrowernotes = borrowernotes;
	}
	public String getDateexpiry() {
		return dateexpiry;
	}
	public void setDateexpiry(String dateexpiry) {
		this.dateexpiry = dateexpiry;
	}
	public String getSort2() {
		return sort2;
	}
	public void setSort2(String sort2) {
		this.sort2 = sort2;
	}
	public String getPhonepro() {
		return phonepro;
	}
	public void setPhonepro(String phonepro) {
		this.phonepro = phonepro;
	}
	public String getEmailpro() {
		return emailpro;
	}
	public void setEmailpro(String emailpro) {
		this.emailpro = emailpro;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAltcontactcountry() {
		return altcontactcountry;
	}
	public void setAltcontactcountry(String altcontactcountry) {
		this.altcontactcountry = altcontactcountry;
	}
	public String getGonenoaddress() {
		return gonenoaddress;
	}
	public void setGonenoaddress(String gonenoaddress) {
		this.gonenoaddress = gonenoaddress;
	}
	public String getOthernames() {
		return othernames;
	}
	public void setOthernames(String othernames) {
		this.othernames = othernames;
	}
	public String getAltcontactaddress2() {
		return altcontactaddress2;
	}
	public void setAltcontactaddress2(String altcontactaddress2) {
		this.altcontactaddress2 = altcontactaddress2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getB_address2() {
		return B_address2;
	}
	public void setB_address2(String b_address2) {
		B_address2 = b_address2;
	}
	public String getStreetnumber() {
		return streetnumber;
	}
	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getLostcomment() {
		return lostcomment;
	}
	public void setLostcomment(String lostcomment) {
		this.lostcomment = lostcomment;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGonenoaddresscomment() {
		return gonenoaddresscomment;
	}
	public void setGonenoaddresscomment(String gonenoaddresscomment) {
		this.gonenoaddresscomment = gonenoaddresscomment;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getAltcontactsurname() {
		return altcontactsurname;
	}
	public void setAltcontactsurname(String altcontactsurname) {
		this.altcontactsurname = altcontactsurname;
	}
	public String getAltcontactzipcode() {
		return altcontactzipcode;
	}
	public void setAltcontactzipcode(String altcontactzipcode) {
		this.altcontactzipcode = altcontactzipcode;
	}
	public String getOpacnote() {
		return opacnote;
	}
	public void setOpacnote(String opacnote) {
		this.opacnote = opacnote;
	}
	public String getAltcontactfirstname() {
		return altcontactfirstname;
	}
	public void setAltcontactfirstname(String altcontactfirstname) {
		this.altcontactfirstname = altcontactfirstname;
	}
	public String getB_zipcode() {
		return B_zipcode;
	}
	public void setB_zipcode(String b_zipcode) {
		B_zipcode = b_zipcode;
	}
	public String getB_email() {
		return B_email;
	}
	public void setB_email(String b_email) {
		B_email = b_email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getB_phone() {
		return B_phone;
	}
	public void setB_phone(String b_phone) {
		B_phone = b_phone;
	}
	public String getDebarredcomment() {
		return debarredcomment;
	}
	public void setDebarredcomment(String debarredcomment) {
		this.debarredcomment = debarredcomment;
	}
	public String getSort1() {
		return sort1;
	}
	public void setSort1(String sort1) {
		this.sort1 = sort1;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAltcontactaddress1() {
		return altcontactaddress1;
	}
	public void setAltcontactaddress1(String altcontactaddress1) {
		this.altcontactaddress1 = altcontactaddress1;
	}
	public String getB_city() {
		return B_city;
	}
	public void setB_city(String b_city) {
		B_city = b_city;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
}
