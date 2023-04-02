/**
 * 
 */

/**
 * @author el_mo
 *
 */
public class Coche {
	public int velocidad;
	
	public void Acelerar_CarmeloNietoDomene(int aceleracion) {
		velocidad += aceleracion;
	}
	
	public void Decelerar_CarmeloNietoDomene(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad < 0) {
			velocidad = 0;
		}
	}
}
