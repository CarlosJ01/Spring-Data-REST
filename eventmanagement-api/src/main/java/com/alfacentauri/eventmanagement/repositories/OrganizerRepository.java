package com.alfacentauri.eventmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alfacentauri.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {

}
