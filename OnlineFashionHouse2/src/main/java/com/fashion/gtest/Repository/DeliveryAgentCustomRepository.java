package com.fashion.gtest.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fashion.gtest.Entity.DeliveryAgent;


@Repository
public interface DeliveryAgentCustomRepository {

	public DeliveryAgent  getDeliveryAgentByDate(String Date)throws Exception;
		
		public DeliveryAgent  getDeliveryAgentByCost(int Cost)throws Exception;
		
		public List<DeliveryAgent> getDeliveryAgentByUserId(int userId)throws Exception;

}
