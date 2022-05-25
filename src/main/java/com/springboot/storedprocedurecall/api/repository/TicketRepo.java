package com.springboot.storedprocedurecall.api.repository;

import com.springboot.storedprocedurecall.api.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
}
