public class EjercicioTema9 {
    public static void main(String[] args) {

        Cliente usuario = new Cliente();
        usuario.setLaEdad(34);
        usuario.setElTelefono(7634567);
        usuario.setElNombre("Jose Perez");
        usuario.setElCredito(5000);

        System.out.println("Nombre : " + usuario.getElNombre());
        System.out.println("Edad : " + usuario.getLaEdad());
        System.out.println("Telefono : " + usuario.getElTelefono());
        System.out.println("Credito : " + usuario.getElCredito() + " Euros");

        System.out.println("____________________________________");

        Trabajador alexander = new Trabajador();
        alexander.setLaEdad(23);
        alexander.setElTelefono(7543212);
        alexander.setElNombre("Alexander romero");
        alexander.setSalario(2000);

        System.out.println("Nombre : " + alexander.getElNombre());
        System.out.println("Edad : " + alexander.getLaEdad());
        System.out.println("Telefono : " + alexander.getElTelefono());
        System.out.println("Credito : " + alexander.getSalario() + " Euros");
    }

}
class Persona {
    private int laEdad;
    private String elNombre;
    private int elTelefono;

    public int getLaEdad() {
        return laEdad;
    }
    public void setLaEdad(int laEdad) {
        this.laEdad = laEdad;
    }
    public String getElNombre() {
        return elNombre;
    }
    public void setElNombre(String elNombre) {
        this.elNombre = elNombre;
    }
    public int getElTelefono() {
        return elTelefono;
    }
    public void setElTelefono(int elTelefono) {
        this.elTelefono = elTelefono;
    }

}

class Cliente extends Persona {
    private int elCredito;

    public int getElCredito() {
        return elCredito;
    }

    public void setElCredito(int elCredito) {
        this.elCredito = elCredito;
    }

}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}