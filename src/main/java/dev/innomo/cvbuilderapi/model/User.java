package dev.innomo.cvbuilderapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    @JsonIgnore
    private String password;
    private String phone;
    private String address;
    private String summary;
    private String title;
    @OneToMany
    private List<Experience> experiences;
    @OneToMany
    private List<Education> education;
    @OneToMany
    private List<String> skills;
    @OneToMany
    private List<Reference> references;
    @OneToMany
    private List<Project> projects;
    @OneToMany
    private List<Award> awards;
    @OneToMany
    private List<Certificate> certificates;

}
