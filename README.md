# TP-GENERACIDAD-EXCEPCIONES-COLECCIONES
TP integrador

Sistema de almacenamiento
Objetivo: Crear un sistema de almacenamiento genérico que maneje diferentes tipos de
datos (documentos, productos y usuarios), utilizando colecciones de datos específicas
según el caso y manejando excepciones cuando ocurran errores, como la duplicación de
claves o la eliminación de un elemento inexistente.
Definir clases de entidades:
● Documento: Con propiedades como título, contenido y autor.
● Producto: Con propiedades como nombre, precio y categoría.
● Usuario: Con propiedades como nombreUsuario, email y contraseña.
Implementar la clase genérica de almacenamiento:
● Clase genérica que maneja operaciones comunes como agregar, obtener y
eliminar entidades, utilizando una colección específica:
○ Para Documento, se recomienda usar una lista (List) para almacenar
múltiples documentos.
○ Para Producto, se sugiere usar un diccionario (Dictionary) donde la
clave sea el nombre del producto.
○ Para Usuario, utilizar un conjunto (Set) para asegurar que no haya
usuarios duplicados por email.
Manejo de Excepciones:
1. Lanzar una excepción Excepciones.ElementoDuplicadoException cuando se intente agregar
un elemento con una clave ya existente.
2. Lanzar una excepción ElementoNoEncontradoException al intentar eliminar o
buscar un elemento inexistente.
Uso del almacenamiento genérico:
1. Crear instancias de Almacenamiento para Documento, Producto y Usuario.
2. Agregar, obtener y mostrar elementos de cada tipo.
3. Manejar las excepciones para capturar y tratar los errores correspondientes.
Múltiples parámetros de tipo:
1. Introducir un parámetro de tipo para las claves bajo las cuales se almacenarán las
entidades.
○ Para Producto, la clave podría ser el nombre del producto (String).
○ Para Usuario, la clave podría ser el email (String).
2. Añadir un tercer parámetro de tipo para almacenar metadatos o etiquetas
adicionales sobre las entidades, como la fecha de creación o categorías de
productos, lo que puede facilitar las búsquedas o el filtrado por criterios adicionales.


Sistema de catálogo multimedia
Objetivo: Crear un sistema de catálogo multimedia genérico para almacenar diferentes
tipos de medios (libros, películas y música), utilizando colecciones de datos específicas
según el caso y manejando excepciones cuando ocurran errores, como la duplicación de
claves o la eliminación de un medio inexistente.
Definir clases de entidades:
● Libro: Propiedades como título, autor, ISBN y número de páginas.
● Película: Propiedades como título, director, duración y año de
lanzamiento.
● Música: Propiedades como título, artista, álbum y género.
Implementar la clase genérica de catálogo:
● Clase genérica que maneje operaciones comunes como agregar, obtener y
eliminar elementos, utilizando diferentes colecciones:
○ Para Libro, usar una lista (List) para almacenar varios libros.
○ Para Película, utilizar un diccionario (Dictionary) donde la clave sea el
título.
○ Para Música, emplear un conjunto (Set) para evitar duplicados de
canciones según el título y artista.
Manejo de Excepciones:
1. MedioDuplicadoException: Se lanza cuando se intenta agregar un medio que
ya existe según la clave.
2. MedioNoEncontradoException: Se lanza cuando se intenta buscar o eliminar un
medio inexistente.
Uso del catálogo multimedia genérico:
1. Crear instancias del catálogo para libros, películas y música.
2. Agregar, obtener y mostrar los elementos de cada tipo en el catálogo.
3. Manejar las excepciones para capturar los errores correspondientes.
Múltiples parámetros de tipo:
1. Clave personalizada: Añadir un parámetro de tipo adicional para las claves que
identifican cada medio:
○ Para Libro, la clave puede ser el ISBN (String).
○ Para Película, la clave puede ser el título (String).
○ Para Música, la clave puede ser una combinación de título y artista.
2. Metadatos adicionales: Incorporar un tercer parámetro de tipo que permita
almacenar información adicional, como etiquetas, categorías, o comentarios, lo que
facilita las búsquedas y categorizaciones de medios.
