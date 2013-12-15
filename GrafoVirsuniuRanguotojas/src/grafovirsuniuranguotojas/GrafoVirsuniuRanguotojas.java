package grafovirsuniuranguotojas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Pagrindinė klasė
 * @date 2013-10-08
 * @author Paulius Šukys
 */
public class GrafoVirsuniuRanguotojas 
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Labass!");
        Generavimas g = new Generavimas();
        g.generuotiMatrica(0.6,0.2,0.2,3,2,1);
        //g.skaitytiMatricaIsEkrano();
        int[][] matrica = g.gautiMatrica();
                for (int s = 0; s < matrica.length; s++) {
            for (int ss = 0; ss < matrica.length; ss++) {
                System.out.print(matrica[s][ss] + " ");
            }
            System.out.println("");
        }
    }
}
