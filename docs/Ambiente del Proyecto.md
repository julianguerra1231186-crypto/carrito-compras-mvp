# 🌿 Ambientes del Proyecto

## 📑 Índice

- [1. Descripción general](#1-descripción-general)
- [2. Ambientes principales](#2-ambientes-principales)
  - [DEV](#develop)
  - [QA](#qa)
  - [MAIN](#main)
- [3. Flujo por Historias de Usuario](#3-flujo-por-historias-de-usuario)
- [4. Interpretación del flujo](#4-interpretación-del-flujo)
- [5. Propósito metodológico](#5-propósito-metodológico)

---

# 🌿 Ambientes del Proyecto – Carrito de Compras MVP

## 1. Descripción general

El proyecto fue organizado utilizando una estrategia de ramas que permitió representar tanto los ambientes generales del sistema como el ciclo de vida individual de cada historia de usuario.

---

## 2. Ambientes principales

### develop
Corresponde al ambiente de desarrollo general del proyecto. En esta rama se consolidan las funcionalidades que ya fueron trabajadas en sus respectivas ramas funcionales.

### qa
Corresponde al ambiente de pruebas. Aquí se valida el comportamiento integrado del sistema antes de la liberación final.

### main
Corresponde al ambiente principal o final del proyecto. En esta rama se publica la versión consolidada del sistema.

---

## 3. Flujo por Historias de Usuario

Cada historia de usuario fue trabajada inicialmente en una rama funcional independiente y, posteriormente, se complementó con tres ramas derivadas que representan su ciclo interno:

- rama `-dev`: etapa de desarrollo de la historia de usuario
- rama `-qa`: etapa de validación de la historia de usuario
- rama `-release`: etapa de preparación o liberación de la historia de usuario

### Ejemplo

#### HU-01 Usuarios
- `feature/hu-01-usuarios`
- `feature/hu-01-usuarios-dev`
- `feature/hu-01-usuarios-qa`
- `feature/hu-01-usuarios-release`

#### HU-02 Productos
- `feature/hu-02-productos`
- `feature/hu-02-productos-dev`
- `feature/hu-02-productos-qa`
- `feature/hu-02-productos-release`

#### HU-03 Facturas
- `feature/hu-03-facturas`
- `feature/hu-03-facturas-dev`
- `feature/hu-03-facturas-qa`
- `feature/hu-03-facturas-release`

#### HU-04 Detalle de factura
- `feature/hu-04-detalle-factura`
- `feature/hu-04-detalle-factura-dev`
- `feature/hu-04-detalle-factura-qa`
- `feature/hu-04-detalle-factura-release`

---

## 4. Interpretación del flujo

Esta organización permite entender que cada funcionalidad tiene su propio recorrido de construcción, validación y preparación antes de formar parte del flujo general del proyecto.

Posteriormente, las funcionalidades ya consolidadas pasan por la ruta principal del sistema:

`develop -> qa -> main`

---

## 5. Propósito metodológico

El uso de ramas por historia de usuario y ramas principales por ambiente permitió simular un proceso de trabajo más cercano a un entorno real de desarrollo, separando responsabilidades y dejando trazabilidad del avance del proyecto.