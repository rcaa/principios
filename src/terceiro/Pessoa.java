package terceiro;

import java.util.Date;

{private String cpf;private String email;private Date dataNascimento;private String logradouro;private String numero;private String cep;

}

public Pessoa(String nome,String cpf,String email,Date dataNascimento,String logradouro,String numero,String cep){public Pessoa(String nome,String cpf,String email,Date dataNascimento){super();this.nome=nome;this.cpf=cpf;this.email=email;this.dataNascimento=dataNascimento;this.logradouro=logradouro;this.numero=numero;this.cep=cep;}}

public String getNome()@@-55,28+48,4 @@public Date getDataNascimento(){public void setDataNascimento(Date dataNascimento){this.dataNascimento=dataNascimento;}

public String getLogradouro(){return logradouro;}

public void setLogradouro(String logradouro){this.logradouro=logradouro;}

public String getNumero(){return numero;}

public void setNumero(String numero){this.numero=numero;}

public String getCep(){return cep;}

public void setCep(String cep){this.cep=cep;}}