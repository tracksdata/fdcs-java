package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.config.HibernateConfig;
import com.cts.product.model.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		HibernateConfig config = ac.getBean(HibernateConfig.class);

		SessionFactory sf = config.getSessionFactory();

		Session ses = sf.openSession();

		Product prod = new Product();
		prod.setProduct_id("P001");
		prod.setProduct_name("Book");
		prod.setSalary(8465);

		ses.save(prod);
		ses.beginTransaction().commit();

	}

}
