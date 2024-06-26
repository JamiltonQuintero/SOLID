package com.jamiltonquintero.solid.L.casoDos.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    Long id;
    String name;
    byte age;
    byte timeWithCompany;
}
