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
public class EscolaMongoApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private SkillRepository skillRepository;

	public static void main(String[] args) {
		SpringApplication.run(EscolaMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Address endereco = Address.builder()
				.rua("AV Caramuru 2450, Torre 1 Apt 28")
				.cidade("Ribeirão Preto")
				.estado("São Paulo")
				.lat(new BigDecimal("24.58482"))
				.log(new BigDecimal("26.58488"))
				.build();

		Course curso = Course.builder()
				.name("Analise e Desenvolvimento de sistema")
				.modality(EAD)
				.build();

		 Set<Skill> skills = Set.of(
				Skill.builder()
						.skillName("Nada de bom")
						.level(BASIC)
						.build());

		 List<BigDecimal> notas =  List.of(new BigDecimal(4.2),
				 new BigDecimal(2.0),
				 new BigDecimal(6.2),
				 new BigDecimal(10.00));

		Student aluno = Student.builder()
				.fullName("Pablo")
				.address(endereco)
				.skills(skills)
				.course(curso)
				.grades(notas)
				.build();


		addressRepository.insert(endereco);
		cursoRepository.insert(curso);
		skillRepository.insert(skills);
		studentRepository.insert(aluno);

	}
}
