package com.capgemini.lps.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="loan_details_tb")
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="loan_no")
	private int loanNo;
	
	@NotNull
	@NotEmpty(message = "Please enter loan type")
	@Pattern(regexp="^[a-zA-Z ]{4,25}$", message ="please enter alphabets only..")
	@Size(min=4, message = "lone type should contain atleast 4 characters")
	@Column(name="loan_type")
	private String loanType;
	
	@NotNull
	@NotEmpty(message = "Please enter loan amount")
	@Pattern(regexp="[0-9]{4,8}", message ="Only accepts minimum of 4 digit and maximum of 8 digit loan amount.")
	@Column(name="loan_amount")
	private String loanAmount;
	
	@NotNull
	@NotEmpty(message = "Please enter rate of interest")
	@Pattern(regexp = "([1-9]|1[0-4]).([0-9]{1,4})" , message = "Please enter proper Rate of Intrest (Eg. 6.3%) and should be in between 1.0% to 14.9%")
	@Column(name="rate_of_interest")
	private String rateOfInterest;
	
	@NotNull
	@NotEmpty(message = "Please enter period")
	@Pattern(regexp = "([1-9]|1[0-9]).([0-9]|1[0-1])" , message = "Please enter proper period (Eg. 2 years) and maximum of 19 years.")
	@Column(name="period")
	private String period;

	
	}


