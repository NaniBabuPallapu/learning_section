package com.insurance.statefarm_insurance.entity;

import com.insurance.statefarm_insurance.enums.RoleName;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name", nullable = false, unique = true)
    private RoleName roleName;

    public Role() {
    }

    public Role(Long id, RoleName roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName=" + roleName +
                '}';
    }
}
