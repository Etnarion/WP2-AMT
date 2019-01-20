package io.swagger.repositories;

import io.swagger.model.Application;
import io.swagger.model.PointScale;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PointScaleRepository extends CrudRepository<PointScale, Integer> {
    List<PointScale> findByApplication(Application application);
}