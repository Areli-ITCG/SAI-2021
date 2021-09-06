package agente04;
import jade.core.Agent;
/**
 *
 * @author areli
 */
public class EjerAgente04 extends Agent 
{
    protected void setup()
    {
    Comporta04 ObjAgente = new Comporta04();
    addBehaviour(ObjAgente);
    }
}
