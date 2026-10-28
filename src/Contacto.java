public class Contacto {

    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = "";
        this.email = "";
        setTelefono(telefono); // reutiliza la validación del setter
        setEmail(email);       // reutiliza la validación del setter
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setTelefono(String nuevoTelefono) {

        if (nuevoTelefono == null || nuevoTelefono.trim().isEmpty()) {
            System.out.println("Teléfono rechazado: no puede estar vacío.");
            return false;
        }

        for (char c : nuevoTelefono.toCharArray()) {
            if (Character.isLetter(c)) {
                System.out.println("Teléfono rechazado: \"" + nuevoTelefono + "\" contiene letras.");
                return false;
            }
        }

        telefono = nuevoTelefono;
        System.out.println("Teléfono actualizado a " + telefono + ".");
        return true;
    }

    public boolean setEmail(String nuevoEmail) {

        if (nuevoEmail == null || !nuevoEmail.contains("@")) {
            System.out.println("Correo rechazado: \"" + nuevoEmail + "\" no contiene '@'.");
            return false;
        }

        email = nuevoEmail;
        System.out.println("Correo actualizado a " + email + ".");
        return true;
    }

    public String obtenerFicha() {
        return nombre + " | Tel: " + telefono + " | Email: " + email;
    }
}