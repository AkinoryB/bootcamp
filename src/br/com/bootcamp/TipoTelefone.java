package br.com.bootcamp;

public enum TipoTelefone {String, Interger, Boolean,
    COMERCIAL( descricao:"Comercial"),
    RESIDENCIAL(descricao:"Residencial"),
    CELULAR(descricao:"Celular");

    private String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "TipoTelefone" +
                "/ndescricao = " + descricao;
    }
}
