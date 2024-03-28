package tigerteam.seminaire.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNotification;
	
	@Size ( min = 5, max =150)
	private String contenant;
	
	
	private Date dateNotification;
	private Time heureNotifacation;
	
	@ManyToMany(mappedBy = "notification")
	List<User> users = new ArrayList<>();
}
