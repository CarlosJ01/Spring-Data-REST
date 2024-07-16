package com.alfacentauri.eventmanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfacentauri.eventmanagement.entities.Event;
import com.alfacentauri.eventmanagement.repositories.EventRepository;


@RepositoryRestController // Controlador para este repositorio
//@RequestMapping("/")
public class EventKickOfController {
	
	@Autowired
	EventRepository eventRepository;
	
	@PostMapping("/events/start/{id}")
	public ResponseEntity start(@PathVariable("id") Long id) {
		Optional<Event> optional = eventRepository.findById(id);
		if (! optional.isPresent()) {
			throw new ResourceNotFoundException(); // Excepcion de no encontrado
		}
		
		Event event = optional.get();
		event.setStarted(true);
		eventRepository.save(event);
		
		return ResponseEntity.ok(event.getName() + " has started");
	}
	
}
