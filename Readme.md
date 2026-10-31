# Bienvenidos

![Banner de github](./imagen/Banner-3.jpg)
***  

Desarrollaremos un proyecto Full Stack de una empresa Gestora de recursos humanos para la materia Desarrollo de Software y en colaboracion con el Trabajo de la materia Diseño de Sistemas

# Configuracion del entorno

configurar una cuenta en Github y aplicar configuraciones de autoria en tu entorno.
>> git config --global user.name "Tu Nombre"  
>>git config --global user.email "tu@email.com"

realizamos la creacion del proyecto base a traves de [Spring Boot initializer](https://start.spring.io/)  

<img src="imagen/spring-boot.png" width="200" alt="logo de spring boot">  

--- 
## Dependencias del proyecto
1. Spring WEB
2. Spring Data JPA
3. spring Doc
4. PostgreSQL Driver
5. Lombok (opcional)
6. bean validation
7. devtools
8. Flyway 
--- 
## 🗄️ Configuración de la capa de persistencia 


El proyecto utiliza **PostgreSQL 18** como sistema gestor de bases de datos. Para configurar correctamente la conexión con Spring Boot, se deben realizar los siguientes pasos.

---
Desde el entorno gráfico **pgAdmin** o mediante SQL Shell (psql), conectarse a la instancia de PostgreSQL 18 y ejecutar:

>  *CREATE DATABASE capital_humano;*   

### Configuracion del entorno de Spring
Debemos configurar algunas propiedades para garantizar la conexion de nuestra aplicacion a la bdd .

1. Crear variables de entorno en nuestro sistema con los datos usados durante la instalacion del gestor de Base de datos.
> crear la variable de entorno DB_capital_humano y asignar el valor de usuario correspondiente  
> configurar la contraseña utilizada durante la instalacion del gestor DB_capital_humano_pass

2. Configurar spring.datasource.username=${DB_capital_humano}
3. Configurar spring.datasource.password=${DB_capital_humano_pass}
4. Configurar el puerto usado y el motor a utilizar spring.datasource.url=jdbc:postgresql://localhost:5433/capital_humano

---