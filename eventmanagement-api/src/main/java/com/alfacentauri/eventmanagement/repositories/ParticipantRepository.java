package com.alfacentauri.eventmanagement.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.alfacentauri.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
