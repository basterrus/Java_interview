package ru.baster.hibernate;

import org.flywaydb.core.Flyway;

public class StudentBaseApplication {

    public static void main(String[] args) {

        Flyway database = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/interview_hibernate_demo", "root", "1234")
                .load();
        database.migrate();


        new Tests().start();
        System.out.println("---------- Тест завершен ----------");
    }
}
