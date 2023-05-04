package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.repository.OrganisationRepository;
import org.example.service.OrganisationService;
import org.example.service.VolunteerService;

public class OrganisationRepositoryImpl implements OrganisationRepository {
    public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
    public static EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void persist() {
        entityManager.persist(OrganisationService.organisation);
    }

    @Override
    public void find() {
        System.out.println(entityManager.find(OrganisationService.organisation.getClass(), 1));
    }

    @Override
    public void merge() {
        entityManager.merge(OrganisationService.organisation);
    }

    @Override
    public void remove() {
        entityManager.remove(OrganisationService.organisation);
    }
}
