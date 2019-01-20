package io.swagger.repositories;

import io.swagger.model.UserScore;
import org.springframework.data.repository.CrudRepository;

public interface UserScoreRepository extends CrudRepository<UserScore, Integer> {
}
