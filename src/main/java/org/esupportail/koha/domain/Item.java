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

public class Item {

	String isbn;
	String itemnumber;
	String serial;
	String barcode;
	String datelastseen;
	String cn_class;
	String title;
	String pages;
	String number;
	String itemtype;
	String author;
	String size;
	String seriestitle;
	String timestamp;
	String publishercode;
	String datecreated;
	String dateaccessioned;
	String itype;
	String ean;
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
	String renewals;
	String biblionumber;
	String damaged;
	String cn_sort;
	String volume;
	String frameworkcode;
	String datelastborrowed;

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getItemnumber() {
		return itemnumber;
	}
	public void setItemnumber(String itemnumber) {
		this.itemnumber = itemnumber;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
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
	public String getCn_class() {
		return cn_class;
	}
	public void setCn_class(String cn_class) {
		this.cn_class = cn_class;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getnumber() {
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSeriestitle() {
		return seriestitle;
	}
	public void setSeriestitle(String seriestitle) {
		this.seriestitle = seriestitle;
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
	public String getItype() {
		return itype;
	}
	public void setItype(String itype) {
		this.itype = itype;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
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
	public String getRenewals() {
		return renewals;
	}
	public void setRenewals(String renewals) {
		this.renewals = renewals;
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
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
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
