package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Train2 implements Serializable {

    long idTrain;


    long codeTrain;

    public long getCodeTrain() {
        return codeTrain;
    }

    public void setCodeTrain(long codeTrain) {
        this.codeTrain = codeTrain;
    }

    
    private etatTrain etat;

    private int nbPlaceLibre;

    public long getIdTrain() {
        return idTrain;
    }

    public void setIdTrain(long idTrain) {
        this.idTrain = idTrain;
    }

    public etatTrain getEtat() {
        return etat;
    }

    public void setEtat(etatTrain etat) {
        this.etat = etat;
    }

    public int getNbPlaceLibre() {
        return nbPlaceLibre;
    }

    public void setNbPlaceLibre(int nbPlaceLibre) {
        this.nbPlaceLibre = nbPlaceLibre;
    }

    public Train2() {
        super();
    }

    public Train2(long idTrain, etatTrain etat, int nbPlaceLibre) {
        super();
        this.idTrain = idTrain;
        this.etat = etat;
        this.nbPlaceLibre = nbPlaceLibre;
    }
    public Train2(etatTrain etat, int nbPlaceLibre) {
        super();
        
        this.etat = etat;
        this.nbPlaceLibre = nbPlaceLibre;
    }


}
