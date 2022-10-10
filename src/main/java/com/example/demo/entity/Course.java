package com.example.demo.entity;

import com.example.demo.entity.Enum.Modality;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Course")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Course {

    @Id
    @JsonIgnore
    private String id;
    private String name;
    private Modality modality;
}
