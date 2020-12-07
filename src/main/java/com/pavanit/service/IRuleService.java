package com.pavanit.service;

import com.pavanit.bo.CitizenInfo;
import com.pavanit.bo.PlanInfo;

public interface IRuleService {

	public PlanInfo executeRules(CitizenInfo citizenInfo);

}