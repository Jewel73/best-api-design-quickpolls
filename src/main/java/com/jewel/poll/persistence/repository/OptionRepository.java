package com.jewel.poll.persistence.repository;

import com.jewel.poll.persistence.entity.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends CrudRepository<Option, Long> {
}
