package com.givan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.givan.spring.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
