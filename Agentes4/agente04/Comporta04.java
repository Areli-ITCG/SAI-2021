/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agente04;
import jade.core.behaviours.Behaviour;

/**
 * Agente que cuenta del 1 al 10
 * @author areli
 */
public class Comporta04 extends Behaviour
{
    int contador = 1;
    public void action()
    {
        System.out.println(contador);
        contador ++;
    }
    
    public boolean done()
    {
        //CONDICION FINAL DE COMPORTAMIENTO
        return contador > 10;
    }
}
