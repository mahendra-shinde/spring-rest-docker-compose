package com.mahendra.apiapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

		@Id
		@Column(name="CUST_CODE",length = 6)
		private String code;
		
		@Column(name="CUST_NAME",length = 40)
		private String name;
		
		@Column(name="CUST_CITY",length = 35)
		private String city;
		
		@Column(name="WORKING_AREA", length = 35)
		private String address;
		
		@Column(name="CUST_COUNTRY", length = 20)
		private String country;
		
		@Column(name="GRADE", precision = 10, scale = 0)
		private Double grade;
		
		@Column(name="OPENING_AMT", precision = 12, scale = 2)
		private Double openingBalance;
		
		@Column(name="RECEIVE_AMT", precision = 12, scale = 2)
		private Double amountReceived;
		
		@Column(name="PAYMENT_AMT", precision = 12, scale = 2)
		private Double amountPaid;
		
		@Column(name="OUTSTANDING_AMT", precision = 12, scale = 2)
		private Double oustandingBalance;
		
		@Column(name="PHONE_NO", length = 17)
		private String phone;
		
		@Column(name="AGENT_CODE", length = 6)
		private String agentCode;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Double getGrade() {
			return grade;
		}

		public void setGrade(Double grade) {
			this.grade = grade;
		}

		public Double getOpeningBalance() {
			return openingBalance;
		}

		public void setOpeningBalance(Double openingBalance) {
			this.openingBalance = openingBalance;
		}

		public Double getAmountReceived() {
			return amountReceived;
		}

		public void setAmountReceived(Double amountReceived) {
			this.amountReceived = amountReceived;
		}

		public Double getAmountPaid() {
			return amountPaid;
		}

		public void setAmountPaid(Double amountPaid) {
			this.amountPaid = amountPaid;
		}

		public Double getOustandingBalance() {
			return oustandingBalance;
		}

		public void setOustandingBalance(Double oustandingBalance) {
			this.oustandingBalance = oustandingBalance;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAgentCode() {
			return agentCode;
		}

		public void setAgentCode(String agentCode) {
			this.agentCode = agentCode;
		}
		
		
}
