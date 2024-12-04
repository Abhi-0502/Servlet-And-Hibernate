package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.RegisterDto;
import com.xworkz.servlet.utill.EntityManagerUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class RegisterDaoImpl implements RegisterDao{

    RegisterDto registerDto = new RegisterDto();
    @Override
    public boolean addRegisterDetails(RegisterDto registerDto) {
        /*System.out.println("Dao is Running");
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(RegisterDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(registerDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/

        EntityManager entityManager = EntityManagerUtill.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(registerDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public RegisterDto getRegisterById(int id) {
         //database logic
        EntityManagerFactory entityManagerFactory = EntityManagerUtill.getEntityManagerFactory();

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        RegisterDto registerDto = entityManager.find(RegisterDto.class,id);
        entityManager.getTransaction().commit();
        return registerDto;
    }

    @Override
    public RegisterDto getRegisterUserName(String userName) {
        EntityManager entityManager = EntityManagerUtill.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from RegisterDto user where user.userName = :un");
        query.setParameter("un",userName);
        RegisterDto registerDto = (RegisterDto) query.getSingleResult();
        entityManager.close();
        return registerDto;
    }

    @Override
    public List<RegisterDto> getAllUser() {
        EntityManager entityManager = EntityManagerUtill.entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select user from RegisterDto user");
        List<RegisterDto> registerDtos = query.getResultList();
        return registerDtos;
    }
}
