package dev.fer.Api.dtos;

import java.time.LocalDateTime;

public record TicketsDTOResponse(
        Long id,
        String employeesName,
        LocalDateTime ticketLocalDateTime,
        String description,
        String technicianNameEmployee, 
        boolean pendingRequest,
        LocalDateTime dateRequestFullfilled,
        LocalDateTime editionRequest
) {}

