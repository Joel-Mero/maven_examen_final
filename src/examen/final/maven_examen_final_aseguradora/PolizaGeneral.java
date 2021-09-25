package maven_examen_final_aseguradora;

public class PolizaGeneral extends Poliza{

	private String nombre;
	private String descripcion;
	private String anioVigencia;
	private String codigoPoliza;
	private int valorPoliza;
	private String valorDescuento;
	private String numeroSeguro;
	
	//Métodos SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAnioVigencia() {
		return anioVigencia;
	}
	public void setAnioVigencia(String anioVigencia) {
		this.anioVigencia = anioVigencia;
	}
	public String getCodigoPoliza() {
		return codigoPoliza;
	}
	public void setCodigoPoliza(String codigoPoliza) {
		this.codigoPoliza = codigoPoliza;
	}
	public int getValorPoliza() {
		return valorPoliza;
	}
	public void setValorPoliza(int valorPoliza) {
		this.valorPoliza = valorPoliza;
	}
	public String getValorDescuento() {
		return valorDescuento;
	}
	public void setValorDescuento(String valorDescuento) {
		this.valorDescuento = valorDescuento;
	}
	public String getNumeroSeguro() {
		return numeroSeguro;
	}
	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}
	
}
