package aula04;

/**
 * @author mDanielSE
 */
public class aula04 {

    public static void main(String[] args) {

        /*if(args.length > 0)
            System.out.println(args[0]);
        else
            System.out.println("Nenhum argumento encontrado");
         */
        try {
            System.out.println(args[0]);
            double valor = Double.parseDouble(args[0]);
            System.out.println(valor);
        } catch (Exception e){
            System.out.println(e.getClass());
        }
        
        
        /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nenhum argumento encontrado ");
        } catch (NumberFormatException e) {
            System.out.println("valor invalido");
        } finally {
            System.out.println("Obrigado");
        }*/

    }

}
