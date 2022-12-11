package com.esprit.zacharia.services;

import com.esprit.zacharia.entities.*;
import com.esprit.zacharia.repositories.FactureRepository;
import com.esprit.zacharia.repositories.FournisseurRepository;
import com.esprit.zacharia.repositories.OperatorRepository;
import com.esprit.zacharia.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FactureServiceImp implements  IFactureService{
    @Autowired
    OperatorRepository operatorRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    FactureRepository factureRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;
     @Override
    public  void assignOperateurToFacture(Long idOperateur, Long idFacture){
         Operateur operateur=operatorRepository.findById(idOperateur).orElse(null);
         Facture   facture=factureRepository.findById(idFacture).orElse(null);
         Set<Facture> fac = new HashSet<>();
         if(operateur!=null && facture != null)
         {
             fac.add(facture);
             operateur.setFactureSet(fac);
             operatorRepository.save(operateur);
         }
     }
    @Override
    public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
        Fournisseur fournisseur = fournisseurRepository.findById(idFournisseur).orElse(null);
        return factureRepository.getFacturesByFournisseur(fournisseur) ;
    }

    @Override
    public Facture addFacture(Facture facture) {
        Fournisseur fournisseur =fournisseurRepository.findById(fournisseur).orElse(null);
        facture.setFournisseur(fournisseur);
        float montantRemise=0, montant=0;
        Set<DetailFacture> detailFactures;
        detailFactures = new HashSet<>();
        if (facture.getDetailFacture()!=null){
            for( DetailFacture df:facture.getDetailFacture()){

                Produit produit = produitRepository.findById(df.getProduits().getIdProduit()).orElse(null);
                df.setProduits(produit);
                System.out.println(produit.getPrix() * df.getQteCommande());
                df.setPrixTotalDetail(produit.getPrix() * df.getQteCommande());
                df.setMontantRemise(df.getPrixTotalDetail()*df.getPourcentageRemise()/100);
                montant+=df.getPrixTotalDetail();
                montantRemise+=df.getMontantRemise();
                detailFactures.add(df);

            }
            facture.setDetailFacture(detailFactures);
        }

        facture.setMontantFacture(montant);
        facture.setMontantRemis(montantRemise);
        this.addFacture(facture);
        return facture;
    }

    @Override
    public void annulerFacture(Long id){
        Facture facture;
        facture = factureRepository.findById(id).orElse(null);
        if(facture!=null){
            if (facture.getArchive()){
                facture.setArchive(false);
                factureRepository.save(facture);
                System.out.println(facture);
            }
            else{
                System.out.println("already canceled");
            }
        }
        else{
            System.out.println("notFound");
        }

    }
}
