package com.mycode.demo.testdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycode.demo.testdemo.entity.ToDoItem;
import com.mycode.demo.testdemo.entity.User;

@Repository
public class ToDoDaoImpl implements ToDoDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<ToDoItem> findByUser(User user) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<ToDoItem> theQuery = currentSession.createQuery("from ToDoItem t where t.user=:uID", ToDoItem.class);
		theQuery.setParameter("uID", user);
		List<ToDoItem> toDoItemList = null;
		
		try {
			
			toDoItemList = theQuery.getResultList();
			
		} catch (Exception e) {
			toDoItemList = null;
		}

		return toDoItemList;
	}

	@Override
	public void save(ToDoItem toDoItem) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(toDoItem);

	}

}
