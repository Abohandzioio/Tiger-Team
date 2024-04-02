package tigerteam.seminaire.service;

import org.springframework.beans.factory.annotation.Autowired;
import tigerteam.seminaire.model.Adresse;
import tigerteam.seminaire.model.Seminaire;
import tigerteam.seminaire.repository.AdresseRepository;
import tigerteam.seminaire.repository.SeminaireRepository;

import java.util.Optional;

public class AdresseService {

    @Autowired
    AdresseRepository adresseRepository;

    public Adresse addAdresse(Adresse adresse) {
        return  adresseRepository.save(adresse);
    }


    public void deleteuser(Adresse adresse) {
        adresseRepository.delete(adresse);
    }


    public Adresse getById(Integer id){

        Optional<Adresse> adre =  adresseRepository.findById(id);
        return adre.isPresent()? adre.get(): null;
    }

    public java.util.List<Adresse> getAll(){

        return  adresseRepository.findAll();

    }

}
