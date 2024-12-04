package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.PlayStoreDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
}
