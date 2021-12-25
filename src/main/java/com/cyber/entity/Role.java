package com.cyber.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role extends BaseEntity{

    private String description;

    //one user can be assigned to many roles
    @OneToMany(mappedBy = "role",fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<>();

    //no need for cascading -
    //bcs, in UI, before user is created, roles should already be set in the dropdown!!
}
