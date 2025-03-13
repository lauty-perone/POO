package ar.edu.unlp.info.oo2.ParcialSeguros;

public class PromocionMultiplesPolizas implements Promocion{

	@Override
	public double aplicarPromocion(Cliente c) {
		if (c.getSeguros().size() < 2)
			return 0;
		return c.costoSeguros() * 0.1;
			
	}
	
	
}
