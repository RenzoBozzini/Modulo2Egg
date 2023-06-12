/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.HashSet;

/**
 *
 * @author RENZO
 */
public class Votos {
    private Alumnos alumno;
    private HashSet<Alumnos> votados;

    public Votos() {
    }

    public Votos(Alumnos alumno, HashSet<Alumnos> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumnos> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumnos> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Votos{" + "alumno=" + alumno + ", votados=" + votados + '}';
    }
    
}
