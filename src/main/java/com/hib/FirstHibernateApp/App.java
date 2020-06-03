package com.hib.FirstHibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args ){
    	
    	AlienName name = new AlienName();
    	name.setFname("ReddyBum");
    	name.setSname("Tobbi");
    	name.setLname("Krasovith");
    	
        Alien alien = new Alien();
        alien.setId(111);
        alien.setName(name);
        alien.setColor("Green");
       
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        
        SessionFactory session_factory = con.buildSessionFactory(registry);
        
        Session session = session_factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.save(alien);
        
        transaction.commit();
    }
}
