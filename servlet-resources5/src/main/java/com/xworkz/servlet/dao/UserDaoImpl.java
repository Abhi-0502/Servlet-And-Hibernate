package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.utill.EntityManagerFactoryUtill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public boolean addUserDetails(UserDto userDto) {
        System.out.println("Running user dao");
        EntityManager entityManager =EntityManagerFactoryUtill.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public UserDto getUserbyId(int id) {

        System.out.println("Dao is Running");
        EntityManager entityManager =EntityManagerFactoryUtill.getEntityManagerFactory().createEntityManager();
        UserDto dto = entityManager.find(UserDto.class,id);
        System.out.println(dto);
        return dto;
    }

    @Override
    public UserDto getUserByuserName(String userName) {

        EntityManager entityManager = EntityManagerFactoryUtill.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from UserDto user where user.userName =:un");
        // query add ( fn,un,fname,firstName any ref can use)
        query.setParameter("un",userName);
        UserDto Dto = (UserDto) query.getSingleResult();
        entityManager.close();
        return Dto;
    }

    @Override
    public List<UserDto> getAllUser() {
        EntityManager entityManager = EntityManagerFactoryUtill.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from  UserDto user ");
        List<UserDto> userDtos = query.getResultList();
        return userDtos;
    }
}
