package com.ferraz.dockerstudy.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_users_seq")
    @SequenceGenerator(name = "tb_users_seq", sequenceName = "tb_users_seq", allocationSize = 1)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

}
