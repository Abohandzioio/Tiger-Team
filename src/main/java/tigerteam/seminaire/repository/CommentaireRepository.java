package tigerteam.seminaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tigerteam.seminaire.model.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer>{

}
