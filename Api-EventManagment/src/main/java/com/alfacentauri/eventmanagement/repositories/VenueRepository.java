package com.alfacentauri.eventmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alfacentauri.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
