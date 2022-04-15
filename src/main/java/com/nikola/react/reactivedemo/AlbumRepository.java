package com.nikola.react.reactivedemo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends ReactiveCrudRepository<Album, String> {
}
