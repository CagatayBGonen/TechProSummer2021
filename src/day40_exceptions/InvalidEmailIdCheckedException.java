package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {

    private static final long serialVersionUID = 1L;

    InvalidEmailIdCheckedException(String message){ // p'li const. create edildi.
        super(message);                             // bu sayede bu classtan olusan obj ile class'dan ve parentinden
                                                    // field ve variable call yapabilelim.
    }


}
