package com.pavanit.service;
import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.pavanit.bo.PlanInfo;
import com.pavanit.bo.CitizenInfo;

@Service("eligService")
public class DetermineEligibilityService {

	public PlanInfo determineEligibility(CitizenInfo citizenInfo) {
		String planName = citizenInfo.getPlanName();
		String clzName = "com.pavanit.service."+planName+"RulesExecutor";
		PlanInfo planInfo = null;
		try {
			Class<?> clz = Class.forName(clzName);
			
			Method method = clz.getDeclaredMethod("executeRules", CitizenInfo.class);
			
			Object object = clz.newInstance();
			
			planInfo =  (PlanInfo) method.invoke(object, citizenInfo);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return planInfo;
	}
}