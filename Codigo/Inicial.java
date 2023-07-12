import javax.swing.JOptionPane;

public class Inicial {
   public static void main( String[] args ) {

      String menu;
      String[] conversor = {"Conversor de Moeda", "Conversor de Temperatura"};
      

      menu = (String)JOptionPane.showInputDialog( null, " Escolha a opção ", "Menu", 
                                                  JOptionPane.INFORMATION_MESSAGE, null,
                                                  conversor, conversor[0]);
      switch(menu){
         case "Conversor de Moeda":
            double moeda = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira um valor:", "Input", JOptionPane.DEFAULT_OPTION));
            String[] opcoesDeMoeda = {"Reais para Dólar", "Reais para Euro", "Reais para Libras Esterlinas", "Reais para Peso argentino", "Reais para Peso chileno",
                                     "Dólar para Reais", "Euro para Reais", "Libras Esterlinas para Reias", "Peso argentino para Reais", "Peso chileno para Reais"};

            String menuMoeda = (String)JOptionPane.showInputDialog(null,"Converter para qual moeda?", "Conversor",JOptionPane.DEFAULT_OPTION, null,
                                                                   opcoesDeMoeda, opcoesDeMoeda[0]);

         case "Temperatura": 
            String[] opcoes= {"Celcius p/ Fahrenheit"};  
         
            Temperatura.celciusToFahrenheit(0);
            break;
      }


      System.exit( 0 );
   }
}