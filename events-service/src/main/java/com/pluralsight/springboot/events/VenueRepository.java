package com.pluralsight.springboot.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface VenueRepository extends JpaRepository<Venue, Integer> {
    public Optional<Venue> findById(int id);
}
