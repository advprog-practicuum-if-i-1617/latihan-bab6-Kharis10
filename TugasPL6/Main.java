package TugasPL6;
public class Main {
    public static void main(String[] args) {
        SoEn s = new SoEn (3);
        ProMan p = new ProMan (2);
        ProMan p1 = new ProMan (6);
        ProMan p2 = new ProMan (11);
        System.out.println("Gaji Total SE : "+s.getGajiTotal());
        System.out.println("Gaji Total PM 1 : "+p.getGajiTotal());
        System.out.println("Gaji Total PM 2 : "+p1.getGajiTotal());
        System.out.println("Gaji Total PM 3 : "+p2.getGajiTotal());
    }
}
