# 📘 Historias de Usuario

## 📑 Índice

- [1. Introducción](#1-introducción)
- [2. Criterios generales](#2-criterios-generales)
- [3. Historias de Usuario del MVP](#3-historias-de-usuario-del-mvp)
  - [HU-01 Crear usuario cliente](#hu-01--crear-usuario-cliente)
  - [HU-02 Crear producto](#hu-02--crear-producto)
  - [HU-03 Crear factura](#hu-03--crear-factura)
  - [HU-04 Crear detalle de factura](#hu-04--crear-detalle-de-factura)
- [4. Priorización](#4-priorización)

---

## 1. Introducción

Este documento reúne las Historias de Usuario definidas para el proyecto **Carrito de Compras MVP**. Su objetivo es describir de forma clara las necesidades funcionales que serán implementadas en esta primera versión del sistema.

Las historias se redactan con un enfoque académico y servirán como base para organizar el desarrollo por módulos, ramas y evidencias de trabajo.

---

## 2. Criterios generales

Para este MVP se manejará un alcance funcional reducido, concentrado en cuatro capacidades principales:

- registro de usuarios clientes
- registro de productos
- creación de facturas
- creación de detalles de factura

Cada historia incluye una descripción breve y criterios de aceptación básicos.

---

## 3. Historias de Usuario del MVP

### HU-01 — Crear usuario

**Como** administrador del sistema
**Quiero** registrar usuarios clientes
**Para** permitir su gestión dentro del carrito de compras y asociarlos posteriormente a una factura.

#### Criterios de aceptación
- Se debe poder crear un usuario cliente.
- El usuario debe tener datos básicos obligatorios.
- El sistema debe validar que no falten campos requeridos.
- El usuario debe almacenarse correctamente en base de datos.
- El usuario podrá ser usado después en la creación de facturas.

---

### HU-02 — Crear producto

**Como** administrador del sistema
**Quiero** registrar productos
**Para** que puedan ser usados posteriormente en la generación de facturas.

#### Criterios de aceptación
- Se debe poder crear un producto.
- El producto debe tener nombre, precio y stock.
- El precio no puede ser negativo.
- El stock no puede ser negativo.
- El producto debe poder consultarse en un listado.

---

### HU-03 — Crear factura

**Como** administrador del sistema  
**Quiero** generar una factura asociada a un cliente  
**Para** registrar una operación de compra dentro del sistema.

#### Criterios de aceptación
- El sistema debe permitir crear una factura.
- La factura debe estar asociada a un cliente existente.
- La factura debe almacenar su información principal de forma correcta.
- El registro debe persistirse correctamente en base de datos.

---

### HU-04 — Crear detalle de factura

**Como** administrador del sistema  
**Quiero** agregar productos a una factura  
**Para** registrar cantidades y valores correspondientes a la compra realizada.

#### Criterios de aceptación
- El sistema debe permitir registrar un detalle asociado a una factura existente.
- El detalle debe asociar un producto existente.
- El detalle debe registrar cantidad y subtotal.
- El detalle debe quedar persistido correctamente.

---

## 4. Priorización

El orden de implementación recomendado para este MVP es el siguiente:

1. **HU-01 — Crear usuario cliente**
2. **HU-02 — Crear producto**
3. **HU-03 — Crear factura**
4. **HU-04 — Crear detalle de factura**

Este orden permite respetar dependencias funcionales, ya que primero deben existir clientes y productos antes de registrar facturas y sus detalles.

---

# Estado de Historias de Usuario

| Código | Historia de Usuario | Estado |
|--------|----------------------|--------|
| HU-01 | Crear usuario | Implementada |
| HU-02 | Crear producto | Implementada |
| HU-03 | Crear factura | Implementada |
| HU-04 | Crear detalle de factura | Implementada |

# Trazabilidad de implementación

- HU-01: implementada en la rama `feature/hu-01-usuarios`
- HU-02: implementada en la rama `feature/hu-02-productos`
- HU-03: implementada en la rama `feature/hu-03-facturas`
- HU-04: implementada en la rama `feature/hu-04-detalle-factura`