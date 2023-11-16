package com.tn.esprit.gestionfoyenour.Rep;

import com.tn.esprit.gestionfoyenour.entities.Cours;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoursRep extends CrudRepository<Cours,Long> {

    @Query(value = "SELECT *_n"+
            "FROM cours c "+
            "JOIN moniteur_cours mc ON c.num_cours=mc.cours_num_cours "+
            "JOIN moniteur m ON m.num_moni=mc.moniteur_num_moni "+
            "WHERE m.nomm = :nameMon",nativeQuery = true)
    List<Cours> GetCoursByMoniteurSql(@Param("nameMon") String nameMon);

    //memeber 5ater 3andoch relation direct bi b3adhom fama table binethom
    @Query(value = "SELECT c "+
            "FROM Cours c "+
            "JOIN Moniteur m ON c member m.cours "+
            "WHERE m.nomM= :nameMon")
    List<Cours> GetCoursByMoniteurJPqr(@Param("nameMon") String nameMon);



}
