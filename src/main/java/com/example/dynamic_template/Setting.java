package com.example.dynamic_template;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Setting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String templateName;

}
