package tigerteam.seminaire.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tigerteam.seminaire.model.Seminaire;
import tigerteam.seminaire.repository.SeminaireRepository;
import tigerteam.seminaire.repository.UserRepository;

import java.util.Optional;

@Service
public class SeminaireService {



        @Autowired
        SeminaireRepository seminaireRepository;

        public Seminaire addSeminaire(Seminaire  seminaire) {
            return  seminaireRepository.save(seminaire);
        }


        public void deleteuser(Seminaire seminaire) {
            seminaireRepository.delete(seminaire);
        }


        public Seminaire getById(Integer id){

            Optional<Seminaire> sem =  seminaireRepository.findById(id);
            return sem.isPresent()? sem.get(): null;
        }

        public java.util.List<Seminaire> getAll(){

            return  seminaireRepository.findAll();

    }
        public void deleteSeminaire(Seminaire seminaire){
            seminaireRepository.delete(seminaire);
        }

}
