package com.subscriptionTable.subscription.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("viewAllSubscriptions")
	public List<SUBSCRIPTION_TABLE> viewAll(){
		return ss.getAllProfileService();
	}
	@GetMapping("viewSubscription/{id}")
	public SUBSCRIPTION_TABLE viewProfile(@PathVariable("id")Long uid){
		return ss.getProfileService(uid);
	}
	@DeleteMapping("deleteSubscription/{id}")
	public String deleteProfile(@PathVariable("id")Long uid){
		return ss.deleteProfileService(uid);
	}
	@PutMapping("editSubscription/{id}")
	public String editProfile(@PathVariable("id")Long uid,@RequestBody SUBSCRIPTION_TABLE iu){
		return ss.editProfileService(iu);
	}
	

}

