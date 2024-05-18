package com.jamiltonquintero.solid.L.casoDos.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    Long id;
    String name;
    byte age;
    String favoriteProduct;

}
