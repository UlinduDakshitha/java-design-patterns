package abstractfactory;

public class DarkThemeFactory implements GUIFactory {

    public Button createButton() {
        return new DarkButton();
    }

    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
    public TextBox createTextBox() {
        return new DarkTextbox();
    }
}