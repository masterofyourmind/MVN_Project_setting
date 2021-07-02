package com.shobhit.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shobhit.springmvc.model.Alien;

@Component
public class AlienDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Alien> getAliens()
	{
		Session session = sessionFactory.getCurrentSession();
		List<Alien> aliens = session.createQuery("from Alien", Alien.class).list();
		System.out.println(aliens);
		return aliens;
	}
	
	@Transactional
	public void addAliens(Alien a) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(a);
	}
	
	@Transactional
	public Alien getAliens(int aid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Alien a = session.get(Alien.class, aid);
		return a;
	}
}
