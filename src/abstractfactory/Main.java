package abstractfactory;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory;

        String theme = "dark"; // change to "light" to test

        if (theme.equalsIgnoreCase("dark")) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        TextBox textbox = factory.createTextBox();
        button.paint();
        checkbox.paint();
        textbox.paint();
    }
}