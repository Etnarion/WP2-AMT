package io.swagger.repositories;

import io.swagger.model.Application;
import io.swagger.model.Rule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RuleRepository extends CrudRepository<Rule, Integer> {
    List<Rule> findByApplication(Application application);
}