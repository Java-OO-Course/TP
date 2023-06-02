package cmo.lab;

import cmo.lab.creators.GeoFormCreator;
import cmo.lab.painter.PainterApp;
import cmo.lab.shapes.GeometricShape;

import java.util.ArrayList;

public class Exemple {

    public static void main(String[] args) {

        // Liste de forme géométrique qui seront dessinées.
        ArrayList<GeometricShape> shapes = new ArrayList<>();

        // Création des formes depuis la console.
        GeoFormCreator creator = new GeoFormCreator();

        // Demande à l'utilisateur de choisir et créer une forme, puis l'ajoute à la liste.
        shapes.add(creator.create());

        // Demande à l'utilisateur de créer un rectangle, puis l'ajoute à la liste.
        shapes.add(creator.create("RECTANGLE"));

        // Pareil pour les autres formes
        shapes.add(creator.create("CIRCLE"));
        shapes.add(creator.create("TRIANGLE"));
        shapes.add(creator.create("SQUARE"));

        // Appel du painter pour dessiner les formes.
        PainterApp.drawShapes(shapes);

    }

}
