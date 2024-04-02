package tigerteam.seminaire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tigerteam.seminaire.model.Calendrier;
import tigerteam.seminaire.model.Notification;
import tigerteam.seminaire.repository.CalendrierRepository;
import tigerteam.seminaire.repository.NotificationRepository;

import java.util.List;

@Service
public class CalendrierService {

    @Autowired
    CalendrierRepository calendrierRepository;
    @Autowired
    private NotificationRepository notificationRepository;

    public Calendrier addCalendrier(Calendrier calendrier){
        return calendrierRepository.save(calendrier);
    }

    public void delete(Notification notification){
        notificationRepository.delete(notification);
    }

    public List<Notification> getAllNotification(){
        return notificationRepository.findAll();
    }
}
