package ar.edu.unlp.info.oo2.ParcialSeguros;

public class PromocionCampaniaExcepcional implements Promocion {

	@Override
	public double aplicarPromocion(Cliente c) {
		return c.costoSeguroMasEconomico() * 0.5;
	}
	
	
}
