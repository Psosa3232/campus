package es.academia.campushub.repository;

import es.academia.campushub.entity.ContactoEstudiante;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactoEstudianteRepository extends JpaRepository<ContactoEstudiante, Long> {

  @Query("SELECT c FROM ContactoEstudiante c WHERE c.estudiante.id = :estudianteId")
  Optional<ContactoEstudiante> buscarPorEstudiante(@Param("estudianteId") Long estudianteId);
}
