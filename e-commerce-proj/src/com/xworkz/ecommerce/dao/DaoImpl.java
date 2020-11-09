package com.xworkz.ecommerce.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.ecommerce.dto.DTO;




public class DaoImpl implements DaoInterface {

	@Override
	public void saveItems(DTO dto) {
		
		Configuration configuration=new Configuration().configure();
		configuration.addAnnotatedClass(DTO.class);
		ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory factory=configuration.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(dto);
		transaction.commit();
		
	}

}
