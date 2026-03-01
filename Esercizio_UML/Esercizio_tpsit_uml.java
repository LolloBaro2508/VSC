public class Materia {
    private String nome;
    private String siglaIdentificativa;

    public Materia(String nome, String siglaIdentificativa) {
        this.nome = nome;
        this.siglaIdentificativa = siglaIdentificativa;
    }

    public String getNome() {
        return nome;
    }

    public String getSiglaIdentificativa() {
        return siglaIdentificativa;
    }
}
public class Insegnante {
    private String nome;
    private String cognome;
    private String dataDiNascita;
    private Materia materia;

    public Insegnante(String nome, String cognome, String dataDiNascita, Materia materia) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public Materia getMateria() {
        return materia;
    }
}
public class Voto {
    private String data;
    private Materia materia;
    private double valore;

    public Voto(String data, Materia materia, double valore) {
        this.data = data;
        this.materia = materia;
        this.valore = valore;
    }

    public String getData() {
        return data;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getValore() {
        return valore;
    }
}
public class Scuola {
    private String nome;
    private Insegnante insegnante;
    private Studente studente;

    public Scuola(String nome, Insegnante insegnante, Studente studente) {
        this.nome = nome;
        this.insegnante = insegnante;
        this.studente = studente;
    }

    public String getNome() {
        return nome;
    }

    public Insegnante getInsegnante() {
        return insegnante;
    }

    public Studente getStudente() {
        return studente;
    }
}
public class Studente {
    private String nome;
    private String cognome;
    private String dataDiNascita;

    public Studente(String nome, String cognome, String dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }
}
