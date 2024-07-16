package com.alfacentauri.eventmanagement.repositories;

import java.time.ZoneId;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.alfacentauri.eventmanagement.entities.Event;
import com.alfacentauri.eventmanagement.projections.PartialEvenProjection;

/*
 * PagingAndSortingRepository
 * 	Activa la paginacion y ordena el repositorio ademas de ser tambien CRUD
 */

@RepositoryRestResource(excerptProjection = PartialEvenProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

//	List<Event> findByName(@Param("name") String name); // Custom filter => ../events/search/findByName?name=string
	
//	Page<Event> findByNamePage(@Param("name") String name, Pageable pageable); // Agregar paginacion
	
//	Page<Event> findByNameAndZoneId(@Param("name") String name, @Param("zoneId") ZoneId zoneId, Pageable pageable); // 2 Filtros
}
