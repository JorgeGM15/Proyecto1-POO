# Sistema de Gestión de Librería en Java (Ejemplo de POO)

Este repositorio contiene un proyecto en Java de la **Programación Orientada a Objetos (POO)**. El programa simula la gestión de una librería, permitiendo agregar, eliminar y mostrar libros.

---

## 📜 Descripción del Proyecto

El sistema está compuesto por dos clases principales anidadas dentro de una clase `Proyecto`:
* **`Libro`**: Representa un libro con atributos de `título` y `autor`.
* **`Libreria`**: Gestiona una colección de objetos `Libro` utilizando un `HashMap` para un acceso eficiente por título.

El programa principal (`main`) crea una instancia de la librería, añade varios libros, los muestra, elimina uno y vuelve a mostrar el estado final de la colección.

---

## ✨ Conceptos Demostrados

* **Programación Orientada a Objetos**:
    * **Clases y Objetos**: Definición de plantillas y creación de instancias.
    * **Encapsulación**: Agrupación de datos y métodos relacionados dentro de una clase.
    * **Constructores**: Métodos especiales para inicializar objetos.
* **Estructuras de Datos**:
    * Uso de `HashMap` para almacenar datos de forma asociativa (clave-valor), permitiendo búsquedas y eliminaciones eficientes.

---

## 🗂️ Versiones del Código

Este repositorio incluye dos versiones del mismo programa:

1.  **`Proyecto1COMP.java`**: La versión **completa y documentada**. Incluye comentarios detallados y constructores adicionales que la hacen más robusta y flexible.
2.  **`Proyecto1-POO.java`**: Una versión **minimalista** y sin comentarios, que contiene solo el código esencial para que el programa funcione como se muestra en el `main`.

---

## 🚀 Cómo Compilar y Ejecutar

1.  Asegúrate de tener el **JDK (Java Development Kit)** instalado.
2.  Abre una terminal o consola de comandos en el directorio del proyecto.
3.  **Compila** el archivo Java:
    ```bash
    javac Proyecto1COMP.java
    ```
    *(Puedes usar cualquiera de los dos archivos, ya que la clase principal se llama `Proyecto` en ambos)*.

4.  **Ejecuta** el programa compilado:
    ```bash
    java Proyecto
    ```
