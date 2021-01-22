package com.java.dao;

import java.util.List;




import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.Project;
import com.java.entity.User;

@Repository
public class mvcDao {
	@Autowired
	SessionFactory sessionfactory;

	public boolean checklogin(User user) {
		System.out.println("11");
		String studentname=user.getStudentname();
		System.out.println("555");
		String password=user.getPassword();
		Session session=sessionfactory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		criteria.add(Restrictions.eq("studentname",studentname));
		System.out.println("999");
		criteria.add(Restrictions.eq("password",password));
		List<User> listuser=criteria.list();
		if(!listuser.isEmpty())
		{
			System.out.println("0000");
			return true;
		}
		else
		{
			System.out.println("444");
			return false;
		}
	}

	public List<User> getuser() {
	Session session=sessionfactory.openSession();
	Criteria criteria=session.createCriteria(User.class);
	List<User>listuser=criteria.list();
		return listuser;
	}

	public boolean deleteuser(int userid) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transcation=session.beginTransaction();
		User user=session.get(User.class, userid);
		session.delete(user);
		//session.delete("id",userid);
		transcation.commit();
		
		return true;
	}

	public List<User> getuser(int userid) {
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		Criteria criteria=session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", userid));
		
		List<User>listuser=criteria.list();
	
		
		
		return listuser;
	}

	public boolean updateuser(User user) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		
		session.saveOrUpdate(user);
		System.out.println("888up");
		transaction.commit();
		
		return true;
	}

	public boolean adduser(User user) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		
		session.save(user);
		transaction.commit();
		
		return true;
	}

	public List<Project> getpro() {
		Session session=sessionfactory.openSession();
		Criteria criteria=session.createCriteria(Project.class);
		System.out.println("44444");
		List<Project>listp=criteria.list();
			return listp;
	}

	public boolean deletepro(int proid) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transcation=session.beginTransaction();
		Project pro=session.get(Project.class, proid);
		session.delete(pro);
		//session.delete("id",userid);
		transcation.commit();
		
		return true;
	}

	public List<Project> getpro(int proid) {
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Project.class);
		criteria.add(Restrictions.eq("id", proid));
		
		List<Project>listpro=criteria.list();
	
		
		
		return listpro;
	}

	public boolean updatepro(Project pro) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		
		session.saveOrUpdate(pro);
		System.out.println("888up");
		transaction.commit();
		
		return true;
	}

	public boolean addpro(Project pro) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		
		session.save(pro);
		transaction.commit();
		
		return true;
	}

	

}
