package pms.pets.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pms.pets.services.PetsServices;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/pets", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PetsController {

    private PetsServices petsServices;

    public PetsController(PetsServices petsServices) {
        this.petsServices = petsServices;
    }

    @GetMapping()
    public ResponseEntity<List<Pet>> get(){
        var pets = new ArrayList<Pet>();
        this.petsServices.getAll()
                        .thenAccept(
                                lp -> lp.forEach(pet ->
                                pets.add(new Pet(pet.getName(),
                                    pet.getId(),
                                    pet.getRace(),
                                    pet.getGender().getGenderCode(),
                                    pet.getAge(),
                                    pet.getBirthDate()))));

        return ResponseEntity.ok().body(pets);
    }
}
