package com.cts.product.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "db.properties" })
public class HibernateConfig {

	@Autowired
	private Environment env;
	private static SessionFactory sessionFactory;

	
	public SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(org.hibernate.cfg.Environment.DRIVER, env.getProperty("driverclass"));
				settings.put(org.hibernate.cfg.Environment.URL, env.getProperty("url"));
				settings.put(org.hibernate.cfg.Environment.USER, env.getProperty("db.user"));
				settings.put(org.hibernate.cfg.Environment.PASS, env.getProperty("pwd"));
				settings.put(org.hibernate.cfg.Environment.DIALECT, env.getProperty("dialect"));
				settings.put(org.hibernate.cfg.Environment.SHOW_SQL, env.getProperty("showsql"));
				settings.put(org.hibernate.cfg.Environment.FORMAT_SQL, env.getProperty("formatsql"));

				settings.put(org.hibernate.cfg.Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(settings);

				configuration.addAnnotatedClass(com.cts.product.model.Product.class);
				// configuration.addAnnotatedClass(Department.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

}
