package com.manish.SpringBatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.manish.SpringBatch.Modal.AnnualSurvey;

public class UserItemProcessor implements ItemProcessor<AnnualSurvey, AnnualSurvey> {

	@Override
	public AnnualSurvey process(AnnualSurvey item) throws Exception {
		return null;

	}

}
