package com.testdb.bean;

import com.devcolibri.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class UserBean {

    @PersistenceContext(unitName = "org.hibernate.ejb.HibernatePersistence")
    private EntityManager em;

    // Добавляем документ В базу данных
    public Message add(Message mes){
        return em.merge(mes);
    }

    // Получаем док по id
    public Message get(long id){
        return em.find(Message.class, id);
    }

    // обновляем документ
    // если id которого мыпытаемся обновить нет,
    // то запишется он как новый
    public void update(Message mes){
        add(mes);
    }

    // удаляем сообщение по id
    public void delete(long id){
        em.remove(get(id));
    }

    // Получаем все доки с БД
    public List<mes> getAll(){
        TypedQuery<mes> namedQuery = em.createNamedQuery("mes.getAll", mes.class);
        return namedQuery.getResultList();
    }

}