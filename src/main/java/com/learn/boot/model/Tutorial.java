package com.learn.boot.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tutorials")
@Getter
@Setter
@NoArgsConstructor
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "tutor")
    private String tutor;

    @Column(name = "published")
    private boolean published;


    public Tutorial(String title, String description, String tutor, boolean published) {
        this.title = title;
        this.description = description;
        this.tutor = tutor;
        this.published = published;
    }

}