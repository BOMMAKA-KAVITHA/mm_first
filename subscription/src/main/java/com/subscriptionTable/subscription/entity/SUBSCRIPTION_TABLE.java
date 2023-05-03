package com.subscriptionTable.subscription.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@Setter
@Getter
@ToString
public class SUBSCRIPTION_TABLE {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerid;
	private String subscriptionservice;
	private String servicedescription;
	private int serviceprice;
	private String renewalduration;
	private String subscriptionstatus;
	
}
