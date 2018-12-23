package pfa.model.archivage;
// Generated 23 avr. 2016 02:24:37 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import pfa.model.dossier.Dossier;

/**
 * Archivage generated by hbm2java
 */
@Entity
@IdClass(ArchivageId.class)
public class Archive  implements java.io.Serializable {
    //**************************************************************************************//     
    //**************************************************************************************//  
     @Id
     @ManyToOne()
     @Cascade({CascadeType.REFRESH,CascadeType.SAVE_UPDATE,CascadeType.PERSIST})
     @JoinColumn(name = "id_colonne")
     private ColonneArchivage colonneArchivage;
     @Id
     @OneToOne(optional = false)
     @Cascade({CascadeType.REFRESH,CascadeType.SAVE_UPDATE,CascadeType.PERSIST})
     @JoinColumn(name = "id_dossier")
     private Dossier dossier;
     
     @Temporal(TemporalType.DATE)
     @Column(name = "date_creation",nullable = false)
     private Date dateArchivage;
     
     @Temporal(TemporalType.TIME)
     @Column(name = "heure_creation",nullable = false)
     private Date heureCreation;
     
     @Column(name = "descripton",length = 250)
     private String description;
    //**************************************************************************************//     
    //**************************************************************************************//  

    public Archive() {
    }



    public Archive(ColonneArchivage colonneArchivage, Dossier dossier) {
        this.colonneArchivage = colonneArchivage;
        this.dossier = dossier;
    }
     
    //**************************************************************************************//     
    //**************************************************************************************//  
    public ColonneArchivage getColonneArchivage() {
        return this.colonneArchivage;
    }
    
    public void setColonneArchivage(ColonneArchivage colonneArchivage) {
        this.colonneArchivage = colonneArchivage;
    }
    public Dossier getDossier() {
        return this.dossier;
    }
    
    public void setDossier(Dossier dossier) {
        this.dossier = dossier;
    }
    public Date getDateArchivage() {
        return this.dateArchivage;
    }
    
    public void setDateArchivage(Date dateArchivage) {
        this.dateArchivage = dateArchivage;
    }

    public Date getHeureCreation() {
        return heureCreation;
    }

    public void setHeureCreation(Date heureCreation) {
        this.heureCreation = heureCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}


