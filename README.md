# QuePokemono

**QuePokemono** es una API desarrollada en Spring Boot que utiliza GraphQL para determinar qué Pokémon eres, basado en las respuestas a una encuesta de 5 preguntas.

## Características

- **API REST**: Implementada con Spring Boot.
- **GraphQL**: Para manejar consultas de datos.
- **Hibernate & JPA**: Para manejar la persistencia de datos.
- **Pruebas unitarias**: Con Spring Boot Test y Mockito.

## Funcionalidad

1. El usuario responde a 5 preguntas sobre características relacionadas con los Pokémon.
2. La API analiza las respuestas y devuelve el Pokémon que más se asemeja a las características proporcionadas.
3. Utiliza GraphQL para manejar las solicitudes y respuestas de la API.

## Tecnologías Utilizadas

- **Java 17+**: Lenguaje de programación utilizado.
- **Spring Boot**: Framework para la creación de la API.
- **Spring Data JPA**: Para la gestión de datos con Hibernate.
- **GraphQL**: Para la gestión de las consultas.
- **Mockito**: Para pruebas unitarias.
- **GitHub Actions**: Para integración continua.

## Cómo ejecutar

1. Clona este repositorio:
   ```bash
   git clone https://github.com/SrIrvin/QuePokemono.git
