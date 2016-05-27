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

public class Hold {

	String priority;
	String firstavailablebranch;
	String reservedate;
	String found;
	String timestamp;
	String biblionumber;
	String borrowernumber;
	String reservenumber;
	String branchcode;
	String itemnumber;
	String branchname;
	String constrainttype;
	String lowestPriority;
	String waitingdate;
	String title;

	Item item;

	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getFirstavailablebranch() {
		return firstavailablebranch;
	}
	public void setFirstavailablebranch(String firstavailablebranch) {
		this.firstavailablebranch = firstavailablebranch;
	}

	public String getReservedate() {
		return reservedate;
	}
	public void setReservedate(String reservedate) {
		this.reservedate = reservedate;
	}

	public String getFound() {
		return found;
	}
	public void setFound(String found) {
		this.found = found;
	}

	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getBiblionumber() {
		return biblionumber;
	}
	public void setBiblionumber(String biblionumber) {
		this.biblionumber = biblionumber;
	}

	public String getBorrowernumber() {
		return borrowernumber;
	}
	public void setBorrowernumber(String borrowernumber) {
		this.borrowernumber = borrowernumber;
	}

	public String getReservenumber() {
		return reservenumber;
	}
	public void setReservenumber(String reservenumber) {
		this.reservenumber = reservenumber;
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
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getConstrainttype() {
		return constrainttype;
	}
	public void setConstrainttype(String constrainttype) {
		this.constrainttype = constrainttype;
	}
	public String getLowestPriority() {
		return lowestPriority;
	}
	public void setLowestPriority(String lowestPriority) {
		this.lowestPriority = lowestPriority;
	}
	public String getWaitingdate() {
		return waitingdate;
	}
	public void setWaitingdate(String waitingdate) {
		this.waitingdate = waitingdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item=item;
	}
}
