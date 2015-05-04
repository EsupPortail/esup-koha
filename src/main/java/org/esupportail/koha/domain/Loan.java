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

public class Loan {

	String overdue;
	String isbn;
	String borrowernumber;
	String branchcode;
	String itemnumber;
	String date_due;
	String barcode;
	String datelastseen;
	String issuedate;
	String title;
	String number;
	String itemtype;
	String author;
	String timestamp;
	String publishercode;
	String datecreated;
	String dateaccessioned;
	String notes;
	String itype;
	String onloan;
	String biblioitemnumber;
	String wthdrawn;
	String notforloan;
	String replacementpricedate;
	String itemcallnumber;
	String location;
	String itemlost;
	String publicationyear;
	String issues;
	String homebranch;
	String holdingbranch;
	String biblionumber;
	String damaged;
	String cn_sort;
	String frameworkcode;
	String datelastborrowed;
	public String getOverdue() {
		return overdue;
	}
	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBorrowernumber() {
		return borrowernumber;
	}
	public void setBorrowernumber(String borrowernumber) {
		this.borrowernumber = borrowernumber;
	}
	public String getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}
	public String getItemnumber() {
		return itemnumber;
	}
	public void setItemnumber(String itemnumber) {
		this.itemnumber = itemnumber;
	}
	public String getDate_due() {
		return date_due;
	}
	public void setDate_due(String date_due) {
		this.date_due = date_due;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getDatelastseen() {
		return datelastseen;
	}
	public void setDatelastseen(String datelastseen) {
		this.datelastseen = datelastseen;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getPublishercode() {
		return publishercode;
	}
	public void setPublishercode(String publishercode) {
		this.publishercode = publishercode;
	}
	public String getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}
	public String getDateaccessioned() {
		return dateaccessioned;
	}
	public void setDateaccessioned(String dateaccessioned) {
		this.dateaccessioned = dateaccessioned;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getItype() {
		return itype;
	}
	public void setItype(String itype) {
		this.itype = itype;
	}
	public String getOnloan() {
		return onloan;
	}
	public void setOnloan(String onloan) {
		this.onloan = onloan;
	}
	public String getBiblioitemnumber() {
		return biblioitemnumber;
	}
	public void setBiblioitemnumber(String biblioitemnumber) {
		this.biblioitemnumber = biblioitemnumber;
	}
	public String getWthdrawn() {
		return wthdrawn;
	}
	public void setWthdrawn(String wthdrawn) {
		this.wthdrawn = wthdrawn;
	}
	public String getNotforloan() {
		return notforloan;
	}
	public void setNotforloan(String notforloan) {
		this.notforloan = notforloan;
	}
	public String getReplacementpricedate() {
		return replacementpricedate;
	}
	public void setReplacementpricedate(String replacementpricedate) {
		this.replacementpricedate = replacementpricedate;
	}
	public String getItemcallnumber() {
		return itemcallnumber;
	}
	public void setItemcallnumber(String itemcallnumber) {
		this.itemcallnumber = itemcallnumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getItemlost() {
		return itemlost;
	}
	public void setItemlost(String itemlost) {
		this.itemlost = itemlost;
	}
	public String getPublicationyear() {
		return publicationyear;
	}
	public void setPublicationyear(String publicationyear) {
		this.publicationyear = publicationyear;
	}
	public String getIssues() {
		return issues;
	}
	public void setIssues(String issues) {
		this.issues = issues;
	}
	public String getHomebranch() {
		return homebranch;
	}
	public void setHomebranch(String homebranch) {
		this.homebranch = homebranch;
	}
	public String getHoldingbranch() {
		return holdingbranch;
	}
	public void setHoldingbranch(String holdingbranch) {
		this.holdingbranch = holdingbranch;
	}
	public String getBiblionumber() {
		return biblionumber;
	}
	public void setBiblionumber(String biblionumber) {
		this.biblionumber = biblionumber;
	}
	public String getDamaged() {
		return damaged;
	}
	public void setDamaged(String damaged) {
		this.damaged = damaged;
	}
	public String getCn_sort() {
		return cn_sort;
	}
	public void setCn_sort(String cn_sort) {
		this.cn_sort = cn_sort;
	}
	public String getFrameworkcode() {
		return frameworkcode;
	}
	public void setFrameworkcode(String frameworkcode) {
		this.frameworkcode = frameworkcode;
	}
	public String getDatelastborrowed() {
		return datelastborrowed;
	}
	public void setDatelastborrowed(String datelastborrowed) {
		this.datelastborrowed = datelastborrowed;
	}

	
	
}
