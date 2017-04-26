package TugasPL6;
public class SoEn extends Pegawai {
    
    public SoEn(int masaKerja) {
        super(masaKerja);
    }

    
    public long getTunjangan() {
        return 5500000;
    }

    @Override
    public long getBonus() {
        return super.getBonus()+300000; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getGajiTotal() {
        return super.getGajiPokok()+getTunjangan()+getBonus(); //To change body of generated methods, choose Tools | Templates.
    }    
}
