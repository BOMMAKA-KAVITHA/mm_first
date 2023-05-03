package com.subscriptionTable.subscription.service;
import java.util.List;

import com.subscriptionTable.subscription.entity.SUBSCRIPTION_TABLE;


public interface SubscriptionServiceInterface {

	public String createProfileService(SUBSCRIPTION_TABLE su);

	public List<SUBSCRIPTION_TABLE> getAllProfileService();

	public SUBSCRIPTION_TABLE getProfileService(Long uid);

	public String deleteProfileService(Long uid);

	public String editProfileService(SUBSCRIPTION_TABLE iu);

}
