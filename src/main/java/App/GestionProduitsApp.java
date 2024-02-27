package App;

import metier.Produit;

import java.util.*;

public class GestionProduitsApp {
    public static void main(String[] args) {
        List<Produit> listProduit=new LinkedList<>();
        Produit p1=new Produit(1,"test",2524.0);
        Produit p2=new Produit(2,"test2",24.0);
        Produit p3=new Produit(3,"testPro3",238387.0);
        Produit p4=new Produit(4,"test4",238.0);
        listProduit.add(p1);
        listProduit.add(p2);
        listProduit.add(p3);


        for (Produit produit : listProduit) {
            System.out.println(produit);
        }
        listProduit.remove(p1);
        System.out.println("*******************remove product 1*******************");
        for (Produit produit : listProduit) {

            System.out.println(produit);
        }
        System.out.println("*******************update product 2 by product 4*******************");
        listProduit.get(0).setNom("HP");
        Map<String,Produit> ProduitUpdate=new HashMap<>();
        ProduitUpdate.put("p2",p4);
        System.out.println(ProduitUpdate.get("p2"));




        for (Produit produit : listProduit) {

            System.out.println(produit);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************entre svp le nom de produit:*******************");
        String Keyword=scanner.next();
        for (Produit p:listProduit){
            if (p.getNom().contains(Keyword)){
                System.out.println(p);
            }
        }
    }
}
