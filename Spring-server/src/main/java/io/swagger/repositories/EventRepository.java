package io.swagger.repositories;

import io.swagger.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Integer> {
    List<Event> findByUserId(Integer userId);
}