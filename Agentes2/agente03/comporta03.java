package agente03;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author areli
 */
public class comporta03 extends Behaviour
{
   public void action()
   {
       System.out.print("Hola Mundo de Agentes desde el comportamiento");
   }
   public boolean done()
   {
       return true;
   }
}
