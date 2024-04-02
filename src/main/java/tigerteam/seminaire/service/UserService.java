package tigerteam.seminaire.service;

import java.util.Optional;

import tigerteam.seminaire.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import tigerteam.seminaire.repository.UserRepository;

public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User addUser(User user) {
		  return  userRepository.save(user);
	}
	
	
	public void deleteUser(User user) {
		userRepository.delete((tigerteam.seminaire.model.User) user);
	}
	
	
	public User getById(Integer id){

		Optional<User> user = userRepository.findById(id);
		return user.isPresent()? user.get(): null;
	}
	
	public List<User> getAll(){
		
		return  userRepository.findAll();
	}

	public User updateArticle( Integer id, User user ) {
		Optional<User> optArt = userRepository.findById( id );

		if ( optArt.isPresent() ) {
			User userInBd = optArt.get();

			userInBd.setNom( user.getNom() );
			userInBd.setPrenom( user.getPrenom() );
			userInBd.setSexe( user.getSexe() );
			userInBd.setRole( user.getRole() );
			userInBd.setLogin( user.getLogin() );
			userInBd.setMdp( user.getMdp() );
			userInBd.setAdresse(user.getAdresse());


			return userRepository.save( userInBd );
		}

		return null;
	}


}
