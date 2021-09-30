package modelo;

public class Casa {
    
    private int id;
    private int idProprietario;
    private int numero_de_quartos;
    private Integer valor;
    private String endereco;        
    private Boolean situação;  
    
    public Casa(int idProprietario, String endereco, int numero_de_quartos, Integer valor, Boolean situação) {
        this.idProprietario = idProprietario;
        this.endereco = endereco;
        this.numero_de_quartos = numero_de_quartos;      
        this.valor = valor;
        this.situação = situação;
    }

    public Casa() {
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(int idProprietario) {
        this.idProprietario = idProprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero_de_quartos() {
        return numero_de_quartos;
    }

    public void setNumero_de_quartos(int numero_de_quartos) {
        this.numero_de_quartos = numero_de_quartos;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Boolean getSituação() {
        return situação;
    }

    public void setSituação(Boolean situação) {
        this.situação = situação;
    }

}
