package com.crunchify.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.crunchify.model.User;

public class UserDAOImpl implements UserDAO{
	
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public boolean login(String username, String password) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select * from mysite.user where username='"+username+"' and password='" +password+"'");
		ArrayList<User> users = new ArrayList<>();
		users = (ArrayList<User>)query.list();
		if(users.size()>0){
			return true;
		}
		return false;
	}
	
	@Transactional
	@Override
	public ArrayList<User> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User");
		return (ArrayList<User>) query.list();
	}

}
