package tn.cybertrace.projetpfecat.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.cybertrace.projetpfecat.model.Pfe;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface PdeDao extends JpaRepository<Pfe,Integer> {
    @Query("select p from Pfe p where p.typePfe.id=:x")
    public List<Pfe> getPfesBycat(@Param("x") int id);


    @Query("select p from Pfe p ")
    public List<Pfe> getall();

     public List<Pfe> findPfeByTitreContains(@Param("ch") String s);
}
