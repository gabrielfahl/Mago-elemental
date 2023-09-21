public class Main {
    public static void main(String[] args) {
        Cajado cajadao = new Cajado();

        PedraAgua agua = new PedraAgua();
        PedraFogo fogo = new PedraFogo();       
        PedraTerra terra = new PedraTerra();
        PedraAr ar = new PedraAr();

        cajadao.poderelemental(ar, ar);
        cajadao.poderelemental(fogo, ar);
        cajadao.poderelemental(fogo, terra);
        cajadao.poderelemental(agua, terra);
        cajadao.poderelemental(ar, agua);
    }
}