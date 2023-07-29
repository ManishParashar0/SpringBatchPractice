package com.manish.SpringBatch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.manish.SpringBatch.Modal.AnnualSurvey;

@Configuration
@EnableBatchProcessing // this annotation enable the batch Prosses
public class BatchConfig {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JobBuilderFactory builderFactory;
	@Autowired
	private StepBuilderFactory builderFactory2;

	@Bean
	public FlatFileItemReader<AnnualSurvey> fileItemReader() {
		FlatFileItemReader<AnnualSurvey> Reader = new FlatFileItemReader<AnnualSurvey>();
		Reader.setResource(new ClassPathResource("Annual.csv"));
		Reader.setLineMapper(getlinemapper());
		Reader.setLinesToSkip(0);
		return Reader;

	}

	private LineMapper<AnnualSurvey> getlinemapper() {
		DefaultLineMapper<Object> LineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer LineTokenizer = new DelimitedLineTokenizer();
		LineTokenizer.setNames(
				new String[] { "Year", "Industry_aggregation_NZSIOC", "Industry_code_NZSIOC", "Industry_name_NZSIOC" });
		LineTokenizer.setIncludedFields(new int[] { 0, 1, 2, 3 });

		BeanWrapperFieldSetMapper<AnnualSurvey> FieldSetMapper = new BeanWrapperFieldSetMapper<>();
		FieldSetMapper.setTargetType(AnnualSurvey.class);
		LineMapper.setLineTokenizer(LineTokenizer);
		LineMapper.setFieldSetMapper(FieldSetMapper);

		return null;
	}

}
