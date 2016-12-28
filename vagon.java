public class vagon {

    protected int ChisloMest=36;
    protected int [ ] Mesta;
    public int NomerEtogoVagona;

    public void PustojVagon(int NomerVagona) {
        NomerEtogoVagona=NomerVagona;
        Mesta = new int[ChisloMest];
        for (int i=0;i<ChisloMest;i++) Mesta[i]=0;
        // 0 - priznak togo, 4to mesto svobodno
    }

    public int MestoZanyato(int NomerMesta) {
        return Mesta[NomerMesta-1];
    }

    public void ZanyatxMesto(int NomerMesta) {
        Mesta[NomerMesta-1]=1;
        // 1 - priznak,togo, 4to mesto zanyato
    }

    public void VagonInfo() {
        System.out.println("information about free numbers");
        for (int i=0;i<ChisloMest;i++)
            if (Mesta[i]==0) System.out.print((i+1)+" ");
        System.out.println("");
    }

}
