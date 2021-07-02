package com.example.PartieBack.Service;

import com.example.PartieBack.Repository.ProfilRepository;
import com.example.PartieBack.Repository.ProjetRepository;
import com.example.PartieBack.Repository.UserRepository;
import com.example.PartieBack.dto.UserDto;
import com.example.PartieBack.entities.Profil;
import com.example.PartieBack.entities.Projet;
import com.example.PartieBack.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userREp;
    @Autowired
    ProfilRepository profilRep;
    @Autowired
    ProjetRepository projetRep;

    @Override
    public User SaveUser(User u) {

        return userREp.save(u);
    }

    @Override
    public List<User> getAllUsers() {

        return userREp.findAll();
    }

    @Override
    public User updateUser(User U) {
        return userREp.save(U);
    }

    @Override
    public void deleteUser(User U) {
        userREp.delete(U);
    }

    @Override
    public void deleteUserById(Long id) {
        userREp.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return userREp.findById(id).get();
    }
    @Override
  public  void affecteUserToprojet(UserDto user){
      User  userToUpdate=userREp.findById(user.getUtilisateurId()).get();
      log.info("test"+userToUpdate.getUtilisateur_id());
      Profil profilToAffect=profilRep.findById(user.getProfilId()).get();
      Set<Projet> projets=projetRep.findByIdsIn(user.getProjetIds());
      log.info("test proj" + projets.size() + " ids " + user.getProjetIds().size());
      userToUpdate.setProfil(profilToAffect);
      userToUpdate.setProjets(projets);
       /* profilToAffect.setUser(userToUpdate); */

        userREp.save(userToUpdate);
    }

}
