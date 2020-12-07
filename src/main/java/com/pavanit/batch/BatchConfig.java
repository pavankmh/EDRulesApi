package com.pavanit.batch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;

import com.pavanit.entity.CoTriggersEntity;
import com.pavanit.entity.EligibilityDetailsEntity;
import com.pavanit.repository.CoTriggersRepository;
import com.pavanit.repository.EDDetailsRepository;



@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private EDDetailsRepository edRepository;
	
	@Autowired
	private CoTriggersRepository coTriggersRepository;
	
	@Bean
	public JdbcCursorItemReader<EligibilityDetailsEntity> reader(){
		JdbcCursorItemReader<EligibilityDetailsEntity> cursorItemReader = new JdbcCursorItemReader<>();
		
		List<CoTriggersEntity> listCoTriggersEntity=coTriggersRepository.findByTriggerStatus("P");

		return cursorItemReader;
	}
	
	@Bean
	public PersonItenProcessor processor(){
		return new PersonItenProcessor();
	}
	
	@Bean
	public FlatFileItemWriter writer(){

		return null;
	}
	
	@Bean
	public Step step1(){
		return null;
	}

	@Bean
	public Job exportPerosnJob(){
		return jobBuilderFactory.get("exportPeronJob").incrementer(new RunIdIncrementer()).flow(step1()).end().build();
	}
}


