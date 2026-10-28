//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Contacto contacto = new Contacto("Lucía Fernández", "+54 261 456-7890", "lucia@correo.com");

    System.out.println("\nFicha inicial:");
    System.out.println(contacto.obtenerFicha());

    System.out.println("\n--- Valores correctos ---");
    contacto.setTelefono("2615550000");
    contacto.setEmail("lucia.nueva@correo.com");

    System.out.println("\n--- Valores incorrectos ---");
    contacto.setTelefono("261-ABC-1234");   // contiene letras
    contacto.setTelefono("");               // vacío
    contacto.setEmail("correo-sin-arroba"); // sin '@'
    contacto.setEmail(null);                // nulo

    System.out.println("\nFicha final:");
    System.out.println(contacto.obtenerFicha());

}
