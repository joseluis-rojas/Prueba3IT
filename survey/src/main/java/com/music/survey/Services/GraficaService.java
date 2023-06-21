package com.music.survey.Services;

import com.music.survey.Entity.Grafica;

import java.util.List;

public interface GraficaService {
    public abstract List<Grafica> listAllGrafica();
    public abstract Grafica addGrafica();
}
