import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MiniDiccionario {
    public static void main(String[] args) {

        // Declarando el diccionario español/inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("manzana",   "apple");
        diccionario.put("perro",     "dog");
        diccionario.put("silla",     "chair");
        diccionario.put("paraguas",  "umbrella");
        diccionario.put("espejo",    "mirror");
        diccionario.put("teclado",   "keyboard");
        diccionario.put("madera",    "wood");
        diccionario.put("azucar",    "sugar");
        diccionario.put("lunes",     "monday");
        diccionario.put("lagarto",   "lizard");
        diccionario.put("gato",      "cat");
        diccionario.put("ciudad",    "city");
        diccionario.put("hielo",     "ice");
        diccionario.put("ventana",   "window");
        diccionario.put("calabaza",  "pumpkin");
        diccionario.put("sombra",    "shadow");
        diccionario.put("lapiz",     "pencil");
        diccionario.put("arcoiris",  "rainbow");
        diccionario.put("trueno",    "thunder");
        diccionario.put("playa",     "beach");
        diccionario.put("flor",      "flower");

        // Guardando las palabras en un array, tomando 5 y usando shuffle para mostrarlas al azar
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras);
        ArrayList<String> seleccion = new ArrayList<>(palabras.subList(0, 5));

        // Guardando la puntuacion
        int correctas   = 0;
        int incorrectas = 0;

        // Estructura para el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Hola! Bienvenidx/Welcome a mi mini diccionario Español -> Inglés ===");
        System.out.println("Tendras 5 palabras en español. Traducelas correctamente para ver el mensaje secreto OwO\n");

        for (String palabra : seleccion) {
            System.out.println("Como se traduce al inglés '" + palabra + "'? -> ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            String traduccionCorrecta = diccionario.get(palabra).toLowerCase();

            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("Correcto!\n");
                correctas++;
            } else {
                System.out.println("Incorrecto :( La respuesta era: '" + traduccionCorrecta + "'\n");
                incorrectas++;
            }
        }

        scanner.close();
        System.out.println("== Resultado final ==");
        System.out.println("Correctas:   " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
        System.out.println("Puntaje: " + correctas + " / 5");

        if (correctas == 5) {
            System.out.println("\nSacaste todas correctas OwO Desbloqueaste el mensaje secreto!!!\n * Expande la consola para verlo completo *");
            System.out.println("""
                    
                    
                    
                    
                    
                    
                    
                    
                    
                                                                                                                .........                \s
                                                                                                                . .-%:..                 \s
                                                                                                                ....@*.. ...:*-..        \s
                            ..       ..    .                                                               .    ....%@-....:%@-..        \s
                    .........................                                                       .........   . ..@@-...:@@=. .. .. ...\s
                    ..........:=%%%%%#=......                                                       .........    ...=@*..:@@*............\s
                    .. ....+#%#=-----=#%-...                                                    .............   .....@#..@%#......-*#+...\s
                    .. ..-@#-....-===-.*@-..                                                    .....................:...-...:=*%@%*=:...\s
                    ....:@*:++=-======..#@..                                .......................:======:....:-+##*=-.....-@@#+:... ...\s
                    ....+@.-=+=+==+===..=@...                               .......::............=@@%#*%%%@@+-@@%#=-+%@@%-..++....       \s
                    ....-@=.=+==+=+=-...@%...                               ....+@@@@@@@*.......::-::::::::-%%*:::::::::*@%.....   .     \s
                    .....%%..:-==+-...=@#.... .....                     .....:#@@#++==+#@@+....##::::::::::::::::::::::::=@#..           \s
                    .....:%%=.........=@-..... .....                    ...-#@@*========+@@#..#@*:::::::::::::::::::::::::#@-.           \s
                     . ....=#@*=--+%%*=@#.....=%@%=:.... ...        .....-#@@#============#@@:%@::::::::::::::::::::::::::%@:.           \s
                        ......-####+:#@@@...-@@*=+%@#:.... .        ....#@@%===============*@@@@::::::::-=-*@@-*#-:::::::+@*.  .         \s
                                   ... -=..#@@======%@@*...............@@@+=================+@@-::::::::@@-....:%@#::::::-:......        \s
                                   ......:@@+=========#@@%=.......-#%%@@@====================#@%:::::::+@*.......+@#:::::::+%-...        \s
                                   .....=@#=============*%@@**#@@@@@@@@#====================%@*::::::::+@=........@@:::::::-#@+....      \s
                                   ....+@#================+##%*++=:========================@@=:::::::::-@%-......+@*:::::::::+-......    \s
                                    ..+@%=====================.....=======================@@-:::::::::::-%@*===+@@#::::::::::--......    \s
                                    .*@%======================.....:======================@@:::::::::::::::#%%%#=::::::::::::@%......    \s
                                    .*%=======================......======================@@::::::::::::::::::::::::::::::::*@+......    \s
                                    ..========================.......=====================#@*:::::::::::::::::::::::::::-=#%@#.....      \s
                            ....   ..-========================.. .....=====================#@%*=-::::::==:::::::::::::-%%#+=:....        \s
                            .:=--::.:========================... ......-================++==+#%%@@@@@*+@@-::::::::::*#.......            \s
                            .+@@@@@%-=======================:... ........-=============@@@%======-%@++%@@+:::::::::+@*.......            \s
                              ...--::=======================...............============@@@=======+@%++@@#@+:::::::::-........            \s
                                ....:======================................#@+==================+%@@@@@@@@@%+.::*%*:.........            \s
                            .....:=++=====================:.......=%@@%*+*@@@::===============*%@#=-...-=*@@@@@@*=:..........            \s
                            ..=@@@@@@+====================...====%@@###%@@@%:...::-==========*@@*..........=#@@#...... ......            \s
                            . -**-....=========@@@@+=====...:#@@@%@*=+=+=*@#... ......----=+%@@@.............=@@*.... .......            \s
                                   .-@#========@@@@=====:.........@@==++=*@@:. .        ..@@@@@@#:..         .@@@....                    \s
                                   ..%@#========+=====-...........-@%=+=+=@@*..         .....%@@@@:.         .@@@....                    \s
                                   ...+@%+==========-..............+@@*==+%@*.             .:@@%-:..        ..@@@....                    \s
                                   ....:*@%#+===-::.................-%@#+*@@:...           .*@@%.....       .-@@= ..                     \s
                                    . ...:*%@@%#@@@@@@@@@=..   ..   ..=#@@@=                .@@@=....   .....#@@.                        \s
                                        ......-+#@@@@%%*=...        .....:..                .:@@@%..    . ..-@@+                         \s
                                           ... :@@@:....  .           . . .                 ..@@@@..  . ...-@@%.                         \s
                                            ...-@@#:.::.                                    ..@@@:.......=%@@#..                         \s
                                            ....+@@@@@@*.  .                ..  .     .  . ...+@@@#*%%@@@@@#-........                    \s
                                                ..:--+@@=...                ........:-=*#+.....-#@@##@##@@+:.........                    \s
                                                ......@@%. .    .. . . .. ...::-=#@@@@@%@@@=:.:-@@@.:@@*+#%@#:.......                    \s
                                                    ..*@@. .    ..........:#@@@@@@%*-....#@@@@@@@%...:@@*++*@@+......                    \s
                                                    ..+@@. .    ....-*##:.#@@+-............-*%*=:......%@%**+%@-.....                    \s
                                                     .*@%.....:+##%@@@@@-.... . .         . . . . . ....-*@@%@%:.....                    \s
                                                     .*@@...-%@@@%*+=:......                        .......-=-......                     \s
                                                    ..=@@*.-@@%-.  .  .  .                          .... ...... . ..                     \s
                                                    ...*@@%@@%..                                    ...  ......  ....                    \s
                                                     . .:%@@+. .                                     .     ...     .                     \s
                                                        ........                                                                         \s
                                                        ........                                                                         \s
                    
                    
                    
                    
                    
                    
                    """);
        }
    }
}