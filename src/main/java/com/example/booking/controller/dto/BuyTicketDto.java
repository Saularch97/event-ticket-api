package com.example.booking.controller.dto;

import java.util.List;
import java.util.UUID;

public record BuyTicketDto(List<UUID> ticketIds) {
}
