package init.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void check(){
		sessionFactory.getCurrentSession().createQuery("from Book").list();
	}
}
