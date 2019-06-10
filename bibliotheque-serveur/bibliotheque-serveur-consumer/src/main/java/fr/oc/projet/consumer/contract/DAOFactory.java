package fr.oc.projet.consumer.contract;

import fr.oc.projet.consumer.contract.dao.bibliotheque.*;
import fr.oc.projet.consumer.contract.dao.utilisateur.CompteDao;
import fr.oc.projet.consumer.contract.dao.utilisateur.NiveauAccesDao;
import fr.oc.projet.consumer.contract.dao.utilisateur.ReservationDao;

public interface DAOFactory {

    NiveauAccesDao getNiveauAccesDao();

    CompteDao getCompteDao();

    BibliothequeDao getBibliotheque();

    CategorieDao getCategorieDao();

    ImageDao getImageDao();

    LivreDao getLivreDao();

    ReservationDao getReservationDao();

    StockDao getStockDao();
}
