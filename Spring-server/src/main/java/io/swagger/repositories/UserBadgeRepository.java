package io.swagger.repositories;

import io.swagger.model.UserBadge;
import org.springframework.data.repository.CrudRepository;

public interface UserBadgeRepository extends CrudRepository<UserBadge, Integer> {
}
