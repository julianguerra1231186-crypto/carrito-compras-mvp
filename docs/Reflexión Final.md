# 🧠 Reflexión Final – Carrito de Compras MVP

El desarrollo del proyecto Carrito de Compras MVP permitió aplicar de forma práctica conceptos de backend, organización por historias de usuario, manejo de ramas en GitHub y control del ciclo de desarrollo por ambientes.

Uno de los aspectos que salió bien fue la construcción del sistema por módulos, ya que primero se definió el alcance, luego se documentó el proyecto y después se implementaron progresivamente los componentes principales: usuarios, productos, facturas y detalle de factura. Esto permitió mantener orden y trazabilidad durante el proceso.

Entre las principales dificultades estuvo la relación entre entidades, especialmente al momento de conectar factura con usuario, y detalle de factura con producto y factura. También fue importante resolver la lógica de negocio para calcular subtotales y actualizar el total de la factura. Estas dificultades se solucionaron implementando el proyecto por capas, validando cada módulo de manera individual y realizando pruebas funcionales paso a paso.

Como aprendizaje principal, el proyecto dejó una mejor comprensión de cómo estructurar un backend en Spring Boot, cómo trabajar con persistencia en MySQL, cómo documentar un proyecto técnico y cómo usar GitHub no solo como repositorio, sino como herramienta para organizar el trabajo mediante ramas, commits y pull requests.

Finalmente, este proceso permitió entender la importancia de validar antes de liberar, por lo que la simulación de ambientes DEV, QA y MAIN fue clave para representar un flujo de trabajo más cercano a un entorno profesional.