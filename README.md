# 🏨 Sistema de Servicios de Hospedaje y Gastronomía

---

## Alumno
**Nombre del alumno**: [SANTINO FERNANDEZ]

## 📄 Descripción del Proyecto

Este proyecto es un sistema de gestión diseñado para servicios de hospedaje y gastronomía, implementando conceptos de Programación Orientada a Objetos (POO) en Java. El objetivo es crear una aplicación que permita gestionar estos servicios, calcular precios finales con promociones, y validar atributos mediante excepciones cuando sea necesario.

### Objetivos
- Implementar un modelo orientado a objetos que refleje la gestión de servicios de hospedaje y gastronomía.
- Aplicar promociones y descuentos de forma dinámica.
- Validar la integridad de los datos utilizando excepciones adecuadas.

## 🛠️ Funcionalidades del Sistema

El sistema ofrece las siguientes funcionalidades:

### 1. Gestión de Hospedaje
- **Tipos de Habitaciones**: Administración de habitaciones estándar y deluxe.
- **Servicios Adicionales**: Opción de agregar servicios de limpieza y desayuno.
- **Aplicación de Descuentos**: Descuentos aplicables según la duración de la estadía.

### 2. Gestión de Gastronomía
- **Menús**: Posibilidad de agregar diferentes tipos de menús para los servicios de alimentación.
- **Cálculo de Precios**: Precios ajustables con descuentos según el tipo de comida y el día de la semana.

### 3. Promociones y Descuentos
- Implementación de promociones para estadías prolongadas.
- Penalizaciones por no cumplir con los requisitos establecidos, como el número mínimo de noches.

### 4. Validaciones
- Manejo de excepciones para situaciones como códigos duplicados, valores inválidos, y violaciones de las restricciones de negocio.

### 5. Cálculo de Precio Final
- Método para calcular el precio final del servicio, que incluye todas las promociones y servicios adicionales seleccionados.

## 📦 Estructura del Proyecto

El proyecto está compuesto por las siguientes clases y subclases:

### 1. **Servicio** (Clase Abstracta)
- **Atributos**:
   - `codigo`: Código del servicio.
   - `enPromocion`: Indica si esta o no en descuento el servicio.
   - `porcentajeDescuento`: Porcentaje de descuento del servicio.
- **Métodos Abstractos**:
   - `calcularPrecioFinal()`: Método que debe ser implementado en las subclases para calcular el precio final del servicio.

### 2. **Hospedaje** (Subclase de Servicio)
- **Atributos Específicos**:
   - `String` hospedaje : descripcion dle hospedaje.
   - `double` precioPorNoche : precio por noche de hospedaje.
- **Métodos**:
   - `calcularPrecioTotal()`: Calcula el precio final por noche basado en el dia donde se pide el servicio.

### 3. **Gastronomía** (Subclase de Servicio)
- **Atributos Específicos**:
   - `String` gastronomia :descripcion de la gastronomia.
   - `double` precio : precio del menu.
   - `int` diaSemDesc : numero del dia de la semana en el que hay descuento.
- **Métodos**:
   - `calcularPrecioFinal()`: Calcula el precio final de acuerdo con el dia de la semana en el que encontramos.

