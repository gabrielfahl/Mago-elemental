class Cajado {
    public void executarPoderElemental(PedraElemento pedra1, PedraElemento pedra2) {
        if (pedra1.tipo.equals(pedra2.tipo)) {
            System.out.println("Poder de " + pedra1.tipo);
        } else {
            if ((pedra1 instanceof PedraFogo && pedra2 instanceof PedraAr) ||
                (pedra1 instanceof PedraAr && pedra2 instanceof PedraFogo)) {
                System.out.println("Combustão");
            } else if ((pedra1 instanceof PedraFogo && pedra2 instanceof PedraTerra) ||
                       (pedra1 instanceof PedraTerra && pedra2 instanceof PedraFogo)) {
                System.out.println("Lava");
            } else if ((pedra1 instanceof PedraTerra && pedra2 instanceof PedraAgua) ||
                       (pedra1 instanceof PedraAgua && pedra2 instanceof PedraTerra)) {
                System.out.println("Planta");
            } else if ((pedra1 instanceof PedraAgua && pedra2 instanceof PedraAr) ||
                       (pedra1 instanceof PedraAr && pedra2 instanceof PedraAgua)) {
                System.out.println("Neve");
            }
        }
    }
}