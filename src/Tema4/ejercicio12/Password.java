package ejercicio12;

/*
Diseñar una clase llamada Password con las características:
        - Atributos:
                - Longitud. Por defecto, será de 8.
                - Contraseña
        - Constructores:
                - Un constructor por defecto. Generará una contraseña de 8 caracteres.
                - Un constructor con la longitud que nosotros le pasemos.
        - Métodos:
                - esFuerte(): devuelve un booleano indicando si la contraseña es fuerte o no.
                                Para que sea fuerte debe tener más de 2 mayúsculas, más de 1
                                minúscula y más de 3 dígitos.
                - generarPassword(): genera la contraseña del objeto con la longitud que tenga.
                                [Privado]
                - get para contraseña y longitud.
*/

import java.util.Objects;
import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
        this.contrasena = generarPassword(8);
    }
    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword(longitud);
    }

    public boolean esFuerte(Password entrada) {
        int may = 0, min = 0, dig = 0;
        for (int i = 0; i < entrada.longitud; i++) {
            if (entrada.getContrasena().charAt(i) >= 'A' && entrada.getContrasena().charAt(i) <= 'Z') {
                may++;
            } else if (entrada.getContrasena().charAt(i) >= 'a' && entrada.getContrasena().charAt(i) <= 'z') {
                min++;
            } else if (entrada.getContrasena().charAt(i) >= '0' && entrada.getContrasena().charAt(i) <= '9') {
                dig++;
            }
        }
        return may >= 2 && min >= 1 && dig >= 3;
    }
    private boolean esFuerte(String entrada) {
        int may = 0, min = 0, dig = 0;
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) >= 'A' && entrada.charAt(i) <= 'Z') {
                may++;
            } else if (entrada.charAt(i) >= 'a' && entrada.charAt(i) <= 'z') {
                min++;
            } else if (entrada.charAt(i) >= '0' && entrada.charAt(i) <= '9') {
                dig++;
            }
        }
        return may >= 2 && min >= 1 && dig >= 3;
    }

    public int getLongitud() {
        return longitud;
    }
    public String getContrasena() {
        return contrasena;
    }

    @Override // Solo el parámetro String Contraseña
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Password password1 = (Password) o;
        return Objects.equals(getContrasena(), password1.getContrasena());
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getContrasena());
    }

    private String generarPassword(int longitud) {
        Random crarRandom = new Random();
        String salida = "";
        char letra;
        int numero;

        for (int i = 0; i < longitud; i++) {
            numero = crarRandom.nextInt(3) + 1;
            switch (numero) {
                case 1: // No incluyen la ñ, por ahora...
                    letra = (char) (crarRandom.nextInt(90-65+1)+65);
                    salida += letra;
                    break;
                case 2:
                    letra = (char) (crarRandom.nextInt(122-97+1)+97);
                    salida += letra;
                    break;
                default:
                    numero = crarRandom.nextInt(10);
                    salida += numero;
            }
        }
        if (esFuerte(salida)) {
            System.out.println("La contraseña generada es Fuerte");
        } else {
            System.out.println("La contraseña generada no es Fuerte");
        }
        return salida;
    }
}
