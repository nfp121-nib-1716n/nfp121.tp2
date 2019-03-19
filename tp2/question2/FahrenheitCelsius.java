package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author Christina Kamel
 * @version 1.0
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] temperaturesEnFahrenheit){
            int temperatureEnFahrenheitEntier = 0;
            double temperatureEnCelsiusDouble;
            for (String temperatureEnFahrenheit : temperaturesEnFahrenheit){
                try{
                temperatureEnFahrenheitEntier = Integer.parseInt(temperatureEnFahrenheit);
                } catch (NumberFormatException nfe){
                    System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
                }
                temperatureEnCelsiusDouble = fahrenheitEnCelsius(temperatureEnFahrenheitEntier);
                System.out.println(temperatureEnFahrenheitEntier + "\u00B0F -> " + String.format("%.1f", temperatureEnCelsiusDouble) + "\u00B0C");
            }
    }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int temperatureEnFahrenheit){
         float temperatureEnCelsius = (((float)5)/((float)9))*(temperatureEnFahrenheit - 32);
         temperatureEnCelsius = ((int)(temperatureEnCelsius * 10))/10.0f;
         return temperatureEnCelsius;
     }

}
