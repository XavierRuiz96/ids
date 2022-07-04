package com.examen.ids.model;

import javax.persistence.*;

@Entity
@Table(name="airports")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_airport")
    private Integer idAirport;
    @Column(name="name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_country")
    private Country country;

    public Integer getIdAirport() {
        return idAirport;
    }

    public void setIdAirport(Integer idAirport) {
        this.idAirport = idAirport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

