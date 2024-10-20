public class Aumento {
    int salario;
    float aumento = 0.15f;

    public Aumento(int salario) {
        this.salario = salario;
    }

    public void aplicarAumento() {
        float novoSalario = salario + (salario * aumento);
        System.out.println("Seu novo salário, após o aumento é de: " + novoSalario);
    }

    public static void main(String[] args) {
        Aumento aumento = new Aumento(1500);
        aumento.aplicarAumento();
    }
}