package com.alfacentauri.eventmanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfacentauri.eventmanagement.controllers.exceptions.AlreadyCheckInException;
import com.alfacentauri.eventmanagement.entities.Participant;
import com.alfacentauri.eventmanagement.repositories.ParticipantRepository;

@RepositoryRestController
public class CheckInController {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@PostMapping("/events/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler) {
		
		Optional<Participant> optional = participantRepository.findById(id);
		if (! optional.isPresent()) {
			throw new ResourceNotFoundException();	
		}
		
		Participant participant = optional.get();
		if (participant.getCheckedIn()) {
			throw new AlreadyCheckInException();
		}
		
		participant.setCheckedIn(true);
		participantRepository.save(participant);
		
		return ResponseEntity.ok(assembler.toFullResource(participant));
	}
	
}
