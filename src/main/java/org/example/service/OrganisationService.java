package org.example.service;

import org.example.entity.Organisation;
import static org.example.service.VolunteerService.*;

public class OrganisationService {
    public static Organisation organisation = Organisation.builder()
            .name("Formula-1")
            .volunteers(volunteers)
            .build();
}
