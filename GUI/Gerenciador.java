import javax.swing.JOptionPane;

public class Gerenciador {
        public static void menu() {
                String selecionar;
                String[] conversor = { "Conversor de Moeda", "Conversor de Temperatura" };

                selecionar = (String) JOptionPane.showInputDialog(null, " Escolha a opção ", "Menu",
                                JOptionPane.INFORMATION_MESSAGE, null,
                                conversor, conversor[0]);
                if (selecionar == "Conversor de Moeda")
                        Moeda();
                Temperatura();
        }

        public static void Moeda() {
                double moeda = Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Insira um valor:", "Input",
                                                JOptionPane.DEFAULT_OPTION));
                if (moeda <= 0){
                        JOptionPane.showMessageDialog(null, "Valor inválido", "Message",
                                        JOptionPane.INFORMATION_MESSAGE);
                        recomecar();
                }
                String[] opcoesDeMoeda = { "Reais para Dólar", "Reais para Euro", "Reais para Libras Esterlinas",
                                "Reais para Peso argentino", "Reais para Peso chileno",
                                "Dólar para Reais", "Euro para Reais", "Libras Esterlinas para Reais",
                                "Peso argentino para Reais",
                                "Peso chileno para Reais" };

                String menuMoeda = (String) JOptionPane.showInputDialog(null, "Converter para qual moeda?", "Conversor",
                                JOptionPane.DEFAULT_OPTION, null,
                                opcoesDeMoeda, opcoesDeMoeda[0]);

                switch (menuMoeda) {
                        case "Reais para Dólar":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é $"
                                                                + String.format("%.2f", Moeda.reaisDolar(moeda)));
                                recomecar();
                                break;
                        case "Reais para Euro":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é €"
                                                                + String.format("%.2f", Moeda.reaisEuro(moeda)));
                                recomecar();
                                break;
                        case "Reais para Libras Esterlinas":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é £"
                                                                + String.format("%.2f", Moeda.reaisLibra(moeda)));
                                recomecar();
                                break;
                        case "Reais para Peso argentino":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é $" + String.format("%.2f",
                                                                Moeda.reaisPesoArgentino(moeda)));
                                recomecar();
                                break;
                        case "Reais para Peso chileno":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é $"
                                                                + String.format("%.2f", Moeda.reaisPesoChileno(moeda)));
                                recomecar();
                                break;
                        case "Dólar para Reais":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é R$"
                                                                + String.format("%.2f", Moeda.dolarReais(moeda)));
                                recomecar();
                                break;
                        case "Euro para Reais":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é R$"
                                                                + String.format("%.2f", Moeda.euroReais(moeda)));
                                break;
                        case "Libras Esterlinas para Reais":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é R$"
                                                                + String.format("%.2f", Moeda.libraReais(moeda)));
                                recomecar();
                                break;
                        case "Peso argentino para Reais":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é R$" + String.format("%.2f",
                                                                Moeda.pesoArgentinoReais(moeda)));
                                recomecar();
                                break;
                        case "Peso chileno para Reais":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é R$"
                                                                + String.format("%.2f", Moeda.pesoChilenoReais(moeda)));
                                recomecar();
                                break;
                }
        }

        public static void Temperatura() {
                double temperatura = Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Insira um valor:", "Input",
                                                JOptionPane.DEFAULT_OPTION));

                String[] opcoesDeTemparatura = { "Celcius para Fahrenheit", "Celcius para Kelvin",
                                "Fahrenheit para Kelvin",
                                "Fahrenheit para Celcius", "Kelvin para Fahrenheit",
                                "Kelvin para Celcius" };

                String menuTemperatura = (String) JOptionPane.showInputDialog(null, "Converter para qual temperatura?",
                                "Conversor",
                                JOptionPane.DEFAULT_OPTION, null,
                                opcoesDeTemparatura, opcoesDeTemparatura[0]);

                switch (menuTemperatura) {
                        case "Celcius para Fahrenheit":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é "
                                                                + String.format("%.2f", Temperatura
                                                                                .celciusToFahrenheit(temperatura)));
                                recomecar();
                                break;

                        case "Celcius para Kelvin":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é " + String.format("%.2f",
                                                                Temperatura.celciusToKelvin(temperatura)));
                                recomecar();
                                break;

                        case "Fahrenheit para Kelvin":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é "
                                                                + String.format("%.2f", Temperatura
                                                                                .fahrenheitToKelvin(temperatura)));
                                recomecar();
                                break;

                        case "Fahrenheit para Celcius":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é "
                                                                + String.format("%.2f", Temperatura
                                                                                .fahrenheitToCelcius(temperatura)));
                                recomecar();
                                break;

                        case "Kelvin para Fahrenheit":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é "
                                                                + String.format("%.2f", Temperatura
                                                                                .kelvinToFahrenheit(temperatura)));
                                recomecar();
                                break;

                        case "Kelvin para Celcius":
                                JOptionPane.showMessageDialog(null,
                                                "Resultado da conversão é " + String.format("%.2f",
                                                                Temperatura.kelvinToCelcius(temperatura)));
                                recomecar();
                                break;
                }
        }

        public static void recomecar() {
                //Object[] desejaContinua = { "Sim", "Nao", "Cancelar" };
                int caixaDeDialogo = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

                if(caixaDeDialogo == 0)
                        menu();
                if(caixaDeDialogo == 1){
                        JOptionPane.showMessageDialog(null, "Programa finalizado", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                }
                if(caixaDeDialogo == 2){
                        JOptionPane.showMessageDialog(null, "Programa concluido", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                }              
        }
}