/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.util.List;

/**
 *Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 * @author RENZO
 */
public class Poliza {
    private List<Vehiculo> unVehiculo;
    private Cliente unCliente;
    private int numPoliza, cuotasPoliza;
    private Date fechaInicio;
    private Date finPoliza;
    private FormaPago formaDePago;
    private long montoAsegurado;
    private boolean granizo;
    private long montoGranizo;
    private TipoCobertura unaCobertura;
    
    public Poliza() {
    }

    public Poliza(List<Vehiculo> unVehiculo, Cliente unCliente, int numPoliza, int cuotasPoliza, Date fechaInicio, Date finPoliza, FormaPago formaDePago, long montoAsegurado, boolean granizo, long montoGranizo, TipoCobertura unaCobertura) {
        this.unVehiculo = unVehiculo;
        this.unCliente = unCliente;
        this.numPoliza = numPoliza;
        this.cuotasPoliza = cuotasPoliza;
        this.fechaInicio = fechaInicio;
        this.finPoliza = finPoliza;
        this.formaDePago = formaDePago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.unaCobertura = unaCobertura;
    }

    public List<Vehiculo> getUnVehiculo() {
        return unVehiculo;
    }

    public void setUnVehiculo(List<Vehiculo> unVehiculo) {
        this.unVehiculo = unVehiculo;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getCuotasPoliza() {
        return cuotasPoliza;
    }

    public void setCuotasPoliza(int cuotasPoliza) {
        this.cuotasPoliza = cuotasPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFinPoliza() {
        return finPoliza;
    }

    public void setFinPoliza(Date finPoliza) {
        this.finPoliza = finPoliza;
    }

    public FormaPago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public long getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(long montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public long getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(long montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public TipoCobertura getUnaCobertura() {
        return unaCobertura;
    }

    public void setUnaCobertura(TipoCobertura unaCobertura) {
        this.unaCobertura = unaCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "unVehiculo=" + unVehiculo + ", unCliente=" + unCliente + ", numPoliza=" + numPoliza + ", cuotasPoliza=" + cuotasPoliza + ", fechaInicio=" + fechaInicio + ", finPoliza=" + finPoliza + ", formaDePago=" + formaDePago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", unaCobertura=" + unaCobertura + '}';
    }
    
       
    
    
    
    
    
}
