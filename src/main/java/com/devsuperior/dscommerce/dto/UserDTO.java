package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDTO {

    @Getter
    private Long id;

    @Getter
    private String name;

    @Getter
    private String email;

    @Getter
    private String phone;

    @Getter
    private LocalDate birthDate;

    private List<String> roles = new ArrayList<>();

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getUsername();
        email = entity.getEmail();
        phone = entity.getPhone();
        birthDate = entity.getBirthDate();

        for (GrantedAuthority role : entity.getRoles()) {
            roles.add(role.getAuthority());
        }
    }

    public List<String> getRoles() {
        return Collections.unmodifiableList(roles);
    }
}
