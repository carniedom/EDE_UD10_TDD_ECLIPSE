/**
 * 
 */

/**
 * @author el_mo
 *
 */
public class Coche {
	public int velocidad;
	
	public void Acelerar(int aceleracion) {
		velocidad += aceleracion;
	}
	
	public void Decelerar(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad < 0) {
			velocidad = 0;
		}
	}
}
