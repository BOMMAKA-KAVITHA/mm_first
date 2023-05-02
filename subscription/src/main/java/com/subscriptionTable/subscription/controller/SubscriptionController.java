package com.subscriptionTable.subscription.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.subscriptionTable.subscription.entity.SUBSCRIPTION_TABLE;
import com.subscriptionTable.subscription.service.SubscriptionServiceInterface;

@RestController
public class SubscriptionController {
	
	@Autowired
	private SubscriptionServiceInterface ss;

	@PostMapping("/addSubscription")
	public String createProfile(@RequestBody SUBSCRIPTION_TABLE su) {
		return ss.createProfileService(su);
	}
	
	@GetMapping("/viewAllSubscriptions")
	public List<SUBSCRIPTION_TABLE> viewAll(){
		return ss.getAllUsers();
	}
	
	@GetMapping("/viewSubscription/{id}")
	public SUBSCRIPTION_TABLE viewProfile(@PathVariable("id") int uid) {
		return ss.getProfileService(uid);
	}
	@PutMapping("/updateSubscription/{id}")
	public String updateProfile(@PathVariable("id")int uid,@RequestBody SUBSCRIPTION_TABLE su) {
		return ss.updateProfileService(su);
	}
	
	@DeleteMapping("/deleteSubscription/{id}")

	public String deleteProfile(@PathVariable("id")int uid){
		return ss.deleteProfileService(uid);

	}
	

}

