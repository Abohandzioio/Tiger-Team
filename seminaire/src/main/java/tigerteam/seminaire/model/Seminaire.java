package tigerteam.seminaire.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Seminaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSeminaire;
	
	@OneToOne(mappedBy = "seminaire")	
	private Adresse adresse ;
	
	@OneToMany(mappedBy = "seminaire")
	private List<Calendrier> calendriers = new ArrayList<>();
	
	@OneToMany (mappedBy = "seminaire")
	private List<User> users = new ArrayList<>();
	
	@ManyToMany(mappedBy = "seminaire")
	private List<Commentaire> commentaires =new ArrayList<>();
	
	
}
