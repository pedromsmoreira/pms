package pms.pets.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pms.pets.dto.Pet;
import pms.pets.services.PetsServices;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/v1/pets", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PetsController {

    private PetsServices petsServices;

    public PetsController(PetsServices petsServices) {
        this.petsServices = petsServices;
    }

    @GetMapping()
    public CompletableFuture<ResponseEntity<List<Pet>>> get(){
        return  this.petsServices
                .getAll()
                .thenApplyAsync(
                        lp -> ResponseEntity.ok().body(lp));
    }
}
