package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Setter
@Getter
public class User extends BaseModel {
    String name;
    String email;
}
