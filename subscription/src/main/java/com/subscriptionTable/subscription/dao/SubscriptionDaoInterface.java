package com.subscriptionTable.subscription.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subscriptionTable.subscription.entity.SUBSCRIPTION_TABLE;

@Repository
public interface SubscriptionDaoInterface extends JpaRepository<SUBSCRIPTION_TABLE, Long>{

}
