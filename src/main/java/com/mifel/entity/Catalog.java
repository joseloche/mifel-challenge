package com.mifel.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "catalog")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Catalog implements Serializable{

	private static final long serialVersionUID = 8363474770618856013L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
    @Column(name = "name")
    @NonNull private String name;

    @Column(name = "f_name")
    private String firstName;

    @Column(name = "l_name")
    private String lastName;
    
}
