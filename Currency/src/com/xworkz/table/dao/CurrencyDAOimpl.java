package com.xworkz.table.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.table.dto.CurrencyDTO;


public class CurrencyDAOimpl implements CurrencyDAO {

	@Override
	public void saveCurrency(CurrencyDTO dto) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CurrencyDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();
		
	}
	

}
