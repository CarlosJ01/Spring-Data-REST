package com.alfacentauri.eventmanagement.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.alfacentauri.eventmanagement.entities.Venue;

@Projection(name = "virtual", types = {Venue.class})
public interface StreetAdrressProjection {
	
	@Value("#{target.streetAddress} #{target.streetAddress2}")
	String getCompleteStreetAddress();
}
