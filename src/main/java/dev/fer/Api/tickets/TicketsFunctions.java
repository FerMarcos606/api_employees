package dev.fer.Api.tickets;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketsFunctions  {

    private final TicketsRepository repository;

    public TicketsFunctions(TicketsRepository repository) {
        this.repository = repository;
    }

    // Métodos específicos de Tickets

    public List<TicketsEntity> findAllByOrderByTicketLocalDateTimeAsc() {
        return repository.findAllByOrderByTicketLocalDateTimeAsc();
     }
      public List<TicketsEntity> findByPendingRequest(boolean pending) {
      return repository.findByPendingRequest(pending);
     }
}

