# language: es
Característica: Ejercicio 2

  Escenario: Creacion de usuario
    Dado que el usuario ingrese a orangeHRM con el usuario admin y contrasena admin123 e ingrese al control de usuarios
    Cuando cree un usuario
      | rol | nombreEmpleado | nuevoNombreUsuario | estado | nuevaContrasena | confirmarNuevaContrasena |
      | rol | nombreEmpleado | nuevoNombreUsuario | estado | nuevaContrasena | confirmarNuevaContrasena |
    Entonces deberia verlo en la lista de usuarios
    Y luego debe poder borrarlo

