package dev.fer.Api.mapper;

import dev.fer.Api.dtos.TicketsDTORequest;
import dev.fer.Api.dtos.TicketsDTOResponse;
import dev.fer.Api.tickets.TicketsEntity;
import java.time.LocalDateTime;

public class TicketsMapper {


    public static TicketsEntity toEntity(TicketsDTORequest dto) {
      
        TicketsEntity entity = new TicketsEntity();
        entity.setEmployeesName(dto.employeesName());
        entity.setDescription(dto.description());
        entity.setTicketLocalDateTime(LocalDateTime.now()); 
        entity.setPendingRequest(true); 
        return entity;
    }

    // Convertir Entity a DTOResponse
    public static TicketsDTOResponse toDTO(TicketsEntity entity) {
       
        return new TicketsDTOResponse(
            entity.getId(),
            entity.getEmployeesName(),
            entity.getTicketLocalDateTime(),
            entity.getDescription(),
            entity.getTechnicianNameEmployee(),
            entity.isPendingRequest(),
            entity.getDateRequestFullfilled(),
            entity.getEditionRequest()
        );
    }
}