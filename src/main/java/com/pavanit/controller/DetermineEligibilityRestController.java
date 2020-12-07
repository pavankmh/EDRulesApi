package com.pavanit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavanit.bo.CitizenInfo;
import com.pavanit.bo.PlanInfo;
import com.pavanit.service.DetermineEligibilityService;

@RestController
public class DetermineEligibilityRestController {

	@Autowired
	private DetermineEligibilityService eligService;

	@PostMapping(
		value = "/determineElig", 
		produces = { "application/xml", "application/json" },
		consumes= {"application/xml", "application/json"}
	)
	public PlanInfo checkPlanEligibility(@RequestBody CitizenInfo indvInfo) {
		PlanInfo planInfo = eligService.determineEligibility(indvInfo);
		return planInfo;
	}
}