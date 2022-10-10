package com.example.demo.entity;

import com.example.demo.entity.Enum.Level;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Skill")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Skill {

    @Id
    @JsonIgnore
    private String id;
    private String skillName;
    private Level level;
}
