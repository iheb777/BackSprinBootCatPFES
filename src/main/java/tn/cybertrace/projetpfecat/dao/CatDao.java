package tn.cybertrace.projetpfecat.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.cybertrace.projetpfecat.model.TypePfe;

@Repository
public interface CatDao extends JpaRepository<TypePfe,Integer> {
}
