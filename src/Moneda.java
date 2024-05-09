import com.google.gson.annotations.SerializedName;

public class Moneda {
    private String monedaBase;
    private String monedaObjetivo;
    private double monto;
    @SerializedName("conversion_result")
    private double conversionResultado;

    public Moneda(String monedaBase, String monedaObjetivo, double monto, double conversionResultado) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.monto = monto;
        this.conversionResultado = conversionResultado;
    }

    // Getters y Setters
    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaObjetivo(String monedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getConversionResultado() {
        return conversionResultado;
    }

    public void setConversionResultado(double conversionResultado) {
        this.conversionResultado = conversionResultado;
    }

    // toString() para representación de cadena
    @Override
    public String toString() {
        return "conversionResultado=" + conversionResultado;
    }
}