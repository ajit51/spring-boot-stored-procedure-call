package com.springboot.storedprocedurecall.api.controller;

import com.springboot.storedprocedurecall.api.dao.TicketDao;
import com.springboot.storedprocedurecall.api.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketDao ticketDao;

    @PostMapping("/createTicket")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
        return new ResponseEntity<Ticket>(ticketDao.createTicket(ticket), HttpStatus.CREATED);
    }

    @GetMapping("/getTicket")
    public ResponseEntity<List<Ticket>> getTicket() {
        return new ResponseEntity<>(ticketDao.getTicketInfo(), HttpStatus.OK);
    }

    @GetMapping("/findTicketByCategory/{category}")
    public ResponseEntity<List<Ticket>> findTicketByCategory(@PathVariable String category) {
        return new ResponseEntity<>(ticketDao.getTicketInfoByCategory(category), HttpStatus.OK);
    }
}
