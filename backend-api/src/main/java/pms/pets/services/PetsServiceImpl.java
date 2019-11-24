package pms.pets.services;

import org.springframework.stereotype.Service;
import pms.pets.dto.Pet;
import pms.pets.model.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class PetsServiceImpl implements PetsServices {

    @Override
    public CompletableFuture<List<Pet>> getAll() {
        return CompletableFuture.supplyAsync(() -> {
            var pets = new ArrayList<Pet>();
            pets.add(new Pet("a", "a", "a", Gender.NONE.getGenderCode(), 1, "2019/09/09"));

            return pets;
        });
    }
}
