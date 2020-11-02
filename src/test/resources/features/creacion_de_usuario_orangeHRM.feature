# language: es
Característica: Ejercicio 2: creacion de usuario

  Escenario: Creacion de usuario
    Dado que el usuario ingrese a orangeHRM con el usuario admin y contrasena admin123 e ingrese al control de usuarios
    Cuando cree un usuario
      | rol   | nombreEmpleado | nuevoNombreUsuario | estado  | nuevaContrasena | confirmarNuevaContrasena |
      | Admin | Anthony Nolan  | USUARIO_           | Enabled | contrasena54321 | contrasena54321          |
    Entonces deberia verlo en la lista de usuarios
    Y luego debe poder borrarlo

