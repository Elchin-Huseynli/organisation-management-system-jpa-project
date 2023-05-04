package org.example.service;

import org.example.entity.Volunteer;

import java.util.List;

public class VolunteerService {
    public static List<Volunteer> volunteers = List.of(
            Volunteer.builder()
            .name("Shehla")
            .surname("Abdullayeva")
            .build()
    );
}
