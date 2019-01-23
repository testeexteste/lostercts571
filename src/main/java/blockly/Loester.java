package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Loester {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// loester
public static Var Executar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("name")).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

