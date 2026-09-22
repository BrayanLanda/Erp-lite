# ERP Lite

Proyecto ERP modular construido con **Java 25**, **Spring Boot** y **Maven**. La aplicación web se encuentra en el módulo `erp-api`; los demás módulos separan las responsabilidades de la solución.

## Tecnologías

- Java 25
- Maven Wrapper
- Spring Boot 4.1.0
- Spring Web MVC (solo en `erp-api`)
- Lombok (compartido por todos los módulos)

## Estructura del proyecto

```text
erp-lite/
├── pom.xml                    # POM padre y agregador Maven
├── erp-common/                # Utilidades y elementos compartidos
├── erp-domain/                # Modelo y reglas de negocio
├── erp-application/           # Casos de uso de la aplicación
├── erp-infrastructure/        # Adaptadores e implementaciones técnicas
└── erp-api/                   # API HTTP y aplicación Spring Boot
```

Las dependencias entre módulos siguen esta dirección:

```text
erp-common → erp-domain → erp-application → erp-infrastructure
                                      ↘              ↙
                                           erp-api
```

`erp-api` contiene la clase de inicio:

```text
com.carolan.erp_lite.ErpLiteApplication
```

## Requisitos

- JDK 25
- No es necesario instalar Maven globalmente: el repositorio incluye Maven Wrapper.

Comprueba la versión de Java:

```bash
java -version
```

## Compilar el proyecto

Desde la raíz del repositorio:

```bash
./mvnw clean verify
```

En Windows:

```bat
mvnw.cmd clean verify
```

## Ejecutar la API

Desde la raíz, inicia solo el módulo web junto con los módulos que necesita:

```bash
./mvnw -pl erp-api -am spring-boot:run
```

La API queda disponible en `http://localhost:8080`.

También puedes empaquetarla y ejecutar el JAR:

```bash
./mvnw -pl erp-api -am clean package
java -jar erp-api/target/erp-api-0.0.1-SNAPSHOT.jar
```

## Desarrollo por módulo

Para compilar un módulo y sus dependencias, usa `-pl` (seleccionar proyecto) y `-am` (incluir proyectos requeridos). Por ejemplo:

```bash
./mvnw -pl erp-application -am compile
```

Spring Web se declara exclusivamente en `erp-api`. Los módulos de dominio, aplicación e infraestructura no dependen de Spring Web, para mantener la lógica del ERP desacoplada de la capa HTTP.
