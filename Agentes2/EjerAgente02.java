package agente;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

/**
 *Agente que implementa un comportamiento que saluda al mundo
 * @author areli
 */
public class EjerAgent02 extends Agent
{
    protected void setup()//inicializar el agente
    {
      this.addBehaviour(new Behaviour(){
        public void action() //coloco la acción del agente
        {
            System.out.print("Hola Mundo de Agentes desde el comportamiento");
        }
        public boolean done()//verifica la actividad del agente
        {
            return true;
        }
      });
    }
}
