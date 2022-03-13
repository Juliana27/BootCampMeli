package praticaIntegradora3;

public class Pessoa {

    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;


    public int calcularIMC(double peso, double altura){
        double imc = peso/(Math.pow(altura,2));

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <=25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(int idade) {
        if (idade < 18) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return  "nome = " + nome +
                ", idade = " + idade +
                ", id = " + id +
                ", peso = " + peso +
                ", altura = " + altura;
    }

    public Pessoa() {}

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
