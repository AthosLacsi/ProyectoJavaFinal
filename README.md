# Proyecto Java con Spring Boot

Este es un proyecto Java que utiliza Spring Boot para gestionar usuarios, productos y domicilios. El proyecto sigue una arquitectura basada en capas, donde se utiliza un modelo de datos con entidades JPA, servicios para la lógica de negocio, y mappers para convertir entre las entidades y sus respectivos DTOs.

## Estructura del Proyecto

El proyecto está dividido en varias capas, con las siguientes principales:

- **Modelo** (`model`): Contiene las entidades JPA (`User`, `Producto`, `Domicilio`).
- **DTO** (`DTO`): Objetos de transferencia de datos utilizados para interactuar con la API.
- **Mapper** (`mapper`): Convierte entre las entidades y sus DTOs.
- **Servicio** (`service`): Contiene la lógica de negocio para manejar las operaciones CRUD.
- **Repositorio** (`repository`): Interfaz para interactuar con la base de datos utilizando JPA.
- **Controlador** (`controller`): Gestiona las solicitudes HTTP.
- **Configuración** (`config`): Contiene la configuración de la aplicación y Swagger.
- **Pruebas** (`tests`): Pruebas básicas para verificar el correcto funcionamiento de la aplicación.

## Tecnologías Usadas

- **Spring Boot**: Framework para el desarrollo rápido de aplicaciones Java.
- **JPA (Jakarta Persistence API)**: Para la gestión de la persistencia de datos.
- **Swagger**: Para la documentación de la API REST.
- **H2 Database**: Base de datos en memoria para pruebas.
- **Lombok**: Para reducir el boilerplate de código.

## Endpoints Principales

- **GET /api/users**: Obtiene todos los usuarios.
- **GET /api/products**: Obtiene todos los productos.
- **POST /api/users**: Crea un nuevo usuario.
- **POST /api/products**: Crea un nuevo producto.

## Funcionalidades

1. **Usuarios**: Se pueden crear y consultar usuarios con su respectiva dirección.
2. **Productos**: Los productos están asociados a un usuario. Se pueden crear y consultar productos.
3. **Relaciones**:
   - Un usuario puede tener un domicilio (`OneToOne`).
   - Un producto está asociado a un usuario (`ManyToOne`).

## Iniciar la Aplicación

Para ejecutar el proyecto, sigue estos pasos:

1. Clona el repositorio:
   ```bash
   git clone <url_del_repositorio>
Navega al directorio del proyecto:

cd <nombre_del_proyecto>
Compila y ejecuta el proyecto utilizando Maven o tu IDE preferido:

mvn spring-boot:run
La aplicación estará disponible en http://localhost:8080.

Swagger
La API está documentada con Swagger. Para ver la documentación interactiva, visita:

http://localhost:8080/swagger-ui.html
Pruebas
El proyecto incluye pruebas básicas para verificar que el contexto de Spring se cargue correctamente. Puedes ejecutarlas usando Maven:

mvn test
