package org.example;

import jakarta.persistence.EntityTransaction;
import org.example.repository.impl.OrganisationRepositoryImpl;
import static org.example.repository.impl.OrganisationRepositoryImpl.entityManager;

public class Main {
    public static void main(String[] args) {
        EntityTransaction entityTransaction = entityManager.getTransaction();

        OrganisationRepositoryImpl organisationRepository = new OrganisationRepositoryImpl();

        entityTransaction.begin();
//        organisationRepository.persist();
//        organisationRepository.find();
//        organisationRepository.merge();
//        organisationRepository.remove();
        entityTransaction.commit();
    }
}