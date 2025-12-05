package Exception;

public class NoFoodException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Еды не хватило - коротышка умер от голода";
    }
}
