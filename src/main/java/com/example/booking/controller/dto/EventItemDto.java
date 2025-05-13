package com.example.booking.controller.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record EventItemDto(UUID eventId, String eventName, String eventDate, int eventHour, int eventMinute, double eventPrice) {
}
