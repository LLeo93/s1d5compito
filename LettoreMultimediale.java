import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci tipo elemento (1 = Immagine, 2 = Audio, 3 = Video): ");
            int tipo = Integer.parseInt(scanner.nextLine());
            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1 -> {
                    System.out.print("Luminosità: ");
                    int lum = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, lum);
                }
                case 2 -> {
                    System.out.print("Durata: ");
                    int dur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int vol = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Audio(titolo, dur, vol);
                }
                case 3 -> {
                    System.out.print("Durata: ");
                    int dur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int vol = Integer.parseInt(scanner.nextLine());
                    System.out.print("Luminosità: ");
                    int lum = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, dur, vol, lum);
                }
                default -> {
                    System.out.println("Tipo non valido.");
                    i--;
                }
            }
        }

        int scelta;
        do {
            System.out.println("Scegli l'elemento da eseguire (1-5), 0 per uscire: ");
            scelta = Integer.parseInt(scanner.nextLine());

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale el = elementi[scelta - 1];

                if (el instanceof Immagine img) {
                    img.show();
                } else if (el instanceof Riproducibile r) {
                    r.play();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}
