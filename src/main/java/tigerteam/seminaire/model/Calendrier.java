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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Calendrier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCalendrier;
	
	
	private Date dateCalendrier;
	private Time heureCalendrier;
	
	@ManyToOne
	@JoinColumn(name= "idUser")
	private User user;
	
	@ManyToOne
//	@MapsId( "seminaireId" )
	@JoinColumn (name = "idSeminaire")
	private Seminaire seminaire;
}
