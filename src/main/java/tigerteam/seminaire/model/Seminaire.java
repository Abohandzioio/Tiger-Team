package tigerteam.seminaire.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Seminaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSeminaire;

	private String theme;

	private String description;

	@OneToOne(mappedBy = "seminaire")	
	private Adresse adresse ;
	
	@OneToMany(mappedBy = "seminaire")
	private List<Calendrier> calendriers = new ArrayList<>();
	
	@ManyToMany (mappedBy = "seminaires")
	private List<User> users = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
	@ManyToMany(mappedBy = "seminaires")
	private List<Commentaire> commentaires =new ArrayList<>();
	
	
}
