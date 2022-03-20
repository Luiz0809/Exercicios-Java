package Lista05;
public class Colaborador {
  private String nome;
  private String cargo;
  private Double salario;

  public Colaborador(){}
  
    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

  
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Colaborador\n" + "nome = " + nome + "\ncargo = " + cargo + "\nsalario = " + salario;
    }
}
