package com.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");



        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();

        Staff staff = context.getBean(Doctor.class);
        staff.assist();

        // Doctor stafff = context.getBean(Doctor.class);
        // System.out.println(stafff.getQualification());
    }
}