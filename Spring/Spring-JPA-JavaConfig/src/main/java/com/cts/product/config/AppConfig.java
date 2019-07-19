package com.cts.product.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.cts.product.service,com.cts.product.dao" })
@PropertySource(value = { "application.properties" })
@EnableTransactionManagement
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataSource() {

		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));

		return dataSource;
	}
	
	@Bean
	public JpaVendorAdapter getHibJpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		//adapter.setDatabase(Database.MYSQL);
		//adapter.setShowSql(true);
		//adapter.setGenerateDdl(false);
	   // adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
		return adapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean lemb=new LocalContainerEntityManagerFactoryBean();
		lemb.setDataSource(getDataSource());
		lemb.setJpaVendorAdapter(getHibJpaVendorAdapter());
		
	//	LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	//	factoryBean.setDataSource(getDataSource());

		Properties props = new Properties();
		props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		props.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
		props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		lemb.setJpaProperties(props);
		lemb.setPackagesToScan("com.cts.product.entities");

		//factoryBean.setAnnotatedClasses(Product.class,Account.class);

		return lemb;
	}

	@Bean
	public JpaTransactionManager getTransaction() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(getEntityManagerFactory().getObject());
		return transactionManager;

	}

}
