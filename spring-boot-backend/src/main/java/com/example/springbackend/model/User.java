package com.example.springbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "`user`")
@Data
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "locale")
    String locale;
    @Column(name = "email")
    String email;
    @Column(name = "preferred_username")
    String preferredUsername;
    @Column(name = "given_name")
    String givenName;
    @Column(name = "family_name")
    String familyName;
    @Column(name = "zone_info")
    String zoneInfo;
    @Column(name = "email_verified")
    Boolean emailVerified;

    @ManyToMany
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
    }

}