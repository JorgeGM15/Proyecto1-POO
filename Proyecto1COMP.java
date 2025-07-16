import java.util.HashMap; // Importa la clase HashMap para usarla como estructura de datos

class Proyecto {

    // Clase anidada Libro que representa un libro con título y autor
    public class Libro {
        String titulo;  // Atributo para almacenar el título del libro
        String autor;   // Atributo para almacenar el autor del libro

        // Constructor vacío que establece valores predeterminados
        public Libro() {
            this.titulo = "Desconocido";  // Asigna "Desconocido" como valor predeterminado para el título
            this.autor = "Desconocido";   // Asigna "Desconocido" como valor predeterminado para el autor
        }

        // Constructor que recibe el título y el autor como parámetros
        public Libro(String titulo, String autor) {
            this.titulo = titulo;  // Inicializa el título con el valor recibido
            this.autor = autor;    // Inicializa el autor con el valor recibido
        }

        // Método toString que devuelve una representación en cadena del objeto Libro
        public String toString() {
            return "Título: " + titulo + ", Autor: " + autor;  // Devuelve el título y el autor del libro
        }
    }

    // Clase anidada Libreria que gestiona una colección de objetos Libro
    public class Libreria {
        HashMap<String, Libro> libros;  // Estructura de datos HashMap para almacenar los libros (clave: título, valor: objeto Libro)

        // Constructor vacío que inicializa la librería con una estructura de datos vacía
        public Libreria() {
            libros = new HashMap<>();  // Inicializa el HashMap para almacenar los libros
        }

        // Constructor que recibe un arreglo de libros iniciales y los agrega al HashMap
        public Libreria(Libro[] librosIniciales) {
            this.libros = new HashMap<>();  // Inicializa el HashMap
            for (Libro libro : librosIniciales) {
                libros.put(libro.titulo, libro);  // Agrega cada libro del arreglo al HashMap usando el título como clave
            }
        }

        // Método para agregar un libro al HashMap
        public void agregarLibro(Libro libro) {
            libros.put(libro.titulo, libro);  // Agrega el libro al HashMap, usando el título como clave
        }

        // Método para eliminar un libro del HashMap según el título
        public void eliminarLibro(String titulo) {
            libros.remove(titulo);  // Elimina el libro cuyo título coincida con la clave proporcionada
        }

        // Método para imprimir la lista de libros en la librería
        public void imprimirLibros() {
            // Verifica si el HashMap está vacío al comprobar si no hay elementos
            if (libros == null || libros.values().toArray().length == 0) {
                System.out.println("La librería está vacía.");  // Imprime un mensaje si la librería está vacía
            } else {
                // Recorre cada libro en el HashMap e imprime su información usando el método toString()
                for (Libro libro : libros.values()) {
                    System.out.println(libro);  // Imprime el libro (toString es llamado automáticamente)
                }
            }
        }
    }

    // Método main, el punto de entrada del programa
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto();  // Crea una instancia de Proyecto para acceder a las clases anidadas
        Libreria libreria = proyecto.new Libreria();  // Crea una instancia de la clase Libreria

        // Crea varias instancias de la clase Libro con diferentes títulos y autores
        Libro libro1 = proyecto.new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = proyecto.new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro3 = proyecto.new Libro("El Principito", "Saint Exupery");

        // Agrega los libros a la librería usando el método agregarLibro
        libreria.agregarLibro(libro1);  
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);

        // Imprime la lista de libros presentes en la librería
        System.out.println("Lista de libros en la librería:");
        libreria.imprimirLibros();  // Llama al método imprimirLibros para mostrar la colección

        // Elimina un libro de la librería por su título
        libreria.eliminarLibro("Cien años de soledad");

        // Imprime la lista de libros después de eliminar uno
        System.out.println("\nDespués de eliminar un libro:");
        libreria.imprimirLibros();  // Vuelve a imprimir la lista para reflejar la eliminación
    }
}