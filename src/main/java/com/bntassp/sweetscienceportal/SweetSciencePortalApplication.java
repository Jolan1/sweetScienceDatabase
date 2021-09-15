package com.bntassp.sweetscienceportal;

import com.bntassp.sweetscienceportal.training.TrainingPlan;
import com.bntassp.sweetscienceportal.training.TrainingPlanRepository;
import com.bntassp.sweetscienceportal.users.Users;
import com.bntassp.sweetscienceportal.users.UsersRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class SweetSciencePortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetSciencePortalApplication.class, args);
    }
}























//    @Bean
//    CommandLineRunner commandLineRunner(UsersRepository usersRepository,
//                                        TrainingPlanRepository trainingPlanRepository) {
//        return args -> {
//            Faker faker = new Faker();
//            for (int i = 0; i <= 20; i++) {
//                String firstName = faker.name().firstName();
//                String lastName = faker.name().lastName();
//                String email = String.format("%s.%s@gmail.com", firstName, lastName);
//                Users users = new Users(
//                        firstName,
//                        lastName,
//                        email,
//                        faker.number().numberBetween(18, 55));
//                usersRepository.save(users);
//
//                TrainingPlan courtney101 = new TrainingPlan(
//                        "SC101",
//                        "Slugger",
//                        "Shannon Courtney",
//                        "Fire",
//                        "Weight Training"
//                );
//                TrainingPlan fraizer101 = new TrainingPlan(
//                        "JF101",
//                        "Swarmer",
//                        "Joe Fraizer",
//                        "Water",
//                        "Circuit"
//                );
//                TrainingPlan tyson101 = new TrainingPlan(
//                        "MT101",
//                        "Boxer Puncher",
//                        "Mike Tyson",
//                        "Earth",
//                        "Fartlek"
//                );
//                TrainingPlan ali101 = new TrainingPlan(
//                        "RA101",
//                        "Out-Boxer",
//                        "Ramla Ali",
//                        "Air",
//                        "Plyometric"
//                );
//
//                trainingPlanRepository.saveAll(List.of(
//                        courtney101,
//                        fraizer101,
//                        tyson101,
//                        ali101));
//            }
//        };
//    }
//}
