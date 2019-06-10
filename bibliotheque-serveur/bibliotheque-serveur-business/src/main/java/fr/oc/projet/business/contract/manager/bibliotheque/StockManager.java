package fr.oc.projet.business.contract.manager.bibliotheque;

import fr.oc.projet.model.beans.bibliotheque.Stock;

import java.util.List;

public interface StockManager {

    Stock getStock(Integer pId);

    List<Stock> getListStock();

}
