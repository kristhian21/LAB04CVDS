package hangman.model.exceptions;

public class GameScoreException extends Exception{
    
    public static final String PARAMETROS_NEGATIVOS = "Alguno de los parametros ingresados es negativo";

    public GameScoreException(String message){
        super(message);
    }
}
