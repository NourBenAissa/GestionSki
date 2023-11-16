package com.tn.esprit.gestionfoyenour.Rep;

import com.tn.esprit.gestionfoyenour.entities.Skieur;
import com.tn.esprit.gestionfoyenour.tabsenum.Couleur;
import com.tn.esprit.gestionfoyenour.tabsenum.Support;
import com.tn.esprit.gestionfoyenour.tabsenum.TypeAbonnement;
import com.tn.esprit.gestionfoyenour.tabsenum.TypeCours;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkieurRep extends CrudRepository<Skieur,Long> {

    List<Skieur> findByAbonnementTypeAbn (TypeAbonnement abonnement_typeAbn);
    List<Skieur> findByAbonnementTypeAbnAndPistesCouleurAndInscriptionsCoursSupportAndInscriptionsCoursTypeCours(TypeAbonnement abonnement_typeAbn, Couleur pistes_couleur, Support inscriptions_cours_support, TypeCours inscriptions_cours_typeCours);

    @Query(value = "SELECT * \n" +
            "FROM skieur s \n" +
            "JOIN inscription i ON s.id=i.skieur_id \n" +
            "JOIN moniteur_cours mc ON i.cours_num_cours=mc.cours_num_cours \n" +
            "JOIN moniteur m ON m.num_moni=mc.moniteur_num_moni \n" +
            "WHERE m.nomm = :nomMon", nativeQuery = true)
    List<Skieur> getSkieurByMoniteurNameSql(@Param("nomMon") String nomMon);

    @Query("SELECT i.skieur " +
            "FROM Inscription i " +
            "JOIN Moniteur m ON i.cours member m.cours " +
            "WHERE m.nomM = :nomMon ")

    List<Skieur> getSkieurByMoniteurNameJplq(@Param("nomMon") String nomMon);

    /////order by nb piste affecter lel skieur
    @Query("SELECT s, COUNT(p) AS numPistes " +
            "FROM Skieur s " +
            "LEFT JOIN s.pistes p " +
            "GROUP BY s " +
            "ORDER BY numPistes DESC")
    List<Skieur> GetSkieurOrdonnerParNombreDePisteAffecterAChaqueSkieur();
}
