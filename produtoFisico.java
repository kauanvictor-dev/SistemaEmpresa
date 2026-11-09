public class produtoFisico extends Produto {
    private double pesokg;
    private double valorFrete;

    public produtoFisico() {
      super();
    }
    
    public produtoFisico(Long id, String nome, double precoBase, 
        int quantidadeEstoque, double pesokg, double valorFrete) {
            super(id,nome,precoBase,quantidadeEstoque);
                this.pesokg = pesokg;
                this.valorFrete = valorFrete;
        }




}
