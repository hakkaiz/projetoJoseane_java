
package butos;

/**
 *
 * @author hakk
 */
public class Alunos {
    
    protected String nome;
    protected String email;
    protected double telefone;
    protected double ra;

    public Alunos() {
    }

    public Alunos(String nome, String email, double telefone, double ra) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }
    
    
    
}
