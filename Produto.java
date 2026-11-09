public abstract class Produto {
    private Long id;
    private String nome;
    private double precoBase;
    private int quantidadeEstoque;

    public Produto() {}
    
    public Produto (Long id, String nome, double precoBase, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
        this.quantidadeEstoque = quantidadeEstoque;
    }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPrecoBase() {
            return precoBase;
        }

        public int getQuantidadeEstoque() {
            return quantidadeEstoque;
        }

        public void setQuantidadeEstoque(int quantidadeEstoque) {
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public abstract double calcularprecoFinal();

};
