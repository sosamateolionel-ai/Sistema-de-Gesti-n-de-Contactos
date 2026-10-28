# Sistema de Gestión de Contactos

## Descripción

Este proyecto implementa una clase `Contacto` que permite almacenar y administrar la información de una persona, incluyendo su nombre, teléfono y correo electrónico. Utiliza encapsulamiento y validaciones para evitar que se asignen datos incorrectos a los campos de contacto.

## Funcionamiento

El programa realiza las siguientes operaciones:

1. Crea un contacto para `Lucía Fernández`, con su teléfono y correo electrónico iniciales.
2. Muestra la ficha inicial del contacto.
3. Actualiza el teléfono a `2615550000` y el correo a `lucia.nueva@correo.com`.
4. Intenta establecer un teléfono con letras y otro vacío; ambos cambios son rechazados.
5. Intenta establecer un correo sin el símbolo `@` y otro con valor `null`; ambos cambios son rechazados.
6. Muestra la ficha final con los últimos valores válidos.

## Clases principales

### Clase `Contacto`

Representa a una persona y administra sus datos de contacto.

**Atributos:**

* `nombre`: nombre de la persona.
* `telefono`: número telefónico de la persona.
* `email`: correo electrónico de la persona.

**Métodos principales:**

* `Contacto(String nombre, String telefono, String email)`: inicializa el contacto y utiliza los métodos de validación para asignar el teléfono y el correo.
* `getNombre()`: devuelve el nombre del contacto.
* `setTelefono(String nuevoTelefono)`: rechaza teléfonos nulos, vacíos o que contengan letras. Si el dato es válido, actualiza el teléfono y devuelve `true`.
* `setEmail(String nuevoEmail)`: rechaza correos nulos o que no contengan `@`. Si el dato es válido, actualiza el correo y devuelve `true`.
* `obtenerFicha()`: devuelve una cadena de texto con el nombre, el teléfono y el correo electrónico formateados.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos se declaran `private` para impedir el acceso directo desde otras clases.
* **Constructores:** permiten inicializar los datos del contacto.
* **Métodos de modificación (setters):** actualizan los atributos únicamente cuando los datos superan las validaciones.
* **Validación de cadenas:** se utilizan métodos como `trim()`, `isEmpty()` y `contains()`.
* **Recorrido de caracteres:** el método `setTelefono()` comprueba cada carácter para detectar letras.
* **Retorno booleano:** los setters informan si la modificación fue aceptada.
* **Representación de objetos:** `obtenerFicha()` devuelve los datos en una sola cadena de texto.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).

## Ejecución

<img width="677" height="602" alt="image" src="https://github.com/user-attachments/assets/359096ea-67d8-4ff1-ae56-c16bb88d30e3" />

## Resultado esperado

El programa debe aceptar los datos iniciales y las actualizaciones válidas. Los intentos de asignar teléfonos vacíos o con letras, así como correos sin `@` o nulos, deben rechazarse sin modificar los últimos valores válidos.

La ficha final debe mostrar:

```text
Lucía Fernández | Tel: 2615550000 | Email: lucia.nueva@correo.com
```

## Objetivo del ejercicio

Aplicar encapsulamiento y validación de datos para administrar la información de un contacto, asegurando que las modificaciones de teléfono y correo electrónico se realicen de forma controlada.

## Estructura del proyecto

```text
GestionContactos/
├── src/
│   ├── Contacto.java
│   └── Main.java
└── README.md
```
