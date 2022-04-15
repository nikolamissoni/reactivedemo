package com.nikola.react.reactivedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController()
@RequestMapping("albums")
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping(produces = "application/json")
    public Flux<Album> getAll() {
        return albumRepository.findAll();
    }

    @GetMapping(value = "/{name}", produces = "application/json")
    public Mono<Album> getByName(@PathVariable("name") String name) {
        return albumRepository.findById(name);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<String> save(@RequestBody Album album) {
        return albumRepository.save(album).map(Album::getName);
    }

    @PutMapping(value = "/{name}", produces = "application/json")
    public Mono<Album> update(@PathVariable("name") String name, @RequestBody Album album) {
//        albumRepository.save(album);
        return (albumRepository.save(album));
    }

    @DeleteMapping(value = "/{name}")
    public Mono<Void> delete(@PathVariable("name") String name) {
        return albumRepository.deleteById(name);
    }
}
