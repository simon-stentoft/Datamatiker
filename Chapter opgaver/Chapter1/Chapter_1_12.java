public class Chapter_1_12 {
    public static void main(String[] args) {

        double miles = 24;
        double km = miles*1.6;

        // Omregner mil til Kilometer, finder ud af hvor langt der køres på et sekund og finder derefter hvor langt der køres på en time
        // da 1 time er 3600 sekunder.
        double kmh = (24 * 1.6) / ((1*3600) + (40 * 60) + 35)*3600;
        System.out.println(kmh);
    }
}
