# 🛒 Carrito de Compras MVP

![Backend](https://img.shields.io/badge/Proyecto-Backend-blue)
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring_Boot](https://img.shields.io/badge/Spring%20Boot-Framework-6DB33F)
![MySQL](https://img.shields.io/badge/MySQL-Base%20de%20Datos-4479A1)
![Estado](https://img.shields.io/badge/Estado-En%20Desarrollo-yellow)
![Modalidad](https://img.shields.io/badge/Trabajo-Individual-purple)

## 📑 Índice

- [1. Descripción general](#1-descripción-general)
- [2. Objetivo del proyecto](#2-objetivo-del-proyecto)
- [3. Alcance funcional](#3-alcance-funcional)
- [4. Tecnologías utilizadas](#4-tecnologías-utilizadas)
- [5. Módulos del MVP](#5-módulos-del-mvp)
- [6. Estructura documental](#6-estructura-documental)
- [7. Flujo de trabajo con Git y GitHub](#7-flujo-de-trabajo-con-git-y-github)
- [8. Ambientes del proyecto](#8-ambientes-del-proyecto)
- [9. Historias de Usuario relacionadas](#9-historias-de-usuario-relacionadas)
- [10. Estado actual](#10-estado-actual)
- [11. Ejecución esperada del proyecto](#11-ejecución-esperada-del-proyecto)
- [12. Autoría](#12-autoría)

---

## 1. Descripción general

**Carrito de Compras MVP** es un proyecto académico individual orientado al desarrollo de un backend que permita modelar un flujo básico de compras. Su propósito es demostrar la construcción ordenada de funcionalidades mínimas de negocio, el uso de control de versiones con Git y GitHub, la organización por ambientes y la documentación del proceso de desarrollo.

El proyecto se enfoca exclusivamente en el backend y está planteado como un **Producto Mínimo Viable (MVP)**, priorizando la implementación de los módulos esenciales solicitados en el trabajo.

---

## 2. Objetivo del proyecto

Desarrollar un backend funcional para un carrito de compras MVP que permita gestionar usuarios clientes, productos, facturas y detalles de factura, aplicando una estructura de trabajo ordenada, documentación técnica básica y un flujo controlado de integración entre ambientes de desarrollo, validación y liberación.

---

## 3. Alcance funcional

En esta primera versión del proyecto se implementarán únicamente los siguientes procesos:

- creación de usuarios clientes
- creación de productos
- creación de facturas
- creación de detalles de factura

Este alcance corresponde al núcleo mínimo del sistema y servirá como base para futuras ampliaciones.

---

## 4. Tecnologías utilizadas

El proyecto será desarrollado con las siguientes tecnologías:

- **Java 21**
- **Spring Boot**
- **MySQL**
- **Git**
- **GitHub**

Estas herramientas permitirán construir una API backend sencilla, estructurada y alineada con buenas prácticas de desarrollo.

---

## 5. Módulos del MVP

### 👤 Módulo de usuarios
Permitirá registrar usuarios clientes dentro del sistema.

### 📦 Módulo de productos
Permitirá registrar productos con la información necesaria para ser facturados.

### 🧾 Módulo de facturas
Permitirá crear facturas asociadas a un cliente.

### 📋 Módulo de detalle de factura
Permitirá registrar los productos incluidos en una factura, junto con sus cantidades y valores correspondientes.

---

## 6. Estructura documental

La documentación inicial del proyecto se organizará dentro de la carpeta `docs/`.

```text
docs/
├── README_PROYECTO.md
├── historias_usuario.md
└── ambientes.md
```

Posteriormente podrán agregarse otros documentos como weekly, evidencias de GitHub, manual de pruebas y reflexión final.

---

## 7. Flujo de trabajo con Git y GitHub

Para este proyecto se utilizará una estrategia simple basada en ramas que represente el paso por ambientes:

- `develop` → ambiente de desarrollo
- `qa` → ambiente de validación
- `main` → ambiente final o liberación

Las funcionalidades se trabajarán en ramas `feature/*`, por ejemplo:

- `feature/documentacion-mvp`
- `feature/hu-01-usuarios`
- `feature/hu-02-productos`
- `feature/hu-03-facturas`
- `feature/hu-04-detalle-factura`

Cada funcionalidad deberá desarrollarse en su propia rama, integrarse primero en `develop`, luego validarse en `qa` y finalmente promoverse a `main`.

---

## 8. Ambientes del proyecto

### DEV
Ambiente destinado al desarrollo activo de nuevas funcionalidades.

### QA
Ambiente destinado a la revisión y validación de las funcionalidades implementadas.

### MAIN
Ambiente final que representa la versión estable del proyecto.

Este flujo permitirá simular de manera académica un proceso básico de promoción de cambios entre ambientes.

---

## 9. Historias de Usuario relacionadas

El desarrollo del MVP se organizará a partir de Historias de Usuario que permitan relacionar cada módulo con una necesidad funcional concreta.

Historias base del proyecto:

- **HU-01:** Crear usuario cliente
- **HU-02:** Crear producto
- **HU-03:** Crear factura
- **HU-04:** Crear detalle de factura

Estas historias serán detalladas en el documento `docs/historias_usuario.md`.

---

## 10. Historias de usuario implementadas

- HU-01 Crear usuario
- HU-02 Crear producto
- HU-03 Crear factura
- HU-04 Crear detalle de factura

---

## 11. Estado actual del proyecto

Actualmente el proyecto cuenta con los siguientes módulos implementados:

- Gestión de usuarios
- Gestión de productos
- Gestión de facturas
- Gestión de detalle de factura

---

## 12. Ejecución esperada del proyecto

La meta de esta primera entrega es contar con un backend funcional que permita demostrar:

- persistencia de usuarios clientes
- persistencia de productos
- creación de facturas
- asociación de detalles a una factura
- organización del trabajo por ramas
- evidencia del paso por ambientes
- documentación clara del proceso

---

## 13. Autoría

Proyecto académico individual desarrollado como evidencia práctica de construcción de software backend, documentación y control de versiones.

---

## 14. Flujo de ambientes

El proyecto simula tres ambientes de trabajo:

- `develop` → ambiente DEV
- `qa` → ambiente QA
- `main` → ambiente MAIN

Flujo aplicado:
`feature/* -> develop -> qa -> main`