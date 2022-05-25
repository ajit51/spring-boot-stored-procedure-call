package com.springboot.storedprocedurecall.api.dao;

import com.springboot.storedprocedurecall.api.model.Ticket;
import com.springboot.storedprocedurecall.api.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TicketDao {
    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private EntityManager em;

    public List<Ticket> getTicketInfo() {
        return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
    }

    public List<Ticket> getTicketInfoByCategory(String input) {
        return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("tcategory", input).getResultList();
    }


    public Ticket createTicket(Ticket ticket) {
        return ticketRepo.save(ticket);
    }
}
