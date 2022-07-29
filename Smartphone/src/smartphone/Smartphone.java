package smartphone;

import java.util.List;

public class Smartphone implements Callable,Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : urls) {
            if (containsNum(url)) {
                stringBuilder.append("Invalid URL!").append(System.lineSeparator());
            } else {
                stringBuilder.append(String.format("Browsing: %s!%n", url));
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String number : numbers) {
            if (!containsNum(number)) {
                stringBuilder.append("Invalid number!").append(System.lineSeparator());
            } else {
                stringBuilder.append(String.format("Calling... %s%n",number));
            }
        }
        return stringBuilder.toString();
    }
    
    private boolean containsNum(String text){
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
