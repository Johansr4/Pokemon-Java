package principal;

public class MovimientoPokemon {

	private int PotenciaAtaque;

	public enum Movimiento {
		BURBUJA(0),
		CASCADA(1),
		MARTILLAZO(2),
		PISTOLA_AGUA(3);

		private int indice;

		private Movimiento(int indice) {
			this.indice = indice;
		}

		public int getIndice() {
			return indice;
		}

		public enum TipoMovimiento {
			ATAQUE(0),
			ESTADO(1),
			MEJORA(2);

			private int indice;

			private TipoMovimiento(int indice) {
				this.indice = indice;
			}

			public int getIndice() {
				return indice;
			}
		}

	}
}