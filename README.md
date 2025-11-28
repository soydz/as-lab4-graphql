## 🚨 Panel Service - Sistema de Gestión de Alertas

### 📋 Descripción

Panel Service es un microservicio diseñado para gestionar y visualizar alertas de seguridad vehicular. Este proyecto se encarga de mostrar las alertas generadas por otro microservicio que se encarga de crear las alertas. Su propósito es recibir y mostrar las alertas en un panel de administración.



### 📂 Estructura del Proyecto

El proyecto está dividido en dos carpetas principales, que contienen el código del **backend** y el **frontend**:

- **[Frontend](./frontend)**: Código fuente para la interfaz de usuario. Esta carpeta contiene el proyecto de frontend donde se consumen las alertas proporcionadas por el backend.
  
- **[Backend](./backend)**: Código fuente para el servidor backend que maneja la lógica de negocio y consume los datos de una base de datos Postgres.
