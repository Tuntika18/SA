package comeng.sa.no12.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import comeng.sa.no12.demo.entity.Initial;
import comeng.sa.no12.demo.repository.InitialRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
class InitialController {

    @Autowired
    private final InitialRepository initialRepository;

    public InitialController(InitialRepository initialRepository) {
        this.initialRepository = initialRepository;
    }

    @GetMapping("/Initial-list")
    public Collection<Initial> initial() {
        return initialRepository.findAll().stream().collect(Collectors.toList());
    }

}
