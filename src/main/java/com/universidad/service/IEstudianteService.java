package com.universidad.service; // Define el paquete al que pertenece esta interfaz

import com.universidad.dto.EstudianteDTO; // Importa la clase EstudianteDTO del paquete dto

import java.util.List; // Importa la interfaz List para manejar listas

public interface IEstudianteService { // Define la interfaz IEstudianteService
    
    List<EstudianteDTO> obtenerTodosLosEstudiantes(); // Método para obtener una lista de todos los EstudianteDTO
    EstudianteDTO obtenerEstudiantePorId(Long id); // Nuevo método para obtener un estudiante por su ID

    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO); // Nuevo método para actualizar un estudiante
    EstudianteDTO registrarEstudiante(EstudianteDTO estudianteDTO);
    void eliminarEstudiante(Long id);
}