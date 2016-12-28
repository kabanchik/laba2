public class vagon2 extends vagon {

    public void IzmenitxChisloMest(int NovoeChisloMest){
        ChisloMest = NovoeChisloMest;
    }

    @Override
    public void ZanyatxMesto(int NomerMesta) {
        if (Mesta[NomerMesta-1]==1) System.out.println("eto mesto yje zanyato:" + NomerMesta + "(Vagon number" + NomerEtogoVagona + ")" );
        super.ZanyatxMesto(NomerMesta);
    }

    @Override
    public void VagonInfo() {
        System.out.println("Vagon number " + NomerEtogoVagona);
        int a=0;
        for (int i=0;i<ChisloMest;i++)
            if (Mesta[i]==0) a++;
        System.out.println("Chislo svobodnix mest " + a );
        super.VagonInfo();
    }
}