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
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCommentaire;
	
	@Size(min = 60, max = 300)
	private String Commentaire;
	
	
	private Time heureComment;
	
	@OneToMany(mappedBy = "commentaire")
	private List<User> users= new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "idCommentaire", joinColumns = @JoinColumn(name = "idCommentaire"), 
	inverseJoinColumns = @JoinColumn(name = "idSeminaire"))
	private List<Seminaire> seminaires = new ArrayList<>();
}
