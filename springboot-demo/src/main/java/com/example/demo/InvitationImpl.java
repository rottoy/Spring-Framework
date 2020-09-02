package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

@Repository
public class InvitationImpl implements InvitationDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public Invitation getInvitations(String id) {
        int int_id=Integer.parseInt(id);
        Session session = entityManager.unwrap(Session.class);

        Query<Invitation> theQuery =session.createQuery("from Invitation i where i.userId=:int_id ",Invitation.class);
        theQuery.setParameter("int_id",int_id);


        return theQuery.getSingleResult();
    }

    //제안을 수락하고, 알림을 꺼야 하므로 processed=false
    @Override
    public void approveRequest(Invitation invitation) {
        invitation.setApproved(true);
        invitation.setProcessed(false);
    }

    @Override
    public void rejectRequest(Invitation invitation) {
        invitation.setProcessed(false);
    }

}
