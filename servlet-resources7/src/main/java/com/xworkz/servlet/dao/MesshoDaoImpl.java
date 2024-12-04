package com.xworkz.servlet.dao;

import com.xworkz.servlet.Utill.EntityManagerFactoryUtill;
import com.xworkz.servlet.dto.MesshoDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Collections;
import java.util.List;

public class MesshoDaoImpl implements MeshoDao{

     MesshoDto messhoDto = new MesshoDto();
    @Override
    public boolean addDetails(MesshoDto messhoDto) {

//        System.out.println("Dao is Running");
//        Configuration configuration = new Configuration();
//        configuration.configure();
//        configuration.addAnnotatedClass(MesshoDto.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(messhoDto);
//        session.getTransaction().commit();
//        session.close();
//        sessionFactory.close();
//        return true;

        EntityManager entityManager = EntityManagerFactoryUtill.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(messhoDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;

    }

    @Override
    public MesshoDto getUserById(int id) {
        System.out.println("Dao is Running");
        EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        MesshoDto messhoDto = entityManager.find(MesshoDto.class,id);
        entityManager.getTransaction().commit();
        return messhoDto;
    }

    @Override
    public MesshoDto getUserByUserName(String userName) {
        EntityManager entityManager = EntityManagerFactoryUtill.getEntityManagerFactory().createEntityManager();
     Query query= entityManager.createQuery("select messhoDto from MesshoDto messhoDto where messhoDto.userName = :un");
        query.setParameter("un",userName);
        MesshoDto messhoDto = (MesshoDto) query.getSingleResult();
        entityManager.close();
        return messhoDto;
    }

    @Override
    public List<MesshoDto> getAllMesshoDetails() {
        System.out.println("Get All Details Add Started");
        EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<MesshoDto> criteriaQuery = criteriaBuilder.createQuery(MesshoDto.class);
        criteriaQuery.select(criteriaQuery.from(MesshoDto.class));
        List<MesshoDto> ListOfMessho = entityManager.createQuery(criteriaQuery).getResultList();
        System.out.println("ended");
        return ListOfMessho;

    }
}

