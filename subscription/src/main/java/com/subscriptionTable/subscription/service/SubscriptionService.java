package com.subscriptionTable.subscription.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.subscriptionTable.subscription.dao.SubscriptionDaoInterface;
import com.subscriptionTable.subscription.entity.SUBSCRIPTION_TABLE;

import jakarta.transaction.Transactional;

@Service
@Transactional
@Scope(scopeName="prototype")
public class SubscriptionService implements SubscriptionServiceInterface{

	@Autowired
	private SubscriptionDaoInterface sd;
	
	@Override
	public String createProfileService(SUBSCRIPTION_TABLE su) {
		sd.save(su);
		return "profile created";
		//return su;
	}

	@Override
	public List<SUBSCRIPTION_TABLE> getAllProfileService() {
		return sd.findAll();
	}

	@Override
	public SUBSCRIPTION_TABLE getProfileService(Long uid) {
		SUBSCRIPTION_TABLE ss= null;
		Optional<SUBSCRIPTION_TABLE>oo = sd.findById(uid);
		if(oo.isPresent()) {
			ss=oo.get();
			}
		return ss;
	}

	@Override
	public String deleteProfileService(Long uid) {
		sd.deleteById(uid);
		return "Profile deleted !";
	}

	@Override
	public String editProfileService(SUBSCRIPTION_TABLE iu) {
		sd.saveAndFlush(iu);
		return "profile edited !";
	}

	}