package TugasPL6;
public class ProMan extends Pegawai {
    public ProMan(int masaKerja) {
        super(masaKerja);
    }

    public long getTunjangan() {
        return 6000000;
    }

    @Override
    public long getBonus() {
        return super.getBonus()+450000; //To change body of generated methods, choose Tools | Templates.
    }
    
    public long getApresiasi(){
        if (super.getLamaKerja()>=10){
            return 700000;
        }
        else
            return 225000;
    } 

    @Override
    public long getGajiTotal() {
        return super.getGajiPokok()+getTunjangan()+getBonus()+getApresiasi(); //To change body of generated methods, choose Tools | Templates.
    }        
}
