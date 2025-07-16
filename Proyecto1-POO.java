import java.util.HashMap;

class Proyecto {

    public class Libro {
        String titulo;
        String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String toString() {
            return "Título: " + titulo + ", Autor: " + autor;
        }
    }

    public class Libreria {
        HashMap<String, Libro> libros;

        public Libreria() {
            libros = new HashMap<>();
        }

        public void agregarLibro(Libro libro) {
            libros.put(libro.titulo, libro);
        }

        public void eliminarLibro(String titulo) {
            libros.remove(titulo);
        }

        public void imprimirLibros() {
            if (libros == null || libros.values().toArray().length == 0) {
                System.out.println("La librería está vacía.");
            } else {
                for (Libro libro : libros.values()) {
                    System.out.println(libro);
                }
            }
        }
    }

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto();

        Libreria libreria = proyecto.new Libreria();

        Libro libro1 = proyecto.new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = proyecto.new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro3 = proyecto.new Libro("El Principito", "Saint Exupery");  

        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3); 

        System.out.println("Lista de libros en la librería:");
        libreria.imprimirLibros();

        libreria.eliminarLibro("Cien años de soledad");

        System.out.println("\nDespués de eliminar un libro:");
        libreria.imprimirLibros();
    }
}
