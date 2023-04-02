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
	void Test_Al_Crear_Un_Coche_Su_Velocidad_Es_Cero_CarmeloNietoDomene() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	@Test
	void Test_Al_Acelerar_Un_Coche_Su_Velocidad_Aumenta_CarmeloNietoDomene() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.Acelerar_CarmeloNietoDomene(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	@Test
	void Test_Al_Decelerar_Un_Coche_Su_Velocidad_Disminuye_CarmeloNietoDomene() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.Decelerar_CarmeloNietoDomene(20);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	@Test
	void Test_Al_Decelerar_Un_Coche_Su_Velocidad_No_Puede_Ser_Menor_Que_Cero_CarmeloNietoDomene(){
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.Decelerar_CarmeloNietoDomene(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}

}
