package io.swagger.repositories;

import io.swagger.model.Application;
import io.swagger.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Integer> {
    List<Event> findByUserIdAndApplication(Integer userId, Application application);
    List<Event> findByApplication(Application application);
}