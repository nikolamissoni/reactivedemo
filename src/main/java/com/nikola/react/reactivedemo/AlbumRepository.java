package com.nikola.react.reactivedemo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AlbumRepository extends ReactiveCrudRepository<Album, String> {
}
