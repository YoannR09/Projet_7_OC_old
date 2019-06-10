package fr.oc.projet.business.contract.manager.bibliotheque;

import fr.oc.projet.model.beans.bibliotheque.Livre;

import java.util.List;

public interface LivreManager {

    Livre getLivre(Integer pId);

    List<Livre> getListLivre();

}
