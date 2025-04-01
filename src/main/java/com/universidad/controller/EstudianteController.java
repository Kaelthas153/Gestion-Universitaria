package com.universidad.controller;

import com.universidad.dto.EstudianteDTO;
import com.universidad.service.IEstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstudianteController {

    private final IEstudianteService estudianteService;

    @Autowired
    public EstudianteController(IEstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/estudiantes")
    public ResponseEntity<List<EstudianteDTO>> obtenerTodosLosEstudiantes() {
        List<EstudianteDTO> estudiantes = estudianteService.obtenerTodosLosEstudiantes();
        return ResponseEntity.ok(estudiantes);
    }

    @GetMapping("/estudiantes/{id}") // Nuevo endpoint para obtener un estudiante por ID
    public ResponseEntity<EstudianteDTO> obtenerEstudiantePorId(@PathVariable Long id) {
        EstudianteDTO estudiante = estudianteService.obtenerEstudiantePorId(id);
        return (estudiante != null) ? ResponseEntity.ok(estudiante) : ResponseEntity.notFound().build();
    }

    @PutMapping("/estudiantes/{id}") // Nuevo endpoint para actualizar un estudiante
    public ResponseEntity<EstudianteDTO> actualizarEstudiante(@PathVariable Long id, @RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO estudianteActualizado = estudianteService.actualizarEstudiante(id, estudianteDTO);
        return (estudianteActualizado != null) ? ResponseEntity.ok(estudianteActualizado) : ResponseEntity.notFound().build();
    }
    @PostMapping("/estudiantes") // Nuevo endpoint para insertar un estudiante
    public ResponseEntity<EstudianteDTO> registrarEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO nuevoEstudiante = estudianteService.registrarEstudiante(estudianteDTO);
        return ResponseEntity.status(201).body(nuevoEstudiante);
    }
    @DeleteMapping("/estudiantes/{id}") // Nuevo endpoint para borrar un estudiante
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminarEstudiante(id);
        return ResponseEntity.noContent().build();
    }
}
