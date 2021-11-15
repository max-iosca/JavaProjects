package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.EccezioneRemo.src;

public class EccezioneRemo {

	public static void main(String[] args) {

		EccezioneRemo start = new EccezioneRemo();
		start.primoMetodo();
	}

	public void primoMetodo() {
		try {
			metodoChiamante();
		} catch (BenvenutoException x) {
			System.err.println(x.getMessage());
			
		}
	}

	public void metodoChiamante() throws BenvenutoException {
		metodoChiamato(null);
	}

	public void metodoChiamato(String welcome) throws BenvenutoException {
		if (welcome != null) {
			System.out.println(welcome);
		} else {
			throw new MancaSalutoException("Errore dalla throw");
		}
	}

}
