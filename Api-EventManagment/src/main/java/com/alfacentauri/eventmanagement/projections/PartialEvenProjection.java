package com.alfacentauri.eventmanagement.projections;

import java.time.Instant;
import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.alfacentauri.eventmanagement.entities.Event;


/*
 * Projeccion como filtrar el resultado de una clase a solo unos cuantos como en mySQL
 */
@Projection(name = "partial", types = {Event.class})
public interface PartialEvenProjection {
	
	String getName();
	ZonedDateTime getStartTime();
	ZonedDateTime getEndTime();
	
	Instant getCreated();
}
