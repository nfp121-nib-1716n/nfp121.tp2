package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author Christina Kamel
 * @version 1.0
 */
public class FahrenheitCelsius {

    /**
     * Cette applicatiob prend en parametre des temperatures en fahrenheit et affiche leurs valeurs en celsius
     * 
     * @param temperaturesEnFahrenheit : vecteur d'entiers
     *            ...
     */
    public static void main(String[] temperaturesEnFahrenheit) {
            int temperatureEnFahrenheitEntier;
            double temperatureEnCelsiusDouble;
            for (String temperatureEnFahrenheit : temperaturesEnFahrenheit){
                temperatureEnFahrenheitEntier = Integer.parseInt(temperatureEnFahrenheit);
                temperatureEnCelsiusDouble = fahrenheitEnCelsius(temperatureEnFahrenheitEntier);
                //
                //J'utilisera String.format(...) pour transformer le double en String avant de l'afficher car pour les
                //grands nombres, l'affichage du double directement donnera une notation scientifique/exponentielle(E).
                //Par exemple, si je donne comme parametre {"2147483647"} (la valeur maximale de int),
                //     * L'affichage du resultat sans String.format(...) est "2147483647°F -> 2.147483647E8°C". 
                //     * L'affichage du resultat apres String.format("%.1f", double)est "2147483647°F -> 1193046452.7°C".
                //
                System.out.println(temperatureEnFahrenheitEntier + "\u00B0F -> " + String.format("%.1f", temperatureEnCelsiusDouble) + "\u00B0C");
        }
    }

    /**
     * la méthode à compléter.
     * 
     * @param temperatureEnFahrenheit
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static double fahrenheitEnCelsius(int temperatureEnFahrenheit) {
        //J'utilisera un double pour plus de precision.
        double temperatureEnCelsius = (((double)5)/((double)9))*(temperatureEnFahrenheit - 32);
        //J'utilisera long au lieu de int pour supporter un plus grand nombre, dans le cas ou temperatureEnFahrenheit est tres grand.
        temperatureEnCelsius = ((long)(temperatureEnCelsius * 10))/10.0;
        return temperatureEnCelsius;
    }
}
