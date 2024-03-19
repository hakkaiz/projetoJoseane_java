
package butos;

/**
 *
 * @author hakk
 */
public class Curso {
    
   protected int id;
    protected String nome;
    protected String periodo;

    public Curso() {
    }

    public Curso(int id, String nome, String periodo) {
        this.id = id;
        this.nome = nome;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
}
