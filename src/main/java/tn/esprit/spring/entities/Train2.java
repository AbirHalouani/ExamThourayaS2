package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Train2 implements Serializable {

    long idTrain2;


    long codeTrain2;

    public long getCodeTrain2() {
        return codeTrain2;
    }

    public void setCodeTrain2(long codeTrain) {
        this.codeTrain2 = codeTrain;
    }

    
    private etatTrain etat2;

    private int nbPlaceLibre2;

    public long getIdTrain2() {
        return idTrain2;
    }

    public void setIdTrain2(long idTrain) {
        this.idTrain2 = idTrain;
    }

    public etatTrain getEtat2() {
        return etat2;
    }

    public void setEtat2(etatTrain etat) {
        this.etat2 = etat;
    }

    public int getNbPlaceLibre2() {
        return nbPlaceLibre2;
    }

    public void setNbPlaceLibre2(int nbPlaceLibre) {
        this.nbPlaceLibre2 = nbPlaceLibre;
    }

    public Train2() {
        super();
    }

    public Train2(long idTrain, etatTrain etat, int nbPlaceLibre) {
        super();
        this.idTrain2 = idTrain;
        this.etat2 = etat;
        this.nbPlaceLibre2 = nbPlaceLibre;
    }
    public Train2(etatTrain etat, int nbPlaceLibre) {
        super();
        
        this.etat2 = etat;
        this.nbPlaceLibre2 = nbPlaceLibre;
    }


}
