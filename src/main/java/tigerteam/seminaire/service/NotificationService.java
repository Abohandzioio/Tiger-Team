package tigerteam.seminaire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tigerteam.seminaire.model.Notification;
import tigerteam.seminaire.repository.NotificationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    public Notification addNotification(Notification notification){
        return  notificationRepository.save(notification);
    }

    public Notification getById(Integer id){
        Optional<Notification> not =  notificationRepository.findById(id);
        return  not.isPresent()? not.get():null;
    }

    public List<Notification> getAllNotification (){
        return notificationRepository.findAll();
    }

    public  void deleteNotification (Notification notification){
        notificationRepository.delete(notification);
    }

}
