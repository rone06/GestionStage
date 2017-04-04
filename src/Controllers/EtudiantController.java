package Controllers;

<<<<<<< HEAD
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import Models.EtuPostStage;
import Models.Etudiant;
import Models.EtudiantModel;
import Models.OffreEtuModel;
import Models.OffreModel;
import Models.OffreStage;
import Models.DAO.EtuPostStageDAO;
import Models.DAO.OffreStageDAO;
import Views.Etudiant.EtudiantView;

public class EtudiantController {
private Etudiant et;
private EtudiantView etView;
private EtudiantModel etModel;
private OffreEtuModel ofModel;

public Etudiant getEt() {
	return et;
}
public EtudiantView getEtView() {
	return etView;
}
public void setEt(Etudiant et) {
	this.et = et;
}
public void setEtView(EtudiantView etView) {
	this.etView = etView;
}
public EtudiantController()
{
	
	this.etModel = new EtudiantModel();
	this.ofModel = new OffreEtuModel();
	this.ofModel.loadOffre(new OffreStageDAO().getAllOffreStage());
	this.etView =new EtudiantView(this);
	
	}
public EtudiantModel getEtModel() {
	return etModel;
}
public OffreEtuModel getOfModel() {
	return ofModel;
}
public void setEtModel(EtudiantModel etModel) {
	this.etModel = etModel;
}
public void setOfModel(OffreEtuModel ofModel) {
	this.ofModel = ofModel;
}
public void postuler(OffreStage of)
{ 
	EtuPostStage cand = new EtuPostStage();
	cand.setEtudiant(et);
	cand.setOffre(of);
	//cand.setDatePostule(datePostule);
	new EtuPostStageDAO().create(cand);
}

public void mettreCV()
{
	JFileChooser choix = new JFileChooser();
	int retour=choix.showOpenDialog(this.getEtView());
	if(retour==JFileChooser.APPROVE_OPTION){
	   // un fichier a été choisi (sortie par OK)
	   // nom du fichier  choisi 
	  // 
	   // chemin absolu du fichier choisi
	   et.setCv(choix.getSelectedFile().getName());
	}
	else {
		} ;// pas de fichier choisi}
	}
public void visualiser(OffreStage of)
{
	
}
public void recherche(String domaine)
{
	ofModel.loadOffre(new OffreStageDAO().getAllOffreStage(domaine));
	}
=======
import Models.DAO.DAO;
import Models.DAO.EtudiantDAO;
import Models.Etudiant;

import javax.swing.*;

/**
 * Created by Allam on 24/03/2017.
 */
public class EtudiantController
{
    //Déclaration

    DAO<Etudiant> DAO = new EtudiantDAO();

    /*//Constructeur

    public EtudiantController(EtudiantDAO eDAO)
    {
        this.DAO = eDAO;
    }*/

    public void insert(Etudiant e)
    {
        DAO.create(e);

        //Affichage de la boite de dialogue
        JOptionPane jOP = new JOptionPane();
        jOP.showMessageDialog(null, "Enregistrement réussie", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
>>>>>>> 61d0e3918d7f6748ab4c7dc9efdc6bf7b118de8e
}