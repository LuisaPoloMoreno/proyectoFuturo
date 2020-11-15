package proyecto_futuro;

public class Proyecto_Futuro {

    public static void main(String[] args) {

        int modulos;
        int horasEstudio;
        
        modulos=7;
        horasEstudio=17;

        String modulosX= String.valueOf(modulos);
        String horasEstudioX= String.valueOf(horasEstudio);
        
        String veredicto= Proyecto_Futuro.veredicto(modulosX, horasEstudioX);
       
        System.out.println("Estudiante " + args[0] + " " + args[1] + " " + args[2] + " " + args[3] + ": " + veredicto);

    }

    private static String veredicto(String valor1, String valor2) {

        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
        
    }

}
