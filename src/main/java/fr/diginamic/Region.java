package fr.diginamic;

import javax.persistence.*;

/**
 * Classe region qui dispose des données sur les regions
 */
@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRegion;

    @Column
    private String codeRegion;

    @Column
    private String nomRegion;

    /**
     * Constructeur par défaut
     */
    public Region() {
    }

    /**
     * Constructeur avec des parametres
     * @param idRegion qui represente l'identifiant de la région
     * @param codeRegion qui représente le code de la région
     * @param nomRegion qui représente le nom de la region
     */
    public Region(int idRegion, String codeRegion, String nomRegion) {
        this.idRegion = idRegion;
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
    }


    /**
     * @return idRegion qui retoiurne l'identifiant de la region
     */
    public int getIdRegion() {
        return idRegion;
    }

    /**
     * @param idRegion qui permet de setter l'identifiaction de la region
     */

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    /**
     * @return codeRegion qui retourne le code de la region
     */
    public String getCodeRegion() {
        return codeRegion;
    }

    /**
     * @param codeRegion qui permet de setter le code de la region
     */

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }
    /**
     * @return nomRegion qui retourne le nom de la region
     */

    public String getNomRegion() {
        return nomRegion;
    }

    /**
     *
     * @param nomRegion qui permet de setter le nom de la region
     */

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
}
