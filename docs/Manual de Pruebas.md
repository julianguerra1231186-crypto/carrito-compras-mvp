# 🧪 Manual de Pruebas -- Carrito de Compras MVP

Este documento describe las pruebas funcionales realizadas sobre los
módulos implementados en el backend del proyecto.

------------------------------------------------------------------------

# 1. Prueba de creación de usuario

## Endpoint

`POST /api/usuarios`

## Body de ejemplo

``` json
{
  "nombre": "Julian",
  "apellido": "Guerra",
  "email": "julian@example.com",
  "telefono": "3001234567",
  "direccion": "Neiva, Huila"
}
```

## Resultado esperado

El sistema debe crear un nuevo usuario.

Debe responder con código 201 Created.

------------------------------------------------------------------------

# 2. Prueba de consulta de usuarios

## Endpoint

`GET /api/usuarios`

## Resultado esperado

El sistema debe listar los usuarios registrados.

------------------------------------------------------------------------

# 3. Prueba de creación de producto

## Endpoint

`POST /api/productos`

## Body de ejemplo

``` json
{
  "nombre": "Mouse Logitech",
  "descripcion": "Mouse inalámbrico",
  "precio": 85000.00,
  "stock": 15
}
```

## Resultado esperado

El sistema debe crear un nuevo producto.

Debe responder con código 201 Created.

------------------------------------------------------------------------

# 4. Prueba de consulta de productos

## Endpoint

`GET /api/productos`

## Resultado esperado

El sistema debe listar los productos registrados.

------------------------------------------------------------------------

# 5. Prueba de creación de factura

## Endpoint

`POST /api/facturas`

## Body de ejemplo

``` json
{
  "fecha": "2026-03-17T20:30:00",
  "total": 0,
  "usuarioId": 1
}
```

## Resultado esperado

El sistema debe crear una nueva factura asociada a un usuario existente.

Debe responder con código 201 Created.

------------------------------------------------------------------------

# 6. Prueba de consulta de facturas

## Endpoint

`GET /api/facturas`

## Resultado esperado

El sistema debe listar las facturas registradas con su usuario asociado.

------------------------------------------------------------------------

# 7. Prueba de creación de detalle de factura

## Endpoint

`POST /api/detalles-factura`

## Body de ejemplo

``` json
{
  "facturaId": 1,
  "productoId": 1,
  "cantidad": 2
}
```

## Resultado esperado

El sistema debe crear el detalle de factura.

Debe calcular el subtotal.

Debe actualizar automáticamente el total de la factura.

------------------------------------------------------------------------

# 8. Prueba de consulta de detalles por factura

## Endpoint

`GET /api/detalles-factura/factura/1`

## Resultado esperado

El sistema debe listar los detalles asociados a la factura indicada.
