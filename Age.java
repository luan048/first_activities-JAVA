public class Age {
    int age;

    public Age(int age) {
        this.age = age;
    }

    public void verifyAge() {
        if(age >= 18) {
            System.out.println("You are legal age! Welcome to our page");
        }

        else {
            int legalAge = 18 - age;
            System.out.println("You aren't legal age! in " + legalAge + " years Come back here!");
        }
    }

    public static void main(String[] args) {
        Age age = new Age(14);
        age.verifyAge();
    }
}
