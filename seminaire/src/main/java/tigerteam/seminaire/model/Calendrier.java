package tigerteam.seminaire.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Calendrier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCalendrier;
	
	
	private Date dateCalendrier;
	private Time heureCalendrier;
	
	@OneToMany (mappedBy = "calendrier")
	private List<User> users = new ArrayList<>();
	
	@ManyToOne
	@MapsId( "seminaireId" )
	@JoinColumn (name = "idSeminaire")
	private Seminaire seminaire;
}
