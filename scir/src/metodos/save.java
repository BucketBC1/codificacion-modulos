package metodos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import user.Department;


public class save {

	public static void main(String[] args) {
		
		
		//session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Department depart = new Department(2, "Nueva");
			
			session.save(depart);
			
			System.out.println("Exitooooo");
			
			session.getTransaction().commit();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally {
			session.close();
			factory.close();
		}
				

	}

}
