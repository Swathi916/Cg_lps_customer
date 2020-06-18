package com.capgemini.lps.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="applicant_info")
public class Applicant  implements Serializable{
	private static final long serialVersionUID = 1L;
	
		@Id
		@Column(name = "application_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int appId;
		
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
		@NotEmpty(message = "Please enter application status")
		@Pattern(regexp="^[a-zA-Z]{3,15}$", message ="please enter alphabets only..")
		@Size(min=3, message = "application status should be atleast 3 characters")
		@Column(name = "application_status")
		private String applicationStatus;

		@ManyToOne
		@JoinColumn(name = "userId")
		@JsonBackReference
		private User user;

		
	} // end of class


