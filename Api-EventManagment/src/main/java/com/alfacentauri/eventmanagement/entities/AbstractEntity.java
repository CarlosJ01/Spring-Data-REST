package com.alfacentauri.eventmanagement.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass // Clases padres en relaiciones
public class AbstractEntity {
	
	@Id
	@Column(nullable = false, updatable = false) // Propiedades de la columna
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@CreationTimestamp // Auto timestamp
	@Column(updatable = false)
	@JsonIgnore // Para que no sea parte del json 
	protected Instant created;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

}
