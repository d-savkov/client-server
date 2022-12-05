package com.example.bsuir.utils;

import com.example.bsuir.models.entities.Appointment;
import com.example.bsuir.models.entities.Client;
import com.example.bsuir.models.entities.Employee;
import com.example.bsuir.models.entities.EmployeeService;
import com.example.bsuir.models.entities.Service;
import com.example.bsuir.models.entities.User;
import lombok.NoArgsConstructor;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@NoArgsConstructor
public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                configuration.setProperty("hibernate.connection.username", System.getenv("DATABASE_USER"));
                configuration.setProperty("hibernate.connection.password", System.getenv("DATABASE_PASSWORD"));
                configuration.setProperty("hibernate.connection.url", System.getenv("DATABASE_URL"));

                configuration.addAnnotatedClass(Appointment.class);
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(EmployeeService.class);
                configuration.addAnnotatedClass(Service.class);
                configuration.addAnnotatedClass(User.class);
                sessionFactory = configuration.buildSessionFactory();
            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
