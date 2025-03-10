package ExpressõesRegulares.Exercícios.ArquivoImagem;

public class PhotoApp {

    public static void main(String[] args) {

        Photo photo1 = Photo.createPhoto("IMG_00011-2004-Sao_Paulo.jpg");
        Photo photo2 = Photo.createPhoto("IMG_00042-1976-Rio_de_Janeiro.jpg");
        Photo photo3 = Photo.createPhoto("IMG_00019-2018-New_York.jpg");

        System.out.println(photo1);
        System.out.println(photo2);
        System.out.println(photo3);
    }
}
