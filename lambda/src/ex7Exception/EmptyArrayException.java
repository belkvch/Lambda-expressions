package ex7Exception;

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Maccив пуст");
    }
}
