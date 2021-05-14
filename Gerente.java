class Gerente extends Funcionario{
    private String usuario;
    private String senha;
    
    @Override
    public double bonificacaofunc()
    {
        return this.getSalario() * 0.6 + 100;
    }
    
    @Override
    public void Dados() {
        super.Dados();
        System.out.println("User: " + this.usuario);
        System.out.println("Senha: " + this.senha);
    }
    
    // GETTERS AND SETTERS             
}
