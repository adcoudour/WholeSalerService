/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stock.wholeSalerService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adcoudour
 */
@RestController
public class WholeSalerServiceController {
    public WholeSalerServiceController() {
        
    }
    
    @GetMapping("/ws")
	public String index() {
		return "WholeSaler";
	}
    
    /**
     * Cette méthode sert à faire une requête pour vérifier que le stock du livre est superieur 
     * @param key clef correspondant au compte du client
     * @param isbn identifiant du livre
     * @param quantity quantité que l'on souhaite commander
     * @param corr Id de corrélation composé de isbn et account
     * @return message de validation de la demande du livre
     */
    @GetMapping("/wholesaler_service/command/{key}/{isbn}/{quantity}/{corr}")
    public ResponseEntity<String> WholeSalerRequest(int key, String isbn,int quantity,String corr){
        // Appel du stockService pour ajouter des livres sur l'isbn
        return ResponseEntity.ok("WholeSale order sent ");
    }
}