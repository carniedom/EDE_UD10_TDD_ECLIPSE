import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author el_mo
 *
 */
class TestCoche {

	@Test
	void Test_Al_Crear_Un_Coche_Su_Velocidad_Es_Cero() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}

}
