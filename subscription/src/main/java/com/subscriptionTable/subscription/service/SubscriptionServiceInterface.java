package com.subscriptionTable.subscription.service;
import java.util.List;

import com.subscriptionTable.subscription.entity.SUBSCRIPTION_TABLE;


public interface SubscriptionServiceInterface {

	public String createProfileService(SUBSCRIPTION_TABLE su);

	public List<SUBSCRIPTION_TABLE> getAllUsers();

	public SUBSCRIPTION_TABLE getProfileService(int uid);

	public String updateProfileService(SUBSCRIPTION_TABLE su);

	public String deleteProfileService(int uid);
}
