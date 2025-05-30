package br.com.fiap.moop.repository;

import br.com.fiap.moop.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends JpaRepository<Moto, Long> {
    List<Moto> findByPlacaContaining(String placa);
    List<Moto> findByChassiContaining(String chassi);
    List<Moto> findByModeloContaining(String modelo);
    List<Moto> findByStatus(Moto.Status status);
}