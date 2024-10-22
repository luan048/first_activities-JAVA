public class Zoo {
    public static void main(String[] args) {
        int qntAnimals = 5;
        String animal = "lions";

        /* Isso são operadores de atribuição compostos 
         * para não declarar uma variavel mais de 1 vez para modificar 
         * o seu valor, se usa +=, mesmo padrão para outros operadores
        */

        qntAnimals += 3;

        System.out.println("You have " + qntAnimals + " " + animal + " in your zoo");
    }
}
