package tigerteam.seminaire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tigerteam.seminaire.model.Commentaire;
import tigerteam.seminaire.repository.CommentaireRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CommentaireService {
    @Autowired
    CommentaireRepository commentaireRepository;

    public Commentaire addCommentaire(Commentaire commentaire){
        return commentaireRepository.save(commentaire);
    }

    public Commentaire getById(Integer id){
        Optional<Commentaire>coms = commentaireRepository.findById(id);
                return coms.isPresent() ? coms.get():null;
    }


    public void deleteCom(Commentaire commentaire){
        commentaireRepository.delete(commentaire);
    }

    public List<Commentaire> getAllComs (){
        return commentaireRepository.findAll();
    }
}
