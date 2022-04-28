package com.edu;




	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.Set;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.mapping.Array;
	import org.hibernate.service.ServiceRegistry;
	import org.hibernate.service.ServiceRegistryBuilder;

	public class MainApp {

		public static void main(String[] args) {
					 
			Configuration con= new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Publisher.class);
			 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			 SessionFactory factory= con.buildSessionFactory(reg);
			 Session session= factory.openSession();
			 Transaction t= session.beginTransaction();
			 
			 Book book1=new Book(7,"Dot Net" ,"Yeshwant",500);
			 Book book2=new Book(8,"Networking " ,"rahul",700);
			 Book book3=new Book(9,"webdevelopment" ," johnson",800);
	   Set<Book>booklist=new HashSet<Book>(Arrays.asList(book1,book2,book3));
		Publisher pub=new Publisher();
		pub.setPublisherId(3);
		pub.setPublisherName("PHI pubb");
		pub.setBooklist(booklist);
		session.save(pub);
		t.commit();
		session.close();
		}

	
}
