package tigerteam.seminaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tigerteam.seminaire.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
