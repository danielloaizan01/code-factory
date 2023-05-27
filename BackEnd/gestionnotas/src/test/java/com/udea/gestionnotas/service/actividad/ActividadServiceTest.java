package com.udea.gestionnotas.service.actividad;

import com.udea.gestionnotas.model.dto.Actividad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActividadServiceTest {

    List<Actividad> actividadesResponse;
//este codigo se cambio por probar
    @BeforeEach
    void setUp() {
        actividadesResponse = Arrays.asList(
                new Actividad(),
                new Actividad()
        );
    }

    @Test
    void getActividad() {
        // Lógica de prueba para el método getActividad()
    }

    @Test
    void saveActividades() {
        // Lógica de prueba para el método saveActividades()
    }
}
