package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.utill.EntityManagerUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl implements UserDao{

   UserDto userDto = new UserDto();
    @Override
    public boolean addUserDetails(UserDto userDto) {
//        System.out.println("Dao is Running");
//        Configuration configuration = new Configuration();
//        configuration.configure();
//        configuration.addAnnotatedClass(UserDto.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(userDto);
//        session.getTransaction().commit();
//        session.close();
//        sessionFactory.close();
//        return true;
        EntityManager entityManager = EntityManagerUtill.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public UserDto getUserbyId(int id) {
        System.out.println("Dao is Running");
        EntityManagerFactory entityManagerFactory = EntityManagerUtill.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        UserDto userDto = entityManager.find(UserDto.class,id);
        entityManager.getTransaction().commit();
        return userDto;

    }

    @Override
    public UserDto getUserByUserName(String userName) {
        EntityManager entityManager = EntityManagerUtill.getEntityManagerFactory().createEntityManager();
     Query query = entityManager.createQuery("select userDto from UserDto userDto where userDto.userName =:un");//hql-hibernate query language")
       query.setParameter("un",userName);
        UserDto userDto = (UserDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public List<UserDto> getAllUser() {
        EntityManager entityManager = EntityManagerUtill.entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select user from UserDto user ");
        List<UserDto> userDtos = query.getResultList();
        return userDtos;
    }

}
