package com.oneoutlet.webportal.Cfg;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.zaxxer.hikari.HikariDataSource;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.oneoutlet.webportal.Service", "com.oneoutlet.webportal.DAO",
		"com.oneoutlet.webportal.Controller", "com.oneoutlet.common" })
@PropertySource({ "classpath:/com/oneoutlet/common/dbConnection.properties",
		"classpath:/com/oneoutlet/common/validation.properties" })
public class OneoutletCfg implements WebMvcConfigurer {

	@Autowired
	Environment evn;	
	
	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		 registry.addResourceHandler("/Edit/**").addResourceLocations("/WEB-INF/Edit/");
	 
	  }

	 
	@Bean public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewRes = new InternalResourceViewResolver();

		viewRes.setViewClass(JstlView.class);

		viewRes.setPrefix("/WEB-INF/view/");

		viewRes.setSuffix(".jsp");

		return viewRes;
	}

	@Bean
	public HikariDataSource dataSource() {

		HikariDataSource hkDataSource = new HikariDataSource();

		hkDataSource.setDriverClassName(evn.getProperty("jdbc.className"));

		hkDataSource.setJdbcUrl(evn.getProperty("jdbc.url"));

		hkDataSource.setUsername(evn.getProperty("jdbc.username"));

		hkDataSource.setPassword(evn.getProperty("jdbc.password"));

		return hkDataSource;
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SimpleJdbcInsert simpleJdbcInsert() {

		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource());

		return simpleJdbcInsert;
	}

	@Bean
	public JdbcTemplate getTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;

	}

	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();

		javaMailSenderImpl.setHost(evn.getProperty("mail.smtp.host"));
		javaMailSenderImpl.setUsername(evn.getProperty("mail.smtp.userId"));
		javaMailSenderImpl.setPassword(evn.getProperty("mail.smtp.password"));
		javaMailSenderImpl.setPort(Integer.parseInt(evn.getProperty("mail.smtp.port")));

		Properties props = javaMailSenderImpl.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");

		return javaMailSenderImpl;
	}
}
