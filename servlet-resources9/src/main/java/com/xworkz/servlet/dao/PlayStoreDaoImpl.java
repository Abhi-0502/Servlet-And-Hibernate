package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.PlayStoreDto;
import com.xworkz.servlet.servletrunner.playstoreDetails;
import com.xworkz.servlet.utill.EntityManagerFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class PlayStoreDaoImpl implements PlayStoreDao {

    PlayStoreDto playStoreDto= new PlayStoreDto();
    @Override
    public boolean addPlayStore(PlayStoreDto playStoreDto) {
        System.out.println("Dao is Running");
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(PlayStoreDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(playStoreDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }

    @Override
    public PlayStoreDto getProductById(int id) {

        System.out.println("Dao is Running");
        EntityManagerFactory entityManagerFactory =EntityManagerFactoryUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        PlayStoreDto playStoreDto = entityManager.find(PlayStoreDto.class,id);
        entityManager.getTransaction().commit();
        return playStoreDto;
    }

    @Override
    public PlayStoreDto getUserByUserName(String userName) {
        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from PlayStoreDto user where user.userName =:un");
        // query add ( fn,un,fname,firstName any ref can use)
                query.setParameter("un",userName);
                PlayStoreDto playStoreDto = (PlayStoreDto) query.getSingleResult();
                entityManager.close();
                return playStoreDto;
    }

    @Override
    public List<PlayStoreDto> getAllUser() {
        EntityManager entityManager = EntityManagerFactoryUtil.entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select user from  PlayStoreDto user ");
        List<PlayStoreDto> playStoreDtos = query.getResultList();
        return playStoreDtos;
    }


}
