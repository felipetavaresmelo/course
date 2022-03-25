package com.educandoweb.course.entities;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @EqualsAndHashCode.Include private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
