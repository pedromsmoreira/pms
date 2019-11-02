package pms.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HelloWorldController {
    @GetMapping()
    public ResponseEntity<String> get() {
        return ResponseEntity.ok()
                .header("Custom-header", "foo")
                .body("World");
    }
}
