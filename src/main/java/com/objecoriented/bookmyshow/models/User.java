package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseModel {
    String name;
}
