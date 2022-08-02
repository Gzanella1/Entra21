public interface MeioTransporte {

    public boolean verificaOcupacao(String assento);
    public int quantidadeLivre();
    public void mostrarAsseentos();
    public Assento getAssento(String assento);
}
