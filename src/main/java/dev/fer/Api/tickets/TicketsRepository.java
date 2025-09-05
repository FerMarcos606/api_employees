package dev.fer.Api.tickets;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<TicketsEntity, Long> {

    // métodos no contenidos en JPA
    List<TicketsEntity> findAllByOrderByTicketLocalDateTimeAsc();

    List<TicketsEntity> findByPendingRequest(boolean pending);

}
