package io.swagger.repositories;

import io.swagger.model.Application;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {
    List<Application> findByToken(String token);
}
