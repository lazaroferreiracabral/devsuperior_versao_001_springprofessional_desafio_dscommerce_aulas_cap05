package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CategoryDTO {

    private Long id;

    private String nome;

    public CategoryDTO(Category entity) {
        id = entity.getId();
        nome = entity.getName();
    }
}
