# 🌐 Ambientes del Proyecto

## 📑 Índice

- [1. Propósito](#1-propósito)
- [2. Ambientes definidos](#2-ambientes-definidos)
  - [DEV](#dev)
  - [QA](#qa)
  - [MAIN](#main)
- [3. Flujo de promoción](#3-flujo-de-promoción)
- [4. Relación con ramas](#4-relación-con-ramas)
- [5. Objetivo académico del flujo](#5-objetivo-académico-del-flujo)

---

## 1. Propósito

Este documento describe la forma en que se simularán los ambientes del proyecto **Carrito de Compras MVP**. Su propósito es mostrar un flujo ordenado de desarrollo, validación y liberación, siguiendo un esquema básico de promoción de cambios entre ramas.

---

## 2. Ambientes definidos

### DEV

El ambiente **DEV** representa el espacio principal de desarrollo. En este ambiente se integran las funcionalidades construidas en ramas `feature/*` una vez cada módulo ha sido trabajado de forma individual.

En este proyecto, el ambiente DEV estará representado por la rama:

```text
develop
```

---

### QA

El ambiente **QA** representa el espacio de validación funcional. Aquí se revisa que los módulos integrados en desarrollo funcionen de manera correcta antes de considerar una liberación final.

En este proyecto, el ambiente QA estará representado por la rama:

```text
qa
```

---

### MAIN

El ambiente **MAIN** representa la versión estable o final del proyecto. A esta rama solo deben llegar funcionalidades previamente integradas y validadas.

En este proyecto, el ambiente MAIN estará representado por la rama:

```text
main
```

---

## 3. Flujo de promoción

El flujo definido para este proyecto será el siguiente:

```text
feature/* → develop → qa → main
```

Esto significa que:

1. Cada funcionalidad se desarrolla en una rama independiente `feature/*`.
2. Cuando una funcionalidad está terminada, se integra en `develop`.
3. Una vez validadas varias funcionalidades en desarrollo, los cambios se promueven a `qa`.
4. Después de la validación final, el proyecto se promueve a `main`.

---

## 4. Relación con ramas

Las ramas iniciales propuestas para el proyecto son:

- `feature/documentacion-mvp`
- `feature/hu-01-usuarios`
- `feature/hu-02-productos`
- `feature/hu-03-facturas`
- `feature/hu-04-detalle-factura`

Estas ramas permiten separar el trabajo por entregables y mantener trazabilidad entre la funcionalidad desarrollada y su integración posterior.

---

## 5. Objetivo académico del flujo

La simulación de ambientes en este proyecto tiene un propósito académico y formativo. Busca evidenciar:

- organización del trabajo por etapas
- uso correcto de ramas en Git y GitHub
- validación previa antes de liberar cambios
- disciplina en el proceso de desarrollo

Este enfoque permite presentar el proyecto no solo como una implementación técnica, sino también como un ejercicio de buenas prácticas de trabajo con control de versiones.
