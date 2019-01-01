package io.swagger.repositories;

import io.swagger.model.Badge;
import org.springframework.data.repository.CrudRepository;

public interface BadgeRepository extends CrudRepository<Badge, Integer> {
}