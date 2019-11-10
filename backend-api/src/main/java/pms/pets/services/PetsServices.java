package pms.pets.services;

import pms.pets.model.Pet;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface PetsServices {
    CompletableFuture<List<Pet>> getAll();
}
