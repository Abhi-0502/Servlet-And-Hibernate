package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.UserDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class UserDaoImpl implements UserDao {

    @Override
    public boolean addUserLogin(UserDto userDto) {
        System.out.println("dao is running ");
//        Configuration configuration = new Configuration().configure("META-INF/hibernate.cfg.xml");
//        StandardServiceRegistry build = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(UserDto.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        System.out.println("Session is running ");
        System.out.println(session.save(userDto));
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }
}
