package com.example.demo;


import com.example.demo.entity.Address;
import com.example.demo.entity.Course;
import com.example.demo.entity.Enum.Level;
import com.example.demo.entity.Enum.Modality;
import com.example.demo.entity.Skill;
import com.example.demo.entity.Student;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.CursoRepository;
import com.example.demo.repository.SkillRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import static com.example.demo.entity.Enum.Level.BASIC;
import static com.example.demo.entity.Enum.Modality.EAD;


@SpringBootApplication(exclude = {
		MongoAutoConfiguration.class,
		MongoDataAutoConfiguration.class
})
public class EscolaMongoApplication{

}