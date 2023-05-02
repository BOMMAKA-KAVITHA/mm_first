package com.subscriptionTable.subscription.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data
public class SUBSCRIPTION_TABLE {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CustomerId;
	private String SubscriptionService;
	private String ServiceDescription;
	private int ServicePrice;
	private String RenewalDuration;
	private String SubscriptionStatus;

}
