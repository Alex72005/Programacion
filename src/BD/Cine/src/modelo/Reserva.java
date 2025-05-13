package BD.Cine.src.modelo;

import java.sql.Date;
import java.sql.Time;

public class Reserva {
    private int id;
    private Pelicula pelicula;
    private Sala sala;
    private Date fecha;
    private Time hora;
    private String nombreCliente;
    private int asientosReservados;

    public Reserva() {
    }

    public Reserva(int id, Pelicula pelicula, Sala sala, Date fecha, Time hora, String nombreCliente,
            int asientosReservados) {
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreCliente = nombreCliente;
        this.asientosReservados = asientosReservados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((pelicula == null) ? 0 : pelicula.hashCode());
        result = prime * result + ((sala == null) ? 0 : sala.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((hora == null) ? 0 : hora.hashCode());
        result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
        result = prime * result + asientosReservados;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reserva other = (Reserva) obj;
        if (id != other.id)
            return false;
        if (pelicula == null) {
            if (other.pelicula != null)
                return false;
        } else if (!pelicula.equals(other.pelicula))
            return false;
        if (sala == null) {
            if (other.sala != null)
                return false;
        } else if (!sala.equals(other.sala))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (hora == null) {
            if (other.hora != null)
                return false;
        } else if (!hora.equals(other.hora))
            return false;
        if (nombreCliente == null) {
            if (other.nombreCliente != null)
                return false;
        } else if (!nombreCliente.equals(other.nombreCliente))
            return false;
        if (asientosReservados != other.asientosReservados)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Reserva " + this.id + ", pelicula: " + this.pelicula + ", sala: " + this.sala + ", fecha: " + 
                this.fecha + ", hora: " + this.hora + ", nombre del cliente: " + this.nombreCliente + 
                ", asientos reservados: " + this.asientosReservados;
    }
}
