package comeng.sa.no12.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import comeng.sa.no12.demo.entity.Initial;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface InitialRepository extends JpaRepository<Initial, Long> {
    Initial findByInitialName(String initialName);

}