package pms.pets.services;

import pms.pets.dto.Pet;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface PetsServices {
    CompletableFuture<List<Pet>> getAll();
}
