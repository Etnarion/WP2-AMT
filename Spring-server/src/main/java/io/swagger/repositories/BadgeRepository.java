package io.swagger.repositories;

import io.swagger.model.Application;
import io.swagger.model.Badge;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BadgeRepository extends CrudRepository<Badge, Integer> {
    List<Badge> findByApplication(Application application);
}