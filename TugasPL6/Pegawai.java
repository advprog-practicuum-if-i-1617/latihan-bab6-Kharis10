package TugasPL6;
public class Pegawai {
    private long gajiPokok = 2500000;
    private long bonus;
    private int masaKerja;

    public Pegawai(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public long getGajiPokok() {
        return gajiPokok;
    }

    public long getBonus() {
        if (getLamaKerja()>=5)
            bonus = 250000;
        else
            bonus = 0;
            return bonus;
    }
    
    public int getLamaKerja(){
        return masaKerja;
    }

    public long getGajiTotal(){
        return getGajiPokok()+getBonus();
    }
}
