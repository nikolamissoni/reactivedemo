package com.nikola.react.reactivedemo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@EqualsAndHashCode
public class Album {

    @Id
    private String name;

    private int releaseYear;

    private Genre genre;
}
