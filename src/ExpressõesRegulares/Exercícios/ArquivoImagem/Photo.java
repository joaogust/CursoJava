package ExpressõesRegulares.Exercícios.ArquivoImagem;

public class Photo {

    private final int sequential;
    private final int year;
    private final String city;

    public Photo(int sequential, int year, String city) {
        this.sequential = sequential;
        this.year = year;
        this.city = city;
    }

    public int getSequential() {
        return sequential;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "sequential=" + sequential +
                ", year=" + year +
                ", city='" + city + '\'' +
                '}';
    }

    public static Photo createPhoto(String arq) {
//        IMG_00019-2018-New_York.jpg

        var scanner = new java.util.Scanner(arq);

        scanner.useDelimiter("[-.]");

        String sequentialString = scanner.next().replaceAll("[^0-9]", "");
        int sequential = Integer.parseInt(sequentialString);

        String yearString = scanner.next();
        int year = Integer.parseInt(yearString);

        String city = scanner.next();

        return new Photo(sequential, year, city);
    }
}
