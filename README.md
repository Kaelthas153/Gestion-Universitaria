# Gestión Universitaria

## Descripción

Gestión Universitaria API es una aplicación desarrollada en **Spring Boot** con **Maven** que permite gestionar estudiantes, docentes y materias dentro de un sistema universitario. Proporciona endpoints REST para realizar operaciones CRUD sobre los diferentes modelos de datos.

## Tecnologías Utilizadas

- **Java 21**
- **Spring Boot**
- **Maven**
- **Lombok**
- **Spring Web**

## Estructura del Proyecto

```
/universidad
├── src/main/java/com/universidad
│   ├── controller
│   │   ├── EstudianteController.java
│   ├── dto
│   │   ├── EstudianteDTO.java
│   │   ├── DocenteDTO.java
│   │   ├── MateriaDTO.java
│   ├── model
│   │   ├── Persona.java
│   │   ├── Estudiante.java
│   │   ├── Docente.java
│   │   ├── Materia.java
│   ├── repository
│   │   ├── EstudianteRepository.java
│   ├── service
│   │   ├── IEstudianteService.java
│   │   ├── impl
│   │   │   ├── EstudianteServiceImpl.java
│   ├── UniversidadApplication.java
└── pom.xml
```

## Instalación y Ejecución

1. **Clonar el repositorio:**
   ```sh
   git clone https://github.com/Kaelthas153/Gestion-Universitaria.git
   ```
2. **Ingresar al directorio del proyecto:**
   ```sh
   cd Gestion-Universitaria
   ```
3. **Compilar el proyecto:**
   ```sh
   mvn clean install
   ```
4. **Ejecutar la aplicación:**
   ```sh
   mvn spring-boot:run
   ```

## Endpoints Disponibles

### Estudiantes

| Método | Endpoint                | Descripción                    |
| ------ | ----------------------- | ------------------------------ |
| GET    | `/api/estudiantes`      | Obtiene todos los estudiantes  |
| GET    | `/api/estudiantes/{id}` | Obtiene un estudiante por ID   |
| POST   | `/api/estudiantes`      | Registra un nuevo estudiante   |
| PUT    | `/api/estudiantes/{id}` | Actualiza un estudiante por ID |
| DELETE | `/api/estudiantes/{id}` | Elimina un estudiante por ID   |

##

#### Obtener todos los estudiantes
**GET** `/api/estudiantes`
Obtiene una lista de todos los estudiantes registrados en el sistema.

#### Obtener un estudiante por ID
**GET** `/api/estudiantes/{id}`
Obtiene la información de un estudiante específico a partir de su ID. Si el estudiante no existe, devuelve un error 404.

#### Registrar un nuevo estudiante
**POST** `/api/estudiantes`
Registra un nuevo estudiante en el sistema. Se requiere enviar un objeto JSON con los datos del estudiante.

#### Actualizar un estudiante
**PUT** `/api/estudiantes/{id}`
Actualiza los datos de un estudiante existente con el ID proporcionado. Si el estudiante no existe, devuelve un error 404.

#### Eliminar un estudiante
**DELETE** `/api/estudiantes/{id}`
Elimina un estudiante de la base de datos a partir de su ID. Si el estudiante no existe, devuelve un error 404.

