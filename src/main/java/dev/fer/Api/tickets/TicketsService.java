package dev.fer.Api.tickets;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.fer.Api.dtos.TicketsDTORequest;
import dev.fer.Api.dtos.TicketsDTOResponse;
import dev.fer.Api.mapper.TicketsMapper;

@Service
public class TicketsService {

    private final TicketsRepository repository;

    public TicketsService(TicketsRepository repository) {
        this.repository = repository;
    }

    public List<TicketsEntity> getTickets() {
        return repository.findAll(); 
    }
    public TicketsEntity saveTickets(TicketsEntity ticket) {
    return repository.save(ticket); // repository ya sabe guardar
    }
    // Nuevo método para crear un ticket
    public TicketsEntity createTicket(TicketsEntity ticket) {
        return repository.save(ticket);
    }
    public TicketsEntity getTicketById(Long id) {
    return repository.findById(id).orElse(null);
    }

     // Actualizar ticket
    public TicketsDTOResponse updateTicket(Long id, TicketsDTORequest dtoRequest) {
        TicketsEntity entity = TicketsMapper.toEntity(dtoRequest);
        entity.setId(id); // solo seteamos el id
        TicketsEntity updated = repository.save(entity);
        return TicketsMapper.toDTO(updated);
    }




}
