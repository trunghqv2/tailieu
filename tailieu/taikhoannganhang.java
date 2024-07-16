
public class taikhoannganhang {
    
    private double soDu;
    

    public void napTien(double soTien){
        soDu = soDu + soTien;
    }

    public void rutTien(double soTien){
        soDu = soDu - soTien;
    }
     
    public double getSoDu() {
        return soDu;
    }

}

