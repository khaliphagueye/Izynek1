/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.izy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cheikh Bamba
 */
@Entity
@Table(name = "reservation", catalog = "hotell", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
    , @NamedQuery(name = "Reservation.findById", query = "SELECT r FROM Reservation r WHERE r.id = :id")
    , @NamedQuery(name = "Reservation.findByCivilite", query = "SELECT r FROM Reservation r WHERE r.civilite = :civilite")
    , @NamedQuery(name = "Reservation.findByPrenom", query = "SELECT r FROM Reservation r WHERE r.prenom = :prenom")
    , @NamedQuery(name = "Reservation.findByNom", query = "SELECT r FROM Reservation r WHERE r.nom = :nom")
    , @NamedQuery(name = "Reservation.findByTelephone", query = "SELECT r FROM Reservation r WHERE r.telephone = :telephone")
    , @NamedQuery(name = "Reservation.findByEmail", query = "SELECT r FROM Reservation r WHERE r.email = :email")
    , @NamedQuery(name = "Reservation.findByTChambre", query = "SELECT r FROM Reservation r WHERE r.tChambre = :tChambre")
    , @NamedQuery(name = "Reservation.findByNbChambre", query = "SELECT r FROM Reservation r WHERE r.nbChambre = :nbChambre")
    , @NamedQuery(name = "Reservation.findByDarrivee", query = "SELECT r FROM Reservation r WHERE r.darrivee = :darrivee")
    , @NamedQuery(name = "Reservation.findByDdepart", query = "SELECT r FROM Reservation r WHERE r.ddepart = :ddepart")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "civilite", nullable = false, length = 4)
    private String civilite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telephone", nullable = false)
    private int telephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 19)
    @Column(name = "tChambre", nullable = false, length = 19)
    private String tChambre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NbChambre", nullable = false)
    private int nbChambre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Darrivee", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date darrivee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ddepart", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ddepart;

    public Reservation() {
    }

    public Reservation(Integer id) {
        this.id = id;
    }

    public Reservation(Integer id, String civilite, String prenom, String nom, int telephone, String email, String tChambre, int nbChambre, Date darrivee, Date ddepart) {
        this.id = id;
        this.civilite = civilite;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.tChambre = tChambre;
        this.nbChambre = nbChambre;
        this.darrivee = darrivee;
        this.ddepart = ddepart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTChambre() {
        return tChambre;
    }

    public void setTChambre(String tChambre) {
        this.tChambre = tChambre;
    }

    public int getNbChambre() {
        return nbChambre;
    }

    public void setNbChambre(int nbChambre) {
        this.nbChambre = nbChambre;
    }

    public Date getDarrivee() {
        return darrivee;
    }

    public void setDarrivee(Date darrivee) {
        this.darrivee = darrivee;
    }

    public Date getDdepart() {
        return ddepart;
    }

    public void setDdepart(Date ddepart) {
        this.ddepart = ddepart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.src.izy.Reservation[ id=" + id + " ]";
    }
    
}
