package tigerteam.seminaire.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCommentaire;
	
	@Size(min = 60, max = 300)
	private String Commentaire;
	
	
	private Time heureComment;
	
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
	@ManyToMany
	@JoinTable(name = "Appartenir", joinColumns = @JoinColumn(name = "idCommentaire"), 
	inverseJoinColumns = @JoinColumn(name = "idSeminaire"))
	private List<Seminaire> seminaires = new ArrayList<>();
}
